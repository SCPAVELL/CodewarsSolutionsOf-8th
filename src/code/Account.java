package code;



public class Account {
	public static void main(String[] args) {
		Solution solution = new Solution();

		System.out.println(solution.squareSum(new int[] { 1, 2, 2 }));
	}
}

class Solution {
	public static int squareSum(int[] n) {
		int sum = 0;
		for (int i = 0; i < n.length; i++) {
			sum += n[i] * n[i];
		}
		return sum;

	}
}
