package recursion;

public class main3 {
	public static void print(int n) {
		//base condition
		if(n==5) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		// recursive call
		print(n+1);
	}
	
	public static void main(String[] args) {
		 print(1);
		
	}

}
