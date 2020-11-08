package arrays;

import java.util.Scanner;

public class ArraysPage49Tar7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[] arr = new char[10];
		int numOfLetters = 0;
		int numOfdigits = 0;
		int numOfothers = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print("enter one character " + (i + 1) + "/" + arr.length + ": ");
			char c = sc.next().charAt(0);
			arr[i] = c;

			// notice that Hebrew characters are gibberish in Github website
			if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= 'à' && c <= 'ú') {
				numOfLetters++;
			} else if (c >= '1' && c <= '9') {
				numOfdigits++;
			} else {
				numOfothers++;
			}

		}
		sc.close();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + " - " + arr[i]);
		}

		System.out.println("number of letters: " + numOfLetters);
		System.out.println("number of digits: " + numOfdigits);
		System.out.println("number of others: " + numOfothers);

	}

}
