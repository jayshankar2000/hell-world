package recursion;

public class revn1 {
	 static int sum=0;
	public static void revn2(int n) {
		if(n==0) {
			return;
		}
		int rem = n%10;
		sum =sum*10+rem;
		  revn2(n/10);
		
	}
	public static void main(String[] args) {
		revn2(01030);
		System.out.println(sum);
		
	}

}
 