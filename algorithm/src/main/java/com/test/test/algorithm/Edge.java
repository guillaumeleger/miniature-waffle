package com.test.test.algorithm;

public class Edge {
	
	private final double m_cost;
	private final MapVertice m_to;
	private final MapVertice m_from;

	public Edge(MapVertice from, MapVertice to, double cost) {
		m_from = from;
		m_to = to;
		m_cost = cost;
	}

	public MapVertice getFrom() {
		return m_from;
	}

	public double getCost() {
		return m_cost;
	}

	public MapVertice getMapVerticeo() {
		return m_to;
	}

	@Override
	public String toString() {
		return "Edge [m_cost=" + m_cost + ", m_to=" + m_to + ", m_from=" + m_from + "]";
	}
}
