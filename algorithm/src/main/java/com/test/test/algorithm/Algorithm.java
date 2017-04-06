package com.test.test.algorithm;

import java.util.List;
import java.util.Optional;

public interface Algorithm {

	Optional<List<Edge>> findShortestPath(Graph g, MapVertice from, MapVertice to);
}
