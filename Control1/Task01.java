package by.training.control.task;

public class Task01 {

	public static void main(String[] args) {
		double x;
		double y;
		double result;
		
		x = initializationX();
		y = initializationY();
		
		result = (numerator() / numerator()) + x;
		

		System.out.println("Result equals: " + x);
	}
	
	public static double initializationX() {
		double x;
		x = 20.5;
		return x;
	}
	
	public static double initializationY() {
		double y;
		y = 1.200;
		return y;
	}
	
	public static double numerator() {
		double x;
		double y;
		double a;
		
		x = initializationX();
		y = initializationY();
		
		a = (1 + Math.pow((Math.sin(x + y)), 2));
		return a;
		
	}
	
	public static double denominator() {
		double x;
		double y;
		double a;
		
		x = initializationX();
		y = initializationY();
		
		a = (2 + Math.abs(x - ((2 * x) / (1 + (Math.pow(x, 2)) * (Math.pow(y, 2))))));
		return a;
		
	}
	

}
