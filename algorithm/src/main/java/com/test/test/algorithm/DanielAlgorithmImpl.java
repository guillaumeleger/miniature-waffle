package com.test.test.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class DanielAlgorithmImpl {

	private MapVertice to;
	private List<Edge> edges; 
	private List<MapVertice> vertices;
	Map<MapVertice, List<Edge>> map;
	
	public List<MapVertice> findShortestPath(Graph g, MapVertice from, MapVertice to) {
		this.to = to;
		vertices = g.getVertices();
		map = g.getVerticeToEdgeMap();
		traverse(from);
		if(to.getPath().size() > 0) {
			return to.getPath();
		} else {
			return null;
		}
	}

	public void traverse(MapVertice current) {
		if(current.equals(to)) {
			return;
		}
		List<Edge> currentEdges = map.get(current);
		for(Edge e : currentEdges) {
			MapVertice v;
			if(e.getTo().equals(current)) {
				v = e.getFrom();
			} else {
				v = e.getTo();
			}
			if(v.getWeight() > current.getWeight() + e.getCost()) {
				v.setWeight(current.getWeight() + e.getCost());
				List<MapVertice> path = current.getPath();
				path.add(current);
				v.setPath(path);
				traverse(v);
			}
		}
	}
}
