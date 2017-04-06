package com.test.test.algorithm;

import java.util.List;

import org.junit.Test;

public class AlgorithmTest {

	@Test
	public void testDaniel() {
		Graph g = new Graph(100, 100, 50, 200);
		List<MapVertice> path = new DanielAlgorithmImpl().findShortestPath(g, g.getVertices().get(0), g.getVertices().get(1));
		path.forEach(x -> System.out.println(x));
	}
}
