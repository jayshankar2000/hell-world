package recursion;
import java.util.Scanner;
public class printnum {
	public static int printnum(int n) {
		if(n<1) {
			return 1;
		}
		System.out.print(n+" ");
		return printnum(n-1);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num  =sc.nextInt();
	  printnum(num);
	
}
}
