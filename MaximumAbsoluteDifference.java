// Maximum absolute difference of value and index sums

// Given an unsorted array A of N integers, A_{1}, A_{2}, ...., A_{N}.          Return maximum value of f(i, j) for all 1 ≤ i, j ≤ N. 
// f(i, j) or absolute difference of two elements of an array A is defined as |A[i] – A[j]| + |i – j|, where |A| denotes the absolute value of A.

// Examples: 

// We will calculate the value of f(i, j) for each pair
// of (i, j) and return the maximum value thus obtained.

// Input : A = {1, 3, -1}
// Output : 5
// f(1, 1) = f(2, 2) = f(3, 3) = 0
// f(1, 2) = f(2, 1) = |1 - 3| + |1 - 2| = 3
// f(1, 3) = f(3, 1) = |1 - (-1)| + |1 - 3| = 4
// f(2, 3) = f(3, 2) = |3 - (-1)| + |2 - 3| = 5
// So, we return 5.

// Input : A = {3, -2, 5, -4}
// Output : 10
// f(1, 1) = f(2, 2) = f(3, 3) = f(4, 4) = 0
// f(1, 2) = f(2, 1) = |3 - (-2)| + |1 - 2| = 6
// f(1, 3) = f(3, 1) = |3 - 5| + |1 - 3| = 4
// f(1, 4) = f(4, 1) = |3 - (-4)| + |1 - 4| = 10
// f(2, 3) = f(3, 2) = |(-2) - 5| + |2 - 3| = 8
// f(2, 4) = f(4, 2) = |(-2) - (-4)| + |2 - 4| = 4
// f(3, 4) = f(4, 3) = |5 - (-4)| + |3 - 4| = 10

// So, we return 10

public class MaximumAbsoluteDifference {

	private static int maxDistance(int[] array) {

		int max1 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;
		int max2 = Integer.MIN_VALUE;
		int min2 = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {

			max1 = Math.max(max1, array[i] + i);
			min1 = Math.min(min1, array[i] + i);
			max2 = Math.max(max2, array[i] - i);
			min2 = Math.min(min2, array[i] - i);
		}

		return Math.max(max1 - min1, max2 - min2);
	}

	public static void main(String[] args) {
		int[] array = { -70, -64, -6, -56, 64,
				61, -57, 16, 48, -98 };
		System.out.println(maxDistance(array));
	}
}
