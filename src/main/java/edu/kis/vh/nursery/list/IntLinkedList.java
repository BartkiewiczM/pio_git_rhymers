package edu.kis.vh.nursery.list;

public class IntLinkedList {

	public static final int RET_VALUE = -1;
	Node last;
	private int i;

	public void push(int i) {
		if (getLast() == null)
			setLast(new Node(i));
		else {
			getLast().setNext(new Node(i));
			getLast().getNext().setPrev(getLast());
			setLast(getLast().getNext());
		}
	}

	public boolean isEmpty() {
		return getLast() == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return RET_VALUE;
		return getLast().getValue();
	}

	public int pop() {
		if (isEmpty())
			return RET_VALUE;
		int ret = getLast().getValue();
		setLast(getLast().getPrev());
		return ret;
	}
	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}
}
