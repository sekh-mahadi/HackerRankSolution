package Easy.LinkedLists;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class CompareLinkedList {

	static class LinkedListNode {
		public int data;
		public LinkedListNode next;

		public LinkedListNode(int d) {
			this.data = d;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public LinkedListNode head;
		public LinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			LinkedListNode node = new LinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
			}
			this.tail = node;
		}
	}

	public static void printLinkedList(LinkedListNode node, String sep, BufferedWriter bw) throws IOException {
		while (node != null) {
			bw.write(String.valueOf(node.data));
			node = node.next;

			if (node != null) {
				bw.write(sep);
			}
		}
	}

	static boolean compareLists(LinkedListNode head1, LinkedListNode head2) {

		while (head1 != null || head2 != null) {

			if (head1 == null || head2 == null) {
				return false;
			}

			if (head1.data != head2.data) {
				return false;
			}
			head1 = head1.next;
			head2 = head2.next;

		}
		return true;
	}

	
	static boolean compareListsRecursive(LinkedListNode head1, LinkedListNode head2) {
		
		if(head1==null && head2==null) {
			return true;
		}
		
		if (head1.data != head2.data) {
			return false;
		}
		return compareLists(head1.next, head2.next);
	}
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("COMPARED_LINKEDLIST"));

		System.out.println("Enter Number of Test: ");
		int tests = scanner.nextInt();
		// scanner.skip("(\r\n|[\n\r\\u2028\\u2029\\u0085])?");

		for (int testItr = 0; testItr < tests; testItr++) {

			SinglyLinkedList llist1 = new SinglyLinkedList();
			System.out.println("List Count 1: ");
			int llist1Count = scanner.nextInt();
			// scanner.skip("(\r\n|[\n\r\\u2028\\u2029\\u0085])?");

			for (int i = 0; i < llist1Count; i++) {
				System.out.println("List Item 1: ");
				int llist1Item = scanner.nextInt();
				// scanner.skip("(\r\n|[\n\r\\u2028\\u2029\\u0085])?");
				llist1.insertNode(llist1Item);
			}

			SinglyLinkedList llist2 = new SinglyLinkedList();
			System.out.println("List Count 2: ");
			int llist2Count = scanner.nextInt();
			for (int i = 0; i < llist2Count; i++) {
				System.out.println("List Item 2: ");
				int llist2Item = scanner.nextInt();
				llist2.insertNode(llist2Item);
			}
			boolean result = compareLists(llist1.head, llist2.head);
			//boolean result = compareListsRecursive(llist1.head, llist2.head);

			System.out.println(result);
			bw.write(String.valueOf(result ? 1 : 0));
			bw.newLine();
		}
		bw.close();
		scanner.close();
	}
}
