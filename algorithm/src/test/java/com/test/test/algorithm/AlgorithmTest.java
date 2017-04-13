package com.test.test.algorithm;

import com.test.test.algorithm.graph.Edge;
import com.test.test.algorithm.graph.Graph;
import com.test.test.algorithm.graph.MapVertice;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class AlgorithmTest {

	@Test
	public void testDaniel() {
		Graph g = new Graph(100, 100, 5, 10);
		g.getVertices().forEach(x -> System.out.println(x));
		List<Edge> edge = g.getEdges().stream().distinct().collect(Collectors.toList());
		edge.forEach(x -> System.out.println(x));
		System.out.println("Start: " + g.getVertices().get(0));
		System.out.println("End: " + g.getVertices().get(1));
		List<MapVertice> path = new DanielAlgorithmImpl().findShortestPath(g, g.getVertices().get(0), g.getVertices().get(1));
		path.forEach(x -> System.out.println(x));
	}
}
