package com.ds.binarysearch;

public class DoubleBinarySearch {
	public static void main(String[] args) {
		int[][] matrix = { { 1,2 },{1,3}};
		int k = 3;
		System.out.println(kthSmallest(matrix, k));
	}

	private static int kthSmallest(int[][] matrix, int k) {
		int start = matrix[0][0];

		int end = matrix[matrix.length - 1][matrix.length - 1];
		if (start == end && start != k && end != k ) 
			return start;

		if ((start == k) || handleEdgeCase(matrix, k))
			return k;

		int mid = 0;
		int ans = 0;
		while (start <= end) {
			mid = (start + end) / 2;
			// Check mid of rank,upper bound by checking the rank in each row and adding it
			int rank = 0;
			int matrixIndex = 0;
			while (matrixIndex < matrix.length) {
				int[] row = matrix[matrixIndex];

				int rowStart = 0;
				int rowEnd = row.length - 1;
				int rowRank = rankInEachRow(rowStart, rowEnd, row, mid);
				rank += rowRank;
				matrixIndex++;
			}
			if (rank > k) {
				end = mid - 1;
			} else if (rank < k) {
				start = mid + 1;
			} else {
				ans = mid;
				end = mid - 1;
			}

		}

		return start;
	}

	private static boolean handleEdgeCase(int[][] matrix, int k) {
		int matrixIndex = 0;
		int count = 0;
		boolean flag = false;
		while (matrixIndex < matrix.length) {
			int[] row = matrix[matrixIndex];
			if (row[matrix.length - 1] == k)
				count++;
			matrixIndex++;
		}
		return count == matrix.length;
	}

	private static int rankInEachRow(int rowStart, int rowEnd, int[] row, int rank) {
		int rowMid = -1;
		while (rowStart <= rowEnd) {
			rowMid = (rowStart + rowEnd) / 2;
			if (row[rowMid] > rank) {
				rowEnd = rowMid - 1;

			} else if (row[rowMid] < rank) {
				rowStart = rowMid + 1;
			} else {
				rowStart = rowMid + 1;
			}
		}
		return rowStart;
	}

}
