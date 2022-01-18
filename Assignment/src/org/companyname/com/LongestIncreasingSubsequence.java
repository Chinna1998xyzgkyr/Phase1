package org.companyname.com;

class LongestIncreasingSubsequence {
	static int max_ref; 

	static int lis(int arr[], int n)
	{

		if (n == 1)
			return 1;

		int res, maxEnding = 1;
		for (int i = 1; i < n; i++) {
			res = lis(arr, i);
			if (arr[i - 1] < arr[n - 1]
				&& res + 1 > maxEnding)
				maxEnding = res + 1;
		}

		
		if (max_ref < maxEnding)
			max_ref = maxEnding;

		
		return maxEnding;
	}

	
	static int lisub(int arr[], int n)
	{
		
		max_ref = 1;

		
		lis(arr, n);

		
		return max_ref;
	}

	
	public static void main(String args[])
	{
		int arr[] = { 9, 15, 12, 55, 61, 45, 58, 22 };
		int num = arr.length;
		System.out.println("Length of lis is " + lis(arr, num)
						+ "\n");
	}
}