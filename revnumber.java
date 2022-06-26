package recursion;
import java.util.Scanner;
public class revnumber {
	public static void revn(int n) {
		if(n==0) {
			return;
		}
		 int rem =n%10;
		 System.out.print(rem+" ");
		 revn(n/10);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		revn(num);
	}

}
