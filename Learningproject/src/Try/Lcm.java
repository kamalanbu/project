package Try;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		int a,b,i,gcd=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close();
		int c=(a<b)?a:b;
		c=c-1;
		for(i=b;i>=2;i--) {
			if(a%i==0&&b%i==0) {
				gcd=i;
			    break;
			}
			}
		int lcm=(a*b)/gcd;
		System.out.println("gcd:"+gcd);
		System.out.println("lcm:"+lcm);
		int d=(a>b)?a:b;
		for( i=d;i<=a*b;i++) {
			if(i%a==0&&i%b==0) {
				System.out.println("lcm:"+i);
				break;
			}
		}
	}

}
