import java.util.*;

public class SumLists {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        int [] data1 = new int[]{7,1,6,1};
        int [] data2 = new int[]{5,9,2};
        Node head1 = makeList(data1);
        Node head2 = makeList(data2);
        printLinkedList(head1);
        printLinkedList(head2);
        Node head = sum(head1, head2);
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
    
    static Node sum(Node h1, Node h2){
        Node head = null;
        int quotient = 0;
        int reminder = 0;
        while(h1 != null || h2 != null){
            int number1 = 0;
            int number2 = 0;
            if(h1 != null)number1 = h1.data;
            if(h2 != null)number2 = h2.data;
            reminder = (quotient + number1 + number2)%10;
            quotient = (quotient + number1 + number2)/10;
            Node n = new Node(reminder);
            n.next = head;
            head = n;
            if(h1 != null)h1 = h1.next;
            if(h2 != null)h2 = h2.next;
        }
        return head;
    }
}
