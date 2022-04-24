import com.ds.stack.StackDemo;

class Test {
	public static void main(String[] args) {
		StackDemo st = new StackDemo();
		
		st.push(4);
		st.push(7);
		st.push(2);
		st.push(9);
		//st.pop();
		System.out.println(st.top());
		
		
//		int[] arr = new int[] { 3, 6, 7, 11 };
//		System.out.println(minEatingSpeed(arr, 8));
	}

	public static int minEatingSpeed(int[] piles, int h) {
		int start = 1;
		//int ans = -1;
		int max = piles[0];
		for (int i = 0; i < piles.length; i++) {
			if (piles[i] >= max) {
				max = piles[i];
			}
		}

		while (start <= max) {
			int noOfHrs = 0;
			int mid = (int) ((start + max) / 2);
			for (int pile : piles) {
				int t = (int) Math.ceil((double) pile /  mid);
				noOfHrs += (int) t;
			}

			if ((int) noOfHrs > h) {
				start = mid + 1;
			}

			else if ((int) noOfHrs < h) {

				max = mid - 1;
			} else {
			//	ans = mid;
				max = mid - 1;
			}
		}

		return  start;

	}

}