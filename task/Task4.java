package by.training.control.task;

import java.util.Random;

public class Task4 {

	public static void main(String[] args) {
		int[] arr;
		arr = new int[] { 34, 56, 2, 7, 19 };
		boolean primesInArray;
		Random rand = new Random();
		int[] arrayOfPrimes;

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%3d] ", arr[i]);
		}
		System.out.println();

		primesInArray = findPrime(arr);
		System.out.println("Prime(s) exist(s) in array:" + primesInArray);

		arrayOfPrimes = arrayOfPrimes(arr);
		System.out.printf("Array of Primes: ", arrayOfPrimes);

	}

	public static boolean findPrime(int[] arr) {
		boolean isPrime;
		isPrime = false;
		int[] denominator;
		denominator = new int[] { 2, 3, 5, 7 };

		for (int i = 0; i < arr.length; i++) {
			isPrime = true;

			for (int j = 0; j < denominator.length; j++) {

				if (arr[i] != denominator[j]) {
					if (arr[i] % denominator[j] == 0) {

						isPrime = false;
					}
				}

			}
		}

		return isPrime;
	}

	public static int[] arrayOfPrimes(int[] arr) {
		boolean isPrime;
		isPrime = false;
		int count;
		count = 0;
		int[] arrayOfPrimes;

		int[] denominator;
		denominator = new int[] { 2, 3, 5, 7 };

		for (int i = 0; i < arr.length; i++) {
			isPrime = true;

			for (int j = 0; j < denominator.length; j++) {

				if (arr[i] != denominator[j]) {
					if (arr[i] % denominator[j] == 0) {

						isPrime = false;
						count++;
					}
				}

			}
		}
		System.out.println("Count = " + count);

		arrayOfPrimes = new int[count];

		for (int i = 0; i < arr.length; i++) {
			isPrime = false;

			for (int j = 0, k = 0; j < denominator.length; j++) {

				if (arr[i] != denominator[j]) {
					if (arr[i] % denominator[j] != 0) {

						isPrime = true;
						arrayOfPrimes[k++] = arr[i];

					}
					

				}

			}

		}


		return arrayOfPrimes;

	}
}
