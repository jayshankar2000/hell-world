package recursion;
import java.util.Scanner;
public class febonaaci {
	public static int febo(int n) {
		if(n==0||n==1) {
			return n;
		}
		 return   febo(n-1)+febo(n-2);
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	 int result = febo(num);
	 System.out.println(result);
}
}
