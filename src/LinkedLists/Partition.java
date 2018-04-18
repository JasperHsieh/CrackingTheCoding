import java.util.*;

public class Partition {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        int [] data = new int[]{3,5,8,5,10,2,1};
        Node head = makeList(data);
        printLinkedList(head);
        partition(head, 5);
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

    static Node partition(Node head, int x){
        if(head == null)return null;
        Node tail = head;
        int length = 1;
        while(tail.next != null){
            tail = tail.next;
            length++;
        }
        Node index = new Node(99);
        index.next = head;
        head = index;
        //printLinkedList(head);
        for(int i=0; i<length; i++){
            System.out.println(index.next.data);
            if(index.next.data >= x){
                //add to tail
                System.out.println("add to tail");
                Node node = new Node(index.next.data);
                tail.next = node;
                tail = tail.next;
                //delete node
                index.next = index.next.next;
            }else{
                index = index.next;
            }
            
        }
        return head;
    }
}
