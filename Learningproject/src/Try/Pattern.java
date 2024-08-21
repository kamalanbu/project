package Try;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size for Diamond:");
		int row,i,j,k,l;
		l=1;
		row=sc.nextInt();
		for(i=1;i<=row;i++) {
			for( j=i;j<row;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print(l+" ");
				l+=1;
			}
			l=1;
			System.out.println();
		}
		for(i=1;i<row;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(k=i;k<row;k++) {
				System.out.print(l+" ");
				l+=1;
			}
			l=1;
			System.out.println();
		}
		
	}

}
