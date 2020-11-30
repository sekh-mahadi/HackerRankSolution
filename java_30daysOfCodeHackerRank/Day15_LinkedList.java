package java_30daysOfCodeHackerRank;

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class Day15_LinkedList {

    public static  Node insert(Node head,int data) {
        //Complete this method
        Node new_node = new Node(data);
        new_node.next = null;
        if(head == null){
            head = new_node;
            return head;
        }else{
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
            return head;
        }
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
