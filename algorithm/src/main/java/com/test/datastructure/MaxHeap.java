package com.test.datastructure;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap {
	
	private final int m_capacity;
	private int m_currentSize = 0;
	private final List<Integer> m_heap;

	public MaxHeap(int capacity) {
		m_capacity = capacity;
		m_heap = new ArrayList<>(m_capacity);
	}
	
	public void add(int i) {
		if(m_currentSize == m_capacity) {
			throw new RuntimeException("capacity already reached");
		}
		m_heap.add(m_currentSize);
		fixUpHeap(m_currentSize);
		m_currentSize++;
	}
	
	public int pop() {
		if(m_currentSize == 0) {
			throw new RuntimeException("Cannot pop");
		}
		int popped = m_heap.get(0);
		m_heap.set(0, m_heap.get(m_currentSize -1));
		m_currentSize--;
		m_heap.remove(m_currentSize);
		if(m_currentSize != 0) {
			fixDownHeap();
		}
		return popped;
	}

	private void fixDownHeap() {
		int index = 0; 
		int value = m_heap.get(index);
		while(index < m_currentSize/2) {
			int childOneIndex = 2 * index + 1;
			int childTwoIndex = 2 * index + 2;
			int childOneValue;
			int childTwoValue;
			if(childTwoIndex <= m_currentSize - 1) {
				childTwoValue = m_heap.get(childTwoIndex);
				childOneValue = m_heap.get(childOneIndex);
			} else {
				if(childOneIndex <= m_currentSize -1) {
					childOneValue = m_heap.get(childOneIndex);
				} else {
					childOneValue = Integer.MIN_VALUE;
				}
				childTwoValue = Integer.MIN_VALUE;
			}
			if(value < childOneValue) {
				if(childOneValue < childTwoValue) {
					swapHeapValues(childTwoIndex, index);
					index = childTwoIndex;
				} else {
					//swap 1 and current
					swapHeapValues(childOneIndex, index);
					index = childOneIndex;
				}
			} else if(value < childTwoValue) {
				swapHeapValues(index, childTwoIndex);
				index = childTwoIndex;
			} else {
				break;
			}
		}
	}

	private void fixUpHeap(int currentCapacity) {
		int index = currentCapacity;
		while(index > 0) {
			int parent = (index - 1)/2;
			int parentValue = m_heap.get(parent);
			int indexValue = m_heap.get(index);
			if(indexValue > parentValue) {
				swapHeapValues(index, parent);
				index = parent;
			} else {
				break;
			}
		}
	}
	
	private void swapHeapValues(int fromIndex, int twoIndex) {
		int temp = m_heap.get(fromIndex);
		m_heap.set(fromIndex, m_heap.get(twoIndex));
		m_heap.set(twoIndex, temp);
	}
	
	@Override
	public String toString() {
		return m_heap.toString();
	}
	
	public static void main(String[] args) {
		MaxHeap heap = new MaxHeap(20);
		for(int i = 0; i<20; i++) {
			heap.add(i);
		}
		System.out.println(heap.toString());
		for(int i = 0; i <20; i++) {
			System.out.println(heap.pop());
		}
	}
}
