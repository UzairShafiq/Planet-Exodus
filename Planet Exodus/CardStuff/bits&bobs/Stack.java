public class Node {
	private Integer data;
	private Node next;

	public Node(Integer data, Node next) {
		this.data = data;
		this.next = next;
	}

	public Integer getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}
}

public class Stack {
	private Node head;

	public Stack () {
		this.head = null;
	}

	public void push(Integer data) {
		Node n = new Node(data, head);
		this.head = n;
	}

	public Integer pop() {
		if (head == null) 
			return null;
		
	}
}