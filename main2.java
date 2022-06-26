package recursion;

public class main2 {
	public static void main(String[] args) {
		// write a function that takes in a number and print it
		//print first 5 number : 1 2 3 4 5
		print1(1);
	}
	public static void print1(int n) {
		System.out.println(n);
		print2(2);
	}
	public static void print2(int n) {
		System.out.println(n);
		print3(3);
	}
	public static void print3(int n) {
		System.out.println(n);
		print4(4);
	}
	public static void print4(int n) {
		System.out.println(n);
		print5(5);
	}
	public static void print5(int n) {
		System.out.println(n);
	
	}
	
}
