package edu.kis.vh.nursery.list;

/**
 * Node class
 */
public class Node {

	private final int value;
	private Node prev;
	private Node next;

	/**
	 * Constructor
	 * @param i
	 */
	public Node(int i) {
		value = i;
	}

	/**
	 * value Getter
	 * @return value from this node
	 */
	public int getValue() {
		return value;
	}

	/**
	 * node getter
	 * @return prev value from node
	 */
	public Node getPrev() {
		return prev;
	}

	/**
	 * node setter
	 * @param prev
	 */
	public void setPrev(Node prev) {
		this.prev = prev;
	}

	/**
	 * next getter
	 * @return next value from this node
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * next setter
	 * @param next
	 */
	public void setNext(Node next) {
		this.next = next;
	}
}
