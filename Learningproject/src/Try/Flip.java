package Try;

import java.util.Scanner;

public class Flip {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=obj.nextInt();
		int digit;
		int rem=0;
		digit=1;
		System.out.print("fliped number:");

		while(true) {
			rem=num%10;
			System.out.print(rem);
			num=num/10;
			if(num==0)
				break;
			digit++;
		}
		System.out.println();
		System.out.println("Digit:"+digit);
		obj.close();

	}

}
