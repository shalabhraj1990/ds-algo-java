package com.ds.hundred;

public class Day21_NumberOfIslands {
	public static void main(String[] args) {
		char[][] grid = { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' } };
		System.out.println(numIslands(grid));
	}

	public static int numIslands(char[][] grid) {
		int count = 0;
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[0].length; col++) {
				if (grid[row][col] == '1') {
					count++;
					dfs(row, col, grid);
				}
			}
		}
		return count;
	}

	public static void dfs(int row, int col, char[][] grid) {
		if (isValid(row, col, grid)) {
			grid[row][col] = '2';
			dfs(row - 1, col, grid);
			dfs(row + 1, col, grid);
			dfs(row, col - 1, grid);
			dfs(row, col + 1, grid);
		}
	}

	private static boolean isValid(int row, int col, char[][] grid) {
		if (row < 0 || row >= grid.length)
			return false;
		if (col < 0 || col >= grid[0].length)
			return false;
		if (grid[row][col] == '1')
			return true;
		return false;
	}
}
