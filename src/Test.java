import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Test {
	public static void main(String[] args) {

		int[][] nums = { { 44,21,48 } };
		int s = nums.length;
		if(s <= 1) {
			 convetToList(nums[0]).stream().forEach(System.out::println);
		}
		if (s == 2) {
			int[] ans = intersectionOfAray(nums[0], nums[1]);
			 convetToList(ans).stream().forEach(System.out::println);

		} if else {
			int startIndex = 2;
			int[] ans = intersectionOfAray(nums[0], nums[1]);
			while (startIndex < s) {
				int[] nextArry = nums[startIndex];
				ans = intersectionOfAray(ans, nextArry);
				startIndex++;
			}

			convetToList(ans).stream().forEach(System.out::println);

		}

	}

	public static List<Integer> convetToList(int[] ans) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < ans.length; i++) {
			if (ans[i] != 0)
				list.add(ans[i]);
		}
		
		Collections.sort(list); 
		return list;
	}

	public static int[] intersectionOfAray(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int i, j;
		int[] list = new int[1000];
		int k = 0;

		for (i = 0; i < n; i++) {
			int num = arr1[i];
			for (j = 0; j < m; j++) {
				if (num == arr2[j]) {
					list[k] = num;
					k++;
				}
			}
		}

		return list;
	}

}