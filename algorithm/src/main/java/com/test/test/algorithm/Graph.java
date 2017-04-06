package com.test.test.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Graph {

	private static final Random RAND = new Random();
	private static final int MAX_X = 100;
	private static final int MAX_Y = 100;
	private static final int N = 30;
	private static final int E = 60;
	
	private final List<Edge> m_edges;
	private final List<MapVertice> m_vertices;

	
	
	public Graph() {
		generateGraph(MAX_X, MAX_Y, N, E);
		m_edges = new ArrayList<Edge>();
		m_vertices = new ArrayList<MapVertice>();
	}
	
	private void generateGraph(int maxX, int maxY, int n, int e) {
		for(int i = 0; i < n; i++) {
			m_vertices.add(new MapVertice(RAND.nextInt() % maxX, RAND.nextInt() % maxY));
		}
		int vSize = m_vertices.size();
		for(int i = 0; i < e; i++) {
			int a = RAND.nextInt(vSize);
			int b = RAND.nextInt(vSize);
			while(a == b) {
				b = RAND.nextInt(vSize);
			}
			MapVertice verticeA = m_vertices.get(a);
			MapVertice verticeB = m_vertices.get(b);
			m_edges.add(new Edge(verticeA, verticeB, MapVertice.distance(verticeA, verticeB)));
		}
	}
}
