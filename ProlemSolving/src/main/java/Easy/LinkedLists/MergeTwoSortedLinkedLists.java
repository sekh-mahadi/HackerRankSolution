package Easy.LinkedLists;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MergeTwoSortedLinkedLists {

	static class LinkedListNode {
		public int data;
		public LinkedListNode next;

		public LinkedListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static class SinglyLinkedList {
		public LinkedListNode head;

		public SinglyLinkedList() {
			this.head = null;
		}

		public void insertNode(int data) {
			LinkedListNode node = new LinkedListNode(data);
			
			if (this.head == null) {
				this.head = node;
			} else {
				LinkedListNode current = head;
				while (current.next != null) {
					current = current.next;
				}
				current.next = node;
			}
		}

		public void printNode(LinkedListNode tNode) {

			while (tNode != null) {
				System.out.println("Node Data: " + tNode.data);
				tNode = tNode.next;
			}
		}

		public void printMergeLinkedList(LinkedListNode tNode, BufferedWriter bw) throws IOException {

			while (tNode != null) {
				bw.write(String.valueOf(tNode.data));
				System.out.println("Node Data: " + tNode.data);
				tNode = tNode.next;
				if (tNode != null) {
					bw.write(" ");
				}
			}
		}

		static LinkedListNode mergeSortLinkedList(LinkedListNode head1, LinkedListNode head2) {
			LinkedListNode result = new LinkedListNode(0);
			LinkedListNode newList = result;

			if (head1 == null) {
				return head2;
			}
			if (head2 == null) {
				return head1;
			}
			while (head1 != null && head2 != null) {
				if (head1.data <= head2.data) {
					newList.next = new LinkedListNode(head1.data);
					head1 = head1.next;
				} else {
					newList.next = new LinkedListNode(head2.data);
					head2 = head2.next;
				}
				newList = newList.next;
			}
			if (head1 == null && head2 != null) {
				newList.next = head2;
			}
			if (head2 == null && head1 != null) {
				newList.next = head1;
			}
			return result.next;
		}
	}

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("MERGE_TWO_LINKEDLISTs")));

		System.out.println("Enter Number of Test: ");
		int tests = scanner.nextInt();

		for (int testItr = 0; testItr < tests; testItr++) {
			SinglyLinkedList llist1 = new SinglyLinkedList();
			System.out.println("List Count 1: ");
			int llist1Count = scanner.nextInt();
			for (int i = 0; i < llist1Count; i++) {
				System.out.println("List Item 1: ");
				int llist1Item = scanner.nextInt();
				llist1.insertNode(llist1Item);
			}
			llist1.printNode(llist1.head);

			SinglyLinkedList llist2 = new SinglyLinkedList();
			System.out.println("List Count 2: ");
			int llist2Count = scanner.nextInt();
			for (int i = 0; i < llist2Count; i++) {
				System.out.println("List Item 2: ");
				int llist2Item = scanner.nextInt();
				llist2.insertNode(llist2Item);
			}
			llist2.printNode(llist2.head);
			LinkedListNode mergeLinkedList = SinglyLinkedList.mergeSortLinkedList(llist1.head, llist2.head);

			System.out.println("After merging two Linked List: ");
			SinglyLinkedList list = new SinglyLinkedList();
			list.printMergeLinkedList(mergeLinkedList, bw);
		}

	}
}
