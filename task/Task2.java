package by.training.control.task;

import java.util.Scanner;
import java.util.Random;

public class Task2 {

	public static void main(String[] args) {
		int[] arr;
		int quantity;
		int count;
		
		Random rand = new Random();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter integer> ");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("No-no-no! Enter integer > ");
		}
		quantity = sc.nextInt();
		
		arr = new int[quantity];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(25);
			System.out.printf("[%3d] ", arr[i]);
		}
		System.out.println();
		
		System.out.println("Quantity of numbers > 15 or < 2: " + calculateNumbers(arr));
		System.out.println("Sum of numbers devided into 5 with remaider 4: " + calculateSum(arr));
	
	}
	
	public static int calculateNumbers(int[] arr) {
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 15 || arr[i] < 2) {
				count++;
			}
		}
		return count;
	}
	
	public static int calculateSum(int[] arr) {
		int sum;
		sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 4) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}

}
