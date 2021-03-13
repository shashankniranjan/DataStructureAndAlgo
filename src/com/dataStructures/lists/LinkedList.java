package com.dataStructures.lists;

public class LinkedList {

	Node head;
	Node tail;

	int length;

	class Node {

		int value;
		Node next;

		Node(int value) {
			this.value = value;

		}

		@Override
		public String toString() {
			return "Node{" + "value=" + value + ", next=" + next + '}';
		}
	}

	LinkedList(int value) {
		this.head = new Node(value);

		this.tail = this.head;
		this.length = 1;
	}

//	LinkedList insert( int index,int value)
//	{
//
//
//
//	}
//

	LinkedList append(int value) {

		this.tail.next = new Node(value);

		this.tail = this.tail.next;

		length++;
		return this;

	}

	LinkedList prepend(int value) {
		Node newHead = new Node(value);
		newHead.next = this.head;
		this.head = newHead;
		length++;
		return this;

	}

	@Override
	public String toString() {
		return "LinkedList{" + "head=" + head + ", tail=" + tail + ", size=" + length + '}';
	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList(10);
		System.out.println(linkedList);
		System.out.println(linkedList.append(4));
		System.out.println(linkedList.append(1));
		System.out.println(linkedList.prepend(3));
		System.out.println(linkedList.prepend(4));
	}

}
