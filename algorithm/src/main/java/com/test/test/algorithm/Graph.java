package com.test.test.algorithm;

import java.util.Map;
import java.util.Set;

public class Graph {

	private final Map<MapVertice, Set<Edge<MapVertice>>> m_edges;
	private final Set<MapVertice> m_vertices;

	public Graph(Set<MapVertice> vertices, Map<MapVertice, Set<Edge<MapVertice>>> edges) {
		m_vertices = vertices;
		m_edges = edges;
	}
}
