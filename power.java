package recursion;
import java.util.Scanner;
public class power {
	public static int pow(int n, int r) {
	
		for(int i=1;i<r;i++) {
			return n*pow(n);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int Pow = sc.nextInt();
		int result= pow(num,Pow);
	}

}
