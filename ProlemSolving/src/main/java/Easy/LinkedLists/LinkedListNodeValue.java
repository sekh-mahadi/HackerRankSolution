package Easy.LinkedLists;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import Easy.LinkedLists.MergeTwoSortedLinkedLists.LinkedListNode;

public class LinkedListNodeValue {

	static class LinkedListNode {
		public int data;
		public LinkedListNode next;

		public LinkedListNode(int data) {
			this.data = data;
			this.next = null;
		}

	}

	static class SinglyLinkedList {
		public LinkedListNode head;

		public SinglyLinkedList() {
			this.head = null;
		}

		public void inserNode(int nodeData) {

			LinkedListNode newNode = new LinkedListNode(nodeData);

			if (head == null) {
				this.head = newNode;
			} else {
				LinkedListNode current = head;
				while (current.next != null) {
					current = current.next;
				}
				current.next = newNode;
			}
		}

		public int getNode(LinkedListNode llist, int positionFromTail) {
			// Write your code here
			LinkedListNode current = llist;

			int count = 0;
			while (current != null) {
				current = current.next;
				count++;
				// current =current.next;
			}
			/*
			 * count -= positionFromTail; while (--count > 0) { llist = llist.next; }
			 */
			while(--count > positionFromTail) {
				llist = llist.next;
			}
			return llist.data;
		}

		public void printLinkedList(LinkedListNode tNode, BufferedWriter bw) throws IOException {

			while (tNode != null) {
				bw.write(String.valueOf(tNode.data));
				System.out.println("Node Data: " + tNode.data);
				tNode = tNode.next;
				if (tNode != null) {
					bw.write(" ");
				}
			}
		}
	}

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("GET_NODE_VALUE")));
		System.out.println("Number Of Test: ");
		int TESTS = scanner.nextInt();

		for (int t = 0; t < TESTS; t++) {
			SinglyLinkedList llist = new SinglyLinkedList();
			System.out.println("List Count: ");
			int listCount = scanner.nextInt();
			for (int i = 0; i < listCount; i++) {
				System.out.println("Element of Linked List: ");
				int llistItem = scanner.nextInt();
				llist.inserNode(llistItem);
			}
			System.out.println("Print List: ");
			llist.printLinkedList(llist.head, bw);
			System.out.println("Position from Tail: ");
			int position = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			// System.out.println("Result: ");
			int result = llist.getNode(llist.head, position);
			System.out.println(result);
		}
	}
}
