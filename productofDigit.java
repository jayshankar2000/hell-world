package recursion;
import java.util.Scanner;
public class productofDigit {
	public static int prodDigit(int n) {
		if(n%10==n) {
			return n;
		}
		return n%10 * prodDigit(n/10);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = prodDigit(num);
		System.out.println(result);
		
	}

}
