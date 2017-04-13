package com.test.test.algorithm;

import java.util.Arrays;
import java.util.Stack;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class NextGreatestElementAlgorithm {
	
	@Test
	public void testBack1() {
		int[] in = new int[]{5, 2, 6, 8, 3, 9 , 7};
		int[] out = new int[]{6, 6, 8, 9, 9, -1 , -1};
		int[] funcOut = nextGreatestElementBackwards(in);
		Assert.assertArrayEquals(Arrays.toString(funcOut), out, funcOut);
	}
	
	@Test
	public void testBack2() {
		int[] in = new int[]{ 5, 2, 6, 8, 3, 5, 9, 7};
		int[] out = new int[]{6, 6, 8, 9, 5, 9,-1,-1};
		int[] funcOut = nextGreatestElementBackwards(in);
		Assert.assertArrayEquals(Arrays.toString(funcOut), out, funcOut);
	}
	
	@Test
	@Ignore
	public void testForward1() {
		int[] in = new int[]{5, 2, 6, 8, 3, 9 , 7};
		int[] out = new int[]{6, 6, 8, 9, 9, -1 , -1};
		int[] funcOut = nextGreatestElementForwards(in);
		Assert.assertArrayEquals(Arrays.toString(funcOut), out, funcOut);
	}
	
	/**
	 * Creates an array containing every values next greatest value in
	 * the array if it can be found, otherwise -1.
	 * 
	 * @param values - array of values
	 * @return - NGE array
	 */
	private int[] nextGreatestElementBackwards(int[] values) {
		// Initialize stuff
		Stack<Integer> maxes = new Stack<>();
		int[] out = new int[values.length];
		// Do first case
		int outIndex = out.length - 1;
		maxes.push(values[values.length - 1]);
		out[outIndex] = -1;
		outIndex--;
		
		for(int i = values.length - 2; i >= 0; i--) {
			while(!maxes.isEmpty() && values[i] > maxes.peek()) {
				maxes.pop();
			}
			if(maxes.isEmpty()) {
				out[outIndex] = -1;
				outIndex--;
			} else if(maxes.peek() > values[i]) {
				out[outIndex] = maxes.peek();
				outIndex--;
			}
			maxes.push(values[i]);
		}
		return out;
	}
	
	// CANNOT GET TO WORK
	private int[] nextGreatestElementForwards(int[] values) {
		Stack<Integer> maxes = new Stack<>();
		int[] out = new int[values.length];
		int outIndex = 0;
		for(int i = 0; i < values.length - 1; i++) {
			if(maxes.isEmpty()) {
				maxes.push(values[i]);
			} else if(maxes.peek() < values[i]) {
				while(!maxes.isEmpty() && maxes.peek() < values[i]) {
					maxes.pop();
					out[outIndex] = values[i];
					outIndex++;
				}
				maxes.push(values[i]);
			} else {
				maxes.push(values[i]);
			}
		}
		for(int i = outIndex; i < out.length; i++) {
			out[i] = -1;
		}
		return out;
	}
}
