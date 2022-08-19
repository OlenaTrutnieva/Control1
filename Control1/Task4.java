package by.training.control.task;

// Задан целочисленный массив размерности N. Есть ли среди элементов массива простые числа? 
// Если да, то вывести номера этих элементов.

import java.util.Random;

public class Task4 {

	public static void main(String[] args) {
		int[] arr;
		arr = new int[] { 3, 50, 20, 7, 19, 48, 7, 9, 12, 113 };
		int primesInArray;
		Random rand = new Random();
		int[] arrayOfPrimes;

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%3d] ", arr[i]);
		}
		System.out.println();

		primeCountOutprint(countPrime(arr));

		displayPrimePosition(arr);

	} 
	

	public static int countPrime(int[] arr) {
		int count;
		count = 0;
		int flagPrime = 1;
		int notPrime = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 1) {
				count = count + notPrime;
			} else if (arr[i] <= 3) {
				count = count + flagPrime;
			} else if ((arr[i] % 2 != 0) && (arr[i] % 3 != 0) && (arr[i] % 5 != 0)) {
				count = count + flagPrime;
			}
		}
		return count;
	}
	

	public static void primeCountOutprint(int count) {
		if (count == 0) {
			System.out.println("No Prime numbers found.");
		} else {
			System.out.println("Quantity of Prime numbers in the array: " + count);
		}
	}
	

	public static void displayPrimePosition(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 1 && arr[i] <= 3) {
				System.out.println("Prime numbers in the cell # " + i);
			} else if ((arr[i] % 2 != 0) && (arr[i] % 3 != 0) && (arr[i] % 5 != 0)) {
				System.out.println("Prime numbers in the cell # " + i);
			}
		}

	}
}
