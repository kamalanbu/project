package Try;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		int i=0,N,j;
		Boolean check=true;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Print prime number upto:");
	    N=sc.nextInt();
	    for(i=0;i<=N;i++) {
	    	if(i==0||i==1) {
	    		continue;
	    	}
	    	check=true;

	    	for(j=2;j<=i/2;j++) {
	    		if(i%j==0) {
	    			check=false;
	    			break;
	    		}	
	    	}
	    	if(check) {
    			System.out.print(i+",");
	    	}
	    }
	
		

	}

}
