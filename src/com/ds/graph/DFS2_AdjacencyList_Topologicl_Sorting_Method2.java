package com.ds.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class DFS2_AdjacencyList_Topologicl_Sorting_Method2 {
	static List<List<Integer>> adjGraph = new ArrayList<>();
	static HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
	static HashMap<Integer, Integer> incommingEdages = new HashMap<Integer, Integer>();
	static Stack<Integer> st = new Stack<>();
	static final int noOfGraphsNode = 5;

	public static void main(String[] args) {
		initialize(noOfGraphsNode);
		addEdge(0, 1);
		addEdge(0, 2);
		addEdge(2, 1);
		addEdge(1, 3);
		addEdge(1, 4);
		addEdge(3, 4);
		dfs();
		while (st.size() > 0) {
			System.out.println(st.peek());
			st.pop();
		}
	}

	private static void dfs() {
		for (int i = 0; i < noOfGraphsNode; i++) {
			if (incommingEdages.get(i) == 0) {
				dfsUtil(i);
			}

		}
	}

	private static void dfsUtil(int source) {
		if (visited.get(source) == false) {
			visited.put(source, true);
			for (int neigboure : adjGraph.get(source)) {
				if (visited.get(neigboure) == false) {
					dfsUtil(neigboure);
				}
			}
			st.add(source);
		}
	}

	private static void initialize(int node) {
		for (int i = 0; i < node; i++) {
			List<Integer> v = new ArrayList<Integer>();
			adjGraph.add(v);
			visited.put(i, false);
			incommingEdages.put(i, 0);
		}
	}

	private static void addEdge(int u, int v) {
		adjGraph.get(u).add(v);
		int incomSum = incommingEdages.get(v) + 1;
		incommingEdages.put(v, incomSum);
	}

//	class Node {
//		public int val;
//		public List<Node> neighbors;
//
//		public Node() {
//			val = 0;
//			neighbors = new ArrayList<Node>();
//		}
//
//		public Node(int _val) {
//			val = _val;
//			neighbors = new ArrayList<Node>();
//		}
//
//		public Node(int _val, ArrayList<Node> _neighbors) {
//			val = _val;
//			neighbors = _neighbors;
//		}
//	}
}
