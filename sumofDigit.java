package recursion;
import java.util.Scanner;
public class sumofDigit {
	public static int digitsum(int n) {
		if(n==0) {
			return 0;
		}
		return n%10 + digitsum(n/10);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result=digitsum(num);
		System.out.println(result);
		
	}

}
