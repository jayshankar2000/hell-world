package recursion;
import java.util.Scanner;
public class power2 {
	public static int power(int x ,int n) {
		if(x==0||n==0) {
			return 1;
		}
		if(x==0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}
		return x*power(x, n-1);
		
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num = sc.nextInt();
	int pow = sc.nextInt();
	int result = power(num ,pow);
	System.out.println(result);
	
}
}
