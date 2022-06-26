package recursion;
import java.util.Scanner;
public class main5 {
	public static void funrev(int n) {
		if(n==0) {
			return;
			
		}
		 System.out.print(n+" ");
		 fun(n-1);
		
		 
		
	}
	public static void fun(int n) {
		if(n==0) {
			return;
			
		}
		 fun(n-1);
		 System.out.print(n+" ");
		 
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		fun(num);
	
		
	}

}
