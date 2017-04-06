package com.test.test.algorithm;

public class MapVertice {

	private final int m_yCoordinate;
	private final int m_xCoordinate;

	public MapVertice(int xCoordinate, int yCoordinate) {
		m_xCoordinate = xCoordinate;
		m_yCoordinate = yCoordinate;
	}

	public double distance(MapVertice from, MapVertice to) {
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
}
