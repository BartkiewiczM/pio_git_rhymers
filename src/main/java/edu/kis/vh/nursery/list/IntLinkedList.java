package edu.kis.vh.nursery.list;

public class IntLinkedList {

	public static final int RET_VALUE = -1;
	Node last;
	private int i;

	public void push(int i) {
		if (last == null)
			setLast(new Node(i));
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			setLast(last.getNext());
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
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return RET_VALUE;
		int ret = last.getValue();
		setLast(last.getPrev());
		return ret;
	}
	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}
}
