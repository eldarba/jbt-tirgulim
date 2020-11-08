package arrays;

import java.util.Arrays;

public class ArrayCopy1 {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8 };
		System.out.println(Arrays.toString(arr));

		int[] tempArr = new int[arr.length + 2];
		System.arraycopy(arr, 0, tempArr, 0, arr.length);
		arr = tempArr;

		System.out.println(Arrays.toString(arr));

		arr[4] = 100;
		arr[5] = 200;
		System.out.println(Arrays.toString(arr));
	}

}
