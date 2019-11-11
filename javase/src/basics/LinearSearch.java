package basics;

import java.util.Scanner;

public class LinearSearch {

	public boolean linearSearch(int a[], int n) {
		for (int val : a) {
			if (n == val) {
				return true;
			}
		}
		return false;
	}

	public boolean binarySearch(int a[], int n) {
		return false;
	}

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner s = new Scanner(System.in);

		System.out.println("Enter elements into array ");
		for (int i = 0; i < 5; i++) {
			a[i] = s.nextInt();
		}

		System.out.println("Enter the element for search ");
		int n = s.nextInt();

		LinearSearch ls = new LinearSearch();
		boolean found = ls.linearSearch(a, n);

		if (found)
			System.out.println("Match Found");
		else
			System.out.println("Match  not Found");

		if (ls.binarySearch(a, n))
			System.out.println("Match Found");
		else
			System.out.println("Match  not Found");
	}

}
