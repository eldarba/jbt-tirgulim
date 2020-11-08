package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPage49Tar11ArrayCopy {

	public static void main(String[] args) {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 11);
		}

		System.out.println(Arrays.toString(arr));

		Scanner sc = new Scanner(System.in);
		System.out.println("enter code [+ or -]");
		char code = sc.next().charAt(0);
		sc.close();

		int[] arrTemp = new int[arr.length];

		if (code == '+') {
			System.out.println("move elements to the right in circle");
			System.arraycopy(arr, 0, arrTemp, 1, arr.length - 1);
			arrTemp[0] = arr[arr.length - 1];
			arr = arrTemp;
		} else if (code == '-') {
			System.out.println("move elements to the lefy in circle");
			System.arraycopy(arr, 1, arrTemp, 0, arr.length - 1);
			arrTemp[arr.length - 1] = arr[0];
			arr = arrTemp;
		} else {
			System.out.println("illegal code value: " + code);
		}

		System.out.println(Arrays.toString(arr));
	}

}
