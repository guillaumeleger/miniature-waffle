package com.test.datastructure;

public class AvlTree {

	private Node m_root;
	
	public AvlTree() {
	}
	
	public void addNode(Node n) {
		addNode(n, m_root);
	}
	
	public void addNode(Node n, Node root) {
		if(root == null) {
			root = n;
			return;
		}
		if(m_root.getValue() < n.getValue()) {
			addNode(n, root.getLeft());
		} else  {
			addNode(n, root.getRight());
		}
	}
	
	private class Node {
		private final Node m_left;
		private Node m_right;
		private int m_balance;
		private final int m_value;
		
		private Node(Node leftChild, Node rightChild, int value, int balance) {
			m_left = leftChild;
			setRight(rightChild);
			setBalance(balance);
			m_value = value;
		} 
		 
		private Node(int value) {
			this(null, null, value, 0);
		}

		public Node getLeft() {
			return m_left;
		}

		public Node getRight() {
			return m_right;
		}

		public void setRight(Node right) {
			m_right = right;
		}

		public int getBalance() {
			int leftBalance = 0;
			if(m_left != null) {
				leftBalance = m_left.getBalance();
			}
			int rightBalance = 0;
			if(m_right != null) {
				rightBalance = m_right.getBalance();
			}
			return leftBalance - rightBalance;
		}

		public void setBalance(int balance) {
			m_balance = balance;
		}

		public int getValue() {
			return m_value;
		}
	}
}
