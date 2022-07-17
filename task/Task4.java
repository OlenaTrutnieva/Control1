package by.training.control.task;

import java.util.Random;

public class Task4 {

	public static void main(String[] args) {
		int[] arr;
		arr = new int[] { 3, 5, 20, 7, 19 };
		int primesInArray;
		Random rand = new Random();
		int[] arrayOfPrimes;

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%3d] ", arr[i]);
		}
		System.out.println();

		primesInArray = findPrime(arr);
		System.out.println("Quantity of Primes in array:" + primesInArray);

		arrayOfPrimes = arrayOfPrimes(arr);
		System.out.println(arrayOfPrimes);

	}

	public static int findPrime(int[] arr) {
		int count;
		count = 0;
		int y;
		y = 0;
		int z;
		
		

		for (int i = 0; i < arr.length; i++) {
			z = arr[i] / 2;
			if (arr[i] == 0 || arr[i] == 1) {
				y = 1;
			}
			else {
				for (int x = 2; x <= z; x++) {
					if (arr[i] % x == 0) {
						y = 1;  
					}
					else {
						y = 0;
					}
				}
				
			}
			if (y == 0) {
				count++;
			}
		}

		return count;
	}

	public static int[] arrayOfPrimes(int[] arr) {
		int elementsQuantity;
		int[] arrayOfPrimes;
		elementsQuantity = findPrime(arr);
		arrayOfPrimes = new int[elementsQuantity];
		int y;
		y = 0;
		int z;
		
		for (int i = 0, j = 0; i < arr.length; i++) {
			z = arr[i] / 2;
			if (arr[i] == 0 || arr[i] == 1) {
				y = 1;
			}
			else {
				for (int x = 2; x <= z; x++) {
					if (arr[i] % x == 0) {
						y = 1;  
					}
					else {
						y = 0;
					}
				}
				
			}
			if (y == 0) {
				arrayOfPrimes[j++] = i;
			}
		}
		


		return arrayOfPrimes;

	}
}
