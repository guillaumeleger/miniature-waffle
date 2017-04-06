package com.test.test.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;

public class AlgorithmImpl implements Algorithm{

	@Override
	public Optional<List<Edge>> findShortestPath(Graph g, MapVertice from, MapVertice to) {
		if(from.equals(to)) {
			List<Edge> arrayList = new ArrayList<Edge>();
			return Optional.of(arrayList);
		}
		List<MapVertice> vertices = g.getVertices();
		List<Edge> edges = g.getEdges();
		Map<MapVertice, List<Edge>> verticeToEdgeMap = g.getVerticeToEdgeMap();
		int getxCoordinate = to.getxCoordinate();
		int getxCoordinate2 = from.getxCoordinate();
		Stack<MapVertice> stack = new Stack<>();
		stack.push(from);
		for(Edge e : verticeToEdgeMap.get(from)) {
			
		}
		return Optional.empty();
	}

}
