package recursion;
import java.util.Scanner;
public class main4 {
	public static void call(int n) {
		if(n==0) {
			return;
		}
			
			call(n-1);
			System.out.print(n+" " );
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		call(num);
		
		
	}
}
