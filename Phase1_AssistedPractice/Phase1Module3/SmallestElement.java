package Phase1Module3;

import java.util.Arrays;

public class SmallestElement {

	public static void main(String args[]) 
	{ 
		Integer arr[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
		int k = 4;
		System.out.println("Original Array: ");
		System.out.println(Arrays.toString(arr));
		System.out.println(k + " smallest elements of the said array are:");
		Arrays.sort(arr);
		for (int i = 0; i < k; i++)
			System.out.print(arr[i] + " ");
	} 
} 


