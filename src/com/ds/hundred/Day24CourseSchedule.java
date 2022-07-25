package com.ds.hundred;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day24CourseSchedule {
	static List<List<Integer>> adj = new ArrayList<>();
	static Map<Integer, String> state = new HashMap<>();
	static boolean cycleFound = false;

	public static void main(String[] args) {
		int numCourses = 2;
		int[][] prerequisites = { { 1, 0 }, { 0, 1 } };
		System.out.println(canFinish(numCourses, prerequisites));
	}

	public static boolean canFinish(int numCourses, int[][] prerequisites) {

		for (int i = 0; i < numCourses; i++) {
			adj.add(new ArrayList<>());
			state.put(i, "U");
		}

		for (int i = 0; i < prerequisites.length; i++) {
			int[] req = prerequisites[1];
			int fromNode = req[1];
			int toNode = req[0];
			adj.get(fromNode).add(toNode);

		}

		for (int i = 0; i < numCourses; i++) {
			if (state.get(i).equals("U")) {
				dfs(i);
			}
			if (cycleFound == true) {
				return false;
			}
		}

		return !cycleFound;

	}

	public static void dfs(int node) {
		if (state.get(node).equals("U")) {
			state.put(node, "V");
			List<Integer> neigbours = adj.get(node);
			for (int nei : neigbours) {
				dfs(nei);
			}
			state.put(node, "P");

		} else if (state.get(node).equals("V")) {
			cycleFound = true;
		}
	}

}
