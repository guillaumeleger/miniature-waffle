package com.test.test.algorithm;

public class Edge<T> {
	
	private final int m_cost;
	private final T m_to;
	private final T m_from;

	public Edge(T from, T to, int cost) {
		m_from = from;
		m_to = to;
		m_cost = cost;
	}

	public T getFrom() {
		return m_from;
	}

	public int getCost() {
		return m_cost;
	}

	public T getTo() {
		return m_to;
	}
}
