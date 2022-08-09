package com.ds.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ShortestPathProblemBellManFord {
	static List<List<Tuple2<Integer, Integer>>> adjGraph = new ArrayList<>();
	static HashMap<Integer, Integer> distance = new HashMap<Integer, Integer>();
	static final int noOfGraphsNode = 5;

	public static void main(String[] args) {
		initialize(noOfGraphsNode);
		addEdge(0, 1, 5);
		addEdge(0, 2, 4);
		addEdge(1, 2, 6);
		addEdge(1, 4, 20);
		addEdge(1, 3, 3);
		addEdge(2, 3, 1);
		addEdge(3, 4, 4);
		//bellManAlgo
		for (int i = 0; i < noOfGraphsNode; i++) {
			bellManAlgo(adjGraph);
		}

		System.out.println(distance);

	}

	private static void bellManAlgo(List<List<Tuple2<Integer, Integer>>> adjGraph) {
		for (int i = 0; i < adjGraph.size(); i++) {
			List<Tuple2<Integer, Integer>> neigh = adjGraph.get(i);
			for (Tuple2<Integer, Integer> node : neigh) {
				//if (distance.get(i) < Integer.MAX_VALUE) {
					int nodeDistFromSrc = distance.get(i) + node.getT2();
					if (distance.get(node.getT1()) > nodeDistFromSrc) {
						distance.put(node.getT1(), nodeDistFromSrc);
					}
				//}

			}

		}

	}

	private static void addEdge(int u, int v, int weigth) {
		Tuple2<Integer, Integer> node = new Tuple2<Integer, Integer>(v, weigth);
		adjGraph.get(u).add(node);
	}

	private static void initialize(int node) {
		for (int i = 0; i < node; i++) {
			List<Tuple2<Integer, Integer>> v = new ArrayList<>();

			adjGraph.add(v);
			if (i == 0) {
				distance.put(i, 0);
			} else {
				distance.put(i, Integer.MAX_VALUE);
			}

		}
	}

	public static class Tuple2<T1, T2> {
		private T1 t1;
		private T2 t2;

		public T1 getT1() {
			return t1;
		}

		public T2 getT2() {
			return t2;
		}

		public Tuple2(T1 t1, T2 t2) {
			this.t1 = t1;
			this.t2 = t2;
		}

		@Override
		public String toString() {
			return this.t1 + "," + this.t2;
		}
	}
}
