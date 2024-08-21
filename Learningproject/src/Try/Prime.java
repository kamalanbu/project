package Try;

public class Prime {
	public static void main(String[] args) {
		
		int i,n;
		n=467;
		i=2;
		boolean flag=false;
		for(i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("it is not a prime number");
		}
		else {
			System.out.println("it is a prime number");
		}
		
	}

}
