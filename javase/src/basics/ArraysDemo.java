package basics;

import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		int arr[] = new int[5];
//		String names[]= {"james","john","Sam"};
//		String s1[]= new String[10];

		Scanner s = new Scanner(System.in);

		int arr2[] = { 29, 30, 50, 44, 90 };

		// assign values into first array
		System.out.println("Enter 5 values into the  first array");
		for (int i = 0; i < 5; i++) {
			arr[i] = s.nextInt();
		}

		System.out.println("Enter the size of the second array  ");
		int n = s.nextInt();

		int arr1[] = new int[n];

		System.out.printf("Enter %d elements into array2\n", n);
		for (int i = 0; i < n; i++) {
			arr1[i] = s.nextInt();
		}

		// Displaying First array
		System.out.println("Displaying first array");
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// Displaying second array
		System.out.println("Displaying second array");
		for (int val : arr1) {
			System.out.print(val + " ");
		}
		System.out.println();
		// Displaying third array
		System.out.println("Displaying third array");
		for (int val : arr2) {
			System.out.print(val + " ");
		}

		// Displaying array lengths
		System.out.println("LEngth of first array: " + arr.length);
		System.out.println("LEngth of Second array: " + arr1.length);
		System.out.println("LEngth of third array: " + arr2.length);
	}

}
