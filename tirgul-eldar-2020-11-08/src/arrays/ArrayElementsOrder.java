package arrays;

import java.util.Arrays;

public class ArrayElementsOrder {

	public static void main(String[] args) {

		// create an array
		int[] arr = { 0, 2, 4, 6, 8, 10 };
		// print the array elements
		System.out.println(Arrays.toString(arr));

		// reverse elements order
		for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		// print the array elements
		System.out.println(Arrays.toString(arr));
	}

}
