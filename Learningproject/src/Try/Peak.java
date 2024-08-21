package Try;

import java.util.Scanner;

public class Peak {
static int Peakelement(int arr[],int n) {
	int index=n-1;
	if(arr[0]>=arr[1])
			return 0;
		if(arr[index]>=arr[index-1])
		return index;
	for(int i=1;i<index;i++) {
		if(arr[i]>=arr[i+1])
			return i;
	}
	return -1;
	

 }
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter number:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			}
		int index =Peakelement(arr,size);
		System.out.println(index);
	}

}
