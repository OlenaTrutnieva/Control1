package by.training.control.task;

public class Task5 {

	public static void main(String[] args) {
		int quantityOfElements;
		int[][] arr;
		arr = new int[][] {{3, 5, 3, 6, 9}, {1, 4, 4, 6, 3}, {1, 2, 3, 2, 1}, { 5, 4, 3, 2, 1}, {0, 1, 2, 3, 4}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%3d] ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				count();
			}
			quantityOfElements = count();
			System.out.println("QuantityOfElements is: " + quantityOfElements);
			System.out.println();
		}

	}
	
	
		
	
	public static int count(int[][] arr) {
		int x;
		x = 0;
		int count;
		count = 0;
		int[] mas;
		mas = new int[5];
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > mas[i++]) {
				count++;
			}
		}
		return count;
		
	}

}
