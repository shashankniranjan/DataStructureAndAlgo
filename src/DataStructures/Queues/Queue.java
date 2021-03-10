package DataStructures.Queues;

class Queue {

	class Node {

		int value;
		Node next;

		Node(int value) {

			this.value = value;
			this.next = null;

		}

		@Override
		public String toString() {
			return "Node{" + "value=" + value + ", next=" + next + '}';
		}
	}

	@Override
	public String toString() {
		return "Queue{" + "first=" + first + ", last=" + last + ", length=" + length + '}';
	}

	Node first;
	Node last;
	int length;

	Queue() {
		this.first = null;
		this.last = null;
		this.length = 0;
	}

	Node peek() {

		return this.first;
	}

	Queue enqueue(int value) {

		Node newNode = new Node(value);

		if (this.length == 0) {
			this.first = newNode;
		} else {
			this.last.next = newNode;
		}
		this.last = newNode;

		this.length++;
		return this;
	}

	Queue dequeue() {

		if (this.first == null) {
			return null;
		}

		if (this.first == this.last) {
			this.last = null;
		}

		Node pointer = this.first;
		this.first = this.first.next;
		this.length--;

		return this;
	}

	public static void main(String[] args) {

		Queue queue = new Queue();

		System.out.println(queue.peek());

		System.out.println(queue.enqueue(5));

		System.out.println(queue.enqueue(6));

		System.out.println(queue.dequeue());

		System.out.println(queue.dequeue());

	}

}
