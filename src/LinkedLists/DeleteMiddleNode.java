import java.util.*;

public class DeleteMiddleNode {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        int [] data = new int[]{1,2,3,4,5,6,7,8,9};
        Node head = makeList(data);
        printLinkedList(head);
        deleteNode(head.next.next.next);
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
    
    static boolean deleteNode(Node node){
        if(node == null)return false;
        Node nextNode = node.next;
        node.data = nextNode.data;
        node.next = nextNode.next;
        return true;
    }
}
