package logics;

import java.util.ArrayList;
import java.util.List;

public class DetectCycleInSinglyLinkedList {

    static Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;

        }
    }

    public static void main(String fasdf[]){

        DetectCycleInSinglyLinkedList list = new DetectCycleInSinglyLinkedList();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);

        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next;
//        list.detectAndRemoveLoop(head);
        System.out.println("Linked List after removing loop : ");
        list.printList(head);




    }

    private void printList(Node node) {

        List<Node> nodes = new ArrayList<>();
        while (node != null) {
            System.out.println("[ " + node.data + " " + node.next+ " ]");
            node = node.next;
            if(node != null && !nodes.contains(node.next))
                nodes.add(node.next);
            else{
                System.out.println("[ " + node.data + " " + node.next+ " ]");
                node.next = null;
                System.out.println("[ " + node.data + " " + node.next+ " ]");
                break;
            }

        }
    }
}
