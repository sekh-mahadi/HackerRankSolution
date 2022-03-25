package Easy.LinkedLists;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DuplicateRemove {

	static class LinkedListNode {
		int data;
		LinkedListNode next;

		public LinkedListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		LinkedListNode head;

		public SinglyLinkedList() {
			this.head = null;
		}

		public void insert(int data) {
			LinkedListNode newNode = new LinkedListNode(data);
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

		public LinkedListNode removeDuplicate(LinkedListNode tNode) {
			LinkedListNode temp = null, index = null, current = tNode;

			if (tNode == null) {
				return tNode;
			} else {
				while (current != null) {
					temp = current;
					index = current.next;
					while (index != null) {

						if (index.data == current.data) {
							temp.next = index.next;
						} else {
							temp = index;
						}
						index = index.next;
					}
					current = current.next;
				}
			}
			return temp;
		}

		public LinkedListNode removeDuplicatesSortedList(LinkedListNode llist) {
			// Write your code here
			LinkedListNode current = llist;

			if (llist == null) {
				return llist;
			}
			while (llist.next != null) {
				
				if (llist.data == llist.next.data) {
					llist.next = llist.next.next;
				} else {
					llist = llist.next;
				}
			}
			return current;
		}

		public void printLinkedList(LinkedListNode tNode, BufferedWriter bw) throws IOException {
			bw = new BufferedWriter(new FileWriter(System.getenv("REMOVE_DUPLICATE")));
			while (tNode != null) {
				bw.write(tNode.data + " ");
				System.out.println("Data Item: " + tNode.data);
				tNode = tNode.next;
			}
			bw.close();
		}
	}

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("REMOVE_DUPLICATE")));
		System.out.println("NumberOf Test: ");
		int TESTS = scanner.nextInt();

		for (int i = 0; i < TESTS; i++) {
			SinglyLinkedList llist = new SinglyLinkedList();
			System.out.println("Number of List Item: ");
			int llistCount = scanner.nextInt();
			for (int j = 0; j < llistCount; j++) {
				System.out.println("Elament Of List: ");
				int llistItem = scanner.nextInt();
				llist.insert(llistItem);
			}
			// llist.printLinkedList(llist.head, bw);
			//LinkedListNode removeDup = llist.removeDuplicate(llist.head);
			LinkedListNode removeDupSortedList = llist.removeDuplicatesSortedList(llist.head);
			System.out.println("After Removing dulicate: ");
			//llist.printLinkedList(removeDup, bw);
			llist.printLinkedList(removeDupSortedList, bw);
		}
	}

}
