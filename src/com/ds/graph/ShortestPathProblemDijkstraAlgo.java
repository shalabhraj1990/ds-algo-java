package com.ds.graph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class ShortestPathProblemDijkstraAlgo {
	static List<List<Tuple2<Integer, Integer>>> adjGraph = new ArrayList<>();
	static HashMap<Integer, Integer> distance = new HashMap<Integer, Integer>();
	// PQ [distance,Node]
	static PriorityQueue<Node> pq = new PriorityQueue<>(new CustomDistanceComparator());
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
		// starting node
		Node node0 = new Node(0, 0);
		pq.add(node0);

		// while (!pq.isEmpty()) {
		Node node = pq.poll();
		distance.put(node.getName(), node.getDistance());
		dijkstraAlgo(node);
		// }

		System.out.println(distance);

	}

	private static void dijkstraAlgo(Node node) {
		if (null != node && adjGraph.get(node.getName()).size() > 0) {
			for (Tuple2<Integer, Integer> neigboure : adjGraph.get(node.getName())) {
				int disOfNeig = node.getDistance() + neigboure.getT2();
				if (disOfNeig < distance.get(neigboure.getT1())) {
					distance.put(neigboure.getT1(), disOfNeig);
					Node pqElement = new Node(neigboure.getT1(), disOfNeig);
					pq.add(pqElement);
				}
			}
			while (!pq.isEmpty()) {
				Node pqNode = pq.poll();
				dijkstraAlgo(pqNode);
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
			distance.put(i, Integer.MAX_VALUE);
		}
	}

	static class Node {
		private Integer name;
		private Integer distance;

		public Integer getName() {
			return name;
		}

		public void setName(Integer name) {
			this.name = name;
		}

		public Integer getDistance() {
			return distance;
		}

		public void setDistance(Integer distance) {
			this.distance = distance;
		}

		public Node(Integer name, Integer distance) {
			this.name = name;
			this.distance = distance;
		}
	}

	static class CustomDistanceComparator implements Comparator<Node> {

		@Override
		public int compare(Node o1, Node o2) {
			return o1.getDistance() > o2.getDistance() ? 1 : -1;
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
