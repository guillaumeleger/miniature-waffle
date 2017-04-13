package com.test.test.algorithm.graph.algorithm;

import com.test.test.algorithm.graph.Edge;
import com.test.test.algorithm.graph.Graph;
import com.test.test.algorithm.graph.MapVertice;
import java.util.List;
import java.util.Optional;

public interface Algorithm {

	Optional<List<Edge>> findShortestPath(Graph g, MapVertice from, MapVertice to);
	
	void depthFirstSearch(Graph g, MapVertice from, MapVertice to);
	
	void breadthFirstSearch(Graph g, MapVertice from, MapVertice to);
	
	
	
	
}
