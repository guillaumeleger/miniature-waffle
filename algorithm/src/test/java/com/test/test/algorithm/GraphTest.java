package com.test.test.algorithm;

import com.test.test.algorithm.graph.Graph;
import com.test.test.algorithm.graph.MapVertice;
import java.util.List;
import org.junit.Test;

public class GraphTest {

	@Test
	public void testGraph() {
		Graph g = new Graph(1000, 1000, 400, 15000);
//		g.getEdges().forEach(x -> System.out.println(x));
		List<MapVertice> vertices = g.getVertices();
//		vertices.forEach(x -> System.out.println(x));
		GuillaumeBestAlgorithmImpl impl = new GuillaumeBestAlgorithmImpl();
		impl.findShortestPath(g, vertices.get(12), vertices.get(31));
	}
}
