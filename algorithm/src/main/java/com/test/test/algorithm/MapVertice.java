package com.test.test.algorithm;

import java.util.ArrayList;
import java.util.List;

public class MapVertice {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + m_xCoordinate;
		result = prime * result + m_yCoordinate;
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
		MapVertice other = (MapVertice) obj;
		if (m_xCoordinate != other.m_xCoordinate)
			return false;
		if (m_yCoordinate != other.m_yCoordinate)
			return false;
		return true;
	}

	private final int m_yCoordinate;
	private final int m_xCoordinate;
	private List<MapVertice> path = new ArrayList<>();
	private double weight = 1000000;
	
	public List<MapVertice> getPath() {
		return path;
	}

	public void setPath(List<MapVertice> path) {
		this.path = path;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public MapVertice(int xCoordinate, int yCoordinate) {
		m_xCoordinate = xCoordinate;
		m_yCoordinate = yCoordinate;
	}

	public static double distance(MapVertice from, MapVertice to) {
		int xDelta = from.getxCoordinate() - to.getxCoordinate();
		int yDelta = from.getyCoordinate() - to.getyCoordinate();
		return Math.sqrt(xDelta * xDelta + yDelta * yDelta);
	}

	public int getyCoordinate() {
		return m_yCoordinate;
	}

	public int getxCoordinate() {
		return m_xCoordinate;
	}

	@Override
	public String toString() {
		return "MapVertice [m_yCoordinate=" + m_yCoordinate + ", m_xCoordinate=" + m_xCoordinate + "]";
	}
}
