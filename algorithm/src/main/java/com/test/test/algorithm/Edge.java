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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((m_from == null) ? 0 : m_from.hashCode());
		result = prime * result + ((m_to == null) ? 0 : m_to.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Edge other = (Edge) obj;
		
		if(m_from == null) {
			if(other.m_from != null) {
				return false;
			}
		}
		
		if(m_to == null) {
			if(other.m_to != null) {
				return false;
			}
		}
		
		if(m_to.equals(m_to) && m_from.equals(m_from)) {
			return true;
		} else if(m_to.equals(m_from) && m_from.equals(m_to)) {
			return true;
		} else {
			return false;
		}
	}

	public MapVertice getFrom() {
		return m_from;
	}

	public double getCost() {
		return m_cost;
	}

	public MapVertice getTo() {
		return m_to;
	}

	@Override
	public String toString() {
		return "Edge [m_cost=" + m_cost + ", m_to=" + m_to + ", m_from=" + m_from + "]";
	}
}
