public class ReturnKthToLast {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        int[] data = new int[]{1,2,3,4,5,6,7,8,9,10};
        Node head = makeList(data);
        printLinkedList(head);
        //head = solution1(head, 2, 10);
        head = solution3(head, 2);
        printLinkedList(head);
    }

    static class Node{
        int data = 0;
        Node next = null;
        Node(int d){
            data = d;
        }
    }

    static Node makeList(int[] arr){
         Node head = null;
        for(int i=arr.length-1; i>=0; i--){
             if(head == null){
                 head = new Node(arr[i]);
             }else {
                 Node node = new Node(arr[i]);
                 node.next = head;
                 head = node;
             }
        }
        return head;
    }

    static void printLinkedList(Node head){
        Node tmp = head;
        while(tmp != null){
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    // list length is known
    static Node solution1(Node head, int k, int listLength){
        int length = listLength - k;
        while(length>0){
            head = head.next;
            length--;
        }
        return head;
    }

    static class Index{
        public int value = 0;
    }

    // recursive
    static Node solution2(Node head, int k){
       Index idx = new Index();
       return kthToLast(head, k, idx); 
    }

    static Node kthToLast(Node head, int k, Index idx){
        if(head == null){
            return null;
        }
        Node node = kthToLast(head.next, k, idx);
        idx.value = idx.value + 1;
        if(idx.value == k){
            return head;
        }
        return node;
    }

    // iterative
    static Node solution3(Node head, int k){
        Node index1 = head;
        Node index2 = head;

        int tmpK = k;
        while(tmpK > 0){
            index1 = index1.next;
            tmpK--;
        }
        while(index1 != null){
            index1 = index1.next;
            index2 = index2.next;
        }
        return index2;
    }

}
