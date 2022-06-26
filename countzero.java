package recursion;

public class countzero {
	public static int count(int n) {
		if(n==0) {
			return 1;
		}
		 int rem = n/10;
		 if(rem==0) {
			 return 1+count(n/10);
		 }
		
	}
      public static void main(String[] args) {
		
	}
}
