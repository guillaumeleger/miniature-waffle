package com.test.test.algorithm;

import com.test.test.algorithm.graph.Edge;
import com.test.test.algorithm.graph.Graph;
import com.test.test.algorithm.graph.MapVertice;
import com.test.test.algorithm.graph.algorithm.Algorithm;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Stack;

public class GuillaumeBestAlgorithmImpl implements Algorithm{

	@Override
	public Optional<List<Edge>> findShortestPath(Graph g, MapVertice from, MapVertice to) {
		System.out.println("FROM " + from.toString());
		System.out.println("TO " + to.toString());
		if(from.equals(to)) {
			List<Edge> arrayList = new ArrayList<Edge>();
			return Optional.of(arrayList);
		}
		List<Edge> edges = g.getEdges();
		Map<MapVertice, List<Edge>> verticeToEdgeMap = g.getVerticeToEdgeMap();
		Set<MapVertice> consideredVertices = new HashSet<>();
		Stack<MapVertice> stack = new Stack<>();
		stack.push(from);
		MapVertice next = from;
		double maxDistance = MapVertice.distance(from, to);
		System.out.println("Initial MAX distance: " + maxDistance);
		while(!to.equals(next)) {
			consideredVertices.add(next);
			List<Edge> edges2 = verticeToEdgeMap.get(next);
			System.out.println(edges2.size());
			Optional<Edge> bestEdge = findBestEdge(edges2, to, consideredVertices);
			if(bestEdge.isPresent()) {
				Edge best = bestEdge.get();
				MapVertice betterVertice = best.getTo();
				stack.push(betterVertice);
				edges.add(best);
				next = betterVertice;
				System.out.println(next.toString());
				maxDistance = MapVertice.distance(betterVertice, to);
				System.out.println("New MAX distance: " + maxDistance);
			} else {
				next = stack.pop();
			}
		}
		return Optional.of(edges);
	}
	
	private Optional<Edge> findBestEdge(List<Edge> edges, MapVertice goal, Set<MapVertice> consideredVertices) {
		Edge temp = null;
		double distance = Double.MAX_VALUE;
		for(Edge e : edges) {
			MapVertice toVertice = e.getTo();
			if(consideredVertices.contains(toVertice)) {
				continue;
			}
			double distanceToEndGoal = MapVertice.distance(toVertice, goal);
			if(distanceToEndGoal < distance) {
				temp = e;
				distance = distanceToEndGoal;
			}
		}
		return Optional.ofNullable(temp);
	}

	@Override
	public void depthFirstSearch(Graph g, MapVertice from, MapVertice to) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breadthFirstSearch(Graph g, MapVertice from, MapVertice to) {
		// TODO Auto-generated method stub
		
	}

}
