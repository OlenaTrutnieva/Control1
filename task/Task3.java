package by.training.control.task;

public class Task3 {

	public static void main(String[] args) {
		double a;
		double b;
		double h;
		double y;
		
		a = initializationA();
		b = initializationB();
		h = initializationH();
		
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		
		for(double x = a; x <=b; x = x + h) {
			y = Math.tan(x);
		System.out.printf("|\t%4.2f\t|\t%4.2f\t|\n", x, y);
		}
		System.out.println("---------------------------------");


	}
	
	public static double initializationA() {
		double x;
		x = 3.5;
		return x;
	}
	
	public static double initializationB() {
		double x;
		x = 30.5;
		return x;
	}
		
	public static double initializationH() {
		double x;
		x = 3.1;
		return x;
	}

}
