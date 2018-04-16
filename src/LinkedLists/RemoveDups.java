import java.util.*;

public class RemoveDups {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        int [] data = new int[]{1,2,3,4,5,5,1,8,2,1};
        Node head = makeList(data);
        printLinkedList(head);
        //deleteDups1(head);
        deleteDups2(head);
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

    // O(n^2)-time, O(1)-space
    static void deleteDups1(Node head){
        if(head == null) return;
        Node index1 = head;
        while(index1.next != null){
            Node index2 = index1;
            while(index2.next != null){
                //log(index1.data + "," + index2.data);
                if(index1.data == index2.next.data){
                    index2.next = index2.next.next;
                }else{
                   index2 = index2.next;
                }
            }
            index1 = index1.next;
        }
    }
    // O(n)-time, O(n)-space
    static void deleteDups2(Node head){
        HashSet<Integer> set = new HashSet<Integer>();
        Node prev = null;
        while(head != null){
            if(set.contains(head.data)){
                prev.next = head.next;
            }else{
                set.add(head.data);
                prev = head;
            }
            head = head.next;
        }
    }
}
