package edu.kis.vh.nursery.list;

/**
 * Node class
 */
public class Node {

	private int value;
	private Node prev;
	private Node next;

	/**
	 * Constructor
	 * @param i
	 */
	public Node(int i) {
		setValue(i);
	}

	/**
	 * value Getter
	 * @return
	 */
	public int getValue() {
		return value;
	}

	/**
	 * value setter
	 * @param value
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * node getter
	 * @return
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
	 * @return
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
