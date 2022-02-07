package com.ds.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DFS2_AdjacencyList_Topologicl_Sorting {
	public static void main(String[] args) {
		List<List<Integer>> adj = new ArrayList<>();
		int totalNumbeOfNodes = 5;
// initalizing the graph		
		initialize(totalNumbeOfNodes, adj);

//creating a graph
		addEdge(0, 1, adj);
		addEdge(1, 4, adj);
		addEdge(2, 4, adj);
		addEdge(2, 0, adj);
		addEdge(3, 0, adj);
		//adj.stream().forEach(System.out::println);
//DFS implemendtaion
		Map<Integer, Boolean> visited = new HashMap<>();
		for (int i = 0; i < totalNumbeOfNodes; i++) {
			visited.put(i, false);
		}
		dfs(0, adj, visited);
	}

	private static void dfs(int currentNode, List<List<Integer>> adj, Map<Integer, Boolean> visited) {
		if (visited.get(currentNode).equals(false)) {
			System.out.println(currentNode);
			visited.put(currentNode, true);
			List<Integer> nei = getNeigboure(currentNode, adj);
			nei.forEach(n -> {
				if (visited.get(n).equals(false)) {
					dfs(n, adj, visited);
				}
			});

		}
	}

	@SuppressWarnings("unused")
	private static void initialize(int totalNumberOfNode, List<List<Integer>> adj) {
		for (int i = 0; i < totalNumberOfNode; i++) {
			List<Integer> listNode = new ArrayList<>();
			adj.add(listNode);
		}

	}

	@SuppressWarnings("unused")
	private static void addEdge(int u, int v, List<List<Integer>> adj) {
		adj.get(u).add(v);

	}

	@SuppressWarnings("unused")
	private static List<Integer> getNeigboure(int u, List<List<Integer>> adj) {
		return adj.get(u);
	}
}
