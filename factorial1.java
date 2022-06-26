package recursion;
import java.util.Scanner;
public class factorial1 {
	public static int fact(int n) {
		//if(n==0) 
		if(n<=1){
			return 1;
		}
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result=fact(num);
		System.out.println(result);
		
	}

}
 