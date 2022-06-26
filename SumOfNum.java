package recursion;
import java.util.Scanner;
public class SumOfNum {
	
	public static int SumN(int n) {
	 if(n<1) {
		 return 0;
	 }
	  return  n+SumN(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result=SumN(num);
		System.out.println(result);
	}

}
