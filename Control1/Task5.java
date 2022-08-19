package by.training.control.task;

import java.util.Random;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		int quantityOfElements;

		int[] arr;

		System.out.println("Enter quantity of elements in the array> ");

		arr = new int[quantityOfElements()];
		initializeArray(arr);
		printArray(arr);

		System.out.println();
		
		countMinElement(arr);

	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("[%3d] ", array[i]);
		}
		System.out.println();
	}

	public static int quantityOfElements() {

		Scanner scanner = new Scanner(System.in);

		while (!scanner.hasNextInt()) {
			scanner.nextLine();
			System.out.println("You entered incorrect value. Please enter integer.");
		}
		return scanner.nextInt();
	}

	public static int[] initializeArray(int[] array) {
		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
		}
		return array;
	}

	
	public static void countMinElement(int[] arr) {
		int count;
		count = 0;

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					count++;
					break;
				}
			}
 
		}
		System.out.println("Quantity of elements to matching the array: " + count);
	}

}
