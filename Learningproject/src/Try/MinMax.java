package Try;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size:");
		int n=sc.nextInt();
		long arr[]=new long[n];
		System.out.println("enter number:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		long min=arr[0];
		long max=arr[0];
		for(int i=1;i<n;i++) {
			if(min>arr[i])
				min=arr[i];
			if(max<arr[i])
				max=arr[i];
		}
		
		System.out.println("maximum:"+max);
		System.out.println("minimum:"+min);

	}

}
