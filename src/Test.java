class Test {
	public static void main(String[] args) {
		int[] arr = new int[] { 3, 6, 7, 11 };
		System.out.println(minEatingSpeed(arr, 8));
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