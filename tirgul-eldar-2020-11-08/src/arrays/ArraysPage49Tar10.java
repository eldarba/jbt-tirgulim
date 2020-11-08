package arrays;

import java.util.Arrays;

public class ArraysPage49Tar10 {

	public static void main(String[] args) {

		char[] arr = new char[50];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char) (Math.random() * ('Z' - 'A' + 1) + 'A');
		}

		System.out.println(Arrays.toString(arr));

		for (char c = 'A'; c <= 'Z'; c++) {

			int counter = 0;

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == c) {
					counter++;
				}
			}

			if (counter != 0) {
				System.out.println(c + " - " + counter);
			}

		}

	}

}
