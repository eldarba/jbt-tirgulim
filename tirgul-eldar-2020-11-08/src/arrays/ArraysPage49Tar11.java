package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPage49Tar11 {

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

		if (code == '+') {
			System.out.println("move elements to the right in circle");
			int last = arr[arr.length - 1];
			for (int i = arr.length - 1; i >= 1; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = last;
		} else if (code == '-') {
			System.out.println("move elements to the left in circle");
			int first = arr[0];
			for (int i = 1; i < arr.length; i++) {
				arr[i - 1] = arr[i];
			}
			arr[arr.length - 1] = first;
		} else {
			System.out.println("illegal code value: " + code);
		}

		System.out.println(Arrays.toString(arr));
	}

}
