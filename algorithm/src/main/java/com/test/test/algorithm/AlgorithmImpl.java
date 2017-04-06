package com.test.test.algorithm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class AlgorithmImpl implements Algorithm{

	@Override
	public Optional<List<Edge>> findShortestPath(Graph g, MapVertice from, MapVertice to) {
		List<MapVertice> vertices = g.getVertices();
		List<Edge> edges = g.getEdges();
		Map<MapVertice, Edge> edgeMap = new HashMap<>();
		for(MapVertice v : vertices) {
			for(Edge e : edges) {
				if(e.getFrom().equals(v)) 
					edgeMap.put(v, e);
			}
		}
		to.getxCoordinate();
		from.getxCoordinate();
		return Optional.empty();
	}

}
