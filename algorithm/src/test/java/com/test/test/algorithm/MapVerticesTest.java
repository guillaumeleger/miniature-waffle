package com.test.test.algorithm;

import com.test.test.algorithm.graph.MapVertice;
import org.junit.Assert;
import org.junit.Test;

public class MapVerticesTest {

	@Test
	public void testDistance() {
		MapVertice first = new MapVertice(50, 50);
		Assert.assertEquals(0.0, MapVertice.distance(first, first), 0.01);
	}
	
	@Test
	public void testSampleDistances() {
		MapVertice first = new MapVertice(50, 50);
		MapVertice second = new MapVertice(53, 46);
		Assert.assertEquals(5.0, MapVertice.distance(first, second), 0.01);

	}
}
