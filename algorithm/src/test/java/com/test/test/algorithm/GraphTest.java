package com.test.test.algorithm;

import org.junit.Test;

public class GraphTest {

	@Test
	public void testGraph() {
		Graph g = new Graph();
		g.getEdges().forEach(x -> System.out.println(x));
		g.getVertices().forEach(x -> System.out.println(x));
	}
}
