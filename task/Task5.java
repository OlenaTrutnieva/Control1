package by.training.control.task;

public class Task5 {

	public static void main(String[] args) {
		int quantityOfElements;
		int count;
		int[][] arr;
		arr = new int[][] {{3, 5, 3, 6, 9}, {1, 4, 4, 6, 3}, {1, 2, 3, 2, 1}, { 5, 4, 3, 2, 1}, {0, 1, 2, 3, 4}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%3d] ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		count = compare();
		
		
		System.out.println();

	}
	
	public static int compare(int arr[][]) {
		int count;
		count = 0;
		
		for (int i = 0; i < 1; ) {
			for (int j = 0; j < arr[i].length -1; j++) {
				if (arr[0][0] > arr[0][j + 1]) {
					count++;
				}
				
			}
			
		}
		System.out.println("QuantityOfElements is: " + count);
		
		return count;
	}
	
}
