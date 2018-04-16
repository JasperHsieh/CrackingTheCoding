public class RemoveDups {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        int [] data = new int[]{1,2,3,4,5,5,1,8,2,1};
        Node head = makeList(data);
        printLinkedList(head);
        deleteDups(head);
        printLinkedList(head);
    }
    
    static class Node{
        int data = 0;
        Node next = null;

        Node(int d){
            data = d;
        }
    }

    static void printLinkedList(Node head){
        Node tmp = head;
        while(tmp != null){
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    static void log(String s){
        System.out.println(s);
    }

    static Node makeList(int[] arr){
        Node head = null;
        for(int i=arr.length-1; i>=0; i--){
             //log(arr[i] + "");
             if(head == null){
                 //log("head is null");
                 head = new Node(arr[i]);
             }else {
                 Node node = new Node(arr[i]);
                 node.next = head;
                 head = node;
             }
        }
        //printLinkedList(head);
        return head; 
    }

    static void deleteDups(Node head){
        if(head == null) return;
        Node index1 = head;
        while(index1.next.next != null){
            Node index2 = index1;
            while(index2.next != null){
                log(index1.data + "," + index2.data);
                if(index1.data == index2.next.data){
                    index2.next = index2.next.next;
                }
                index2 = index2.next;
                if(index2 == null){
                    log("break");
                    break;
                } 
            }
            index1 = index1.next;
            if(index1.next == null)break; 
        }
    }

}
