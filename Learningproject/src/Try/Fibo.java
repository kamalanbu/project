package Try;

 class Fibo {

	public static void main(String[] args) {
		int i,n1,n2,n3,count;
		n1=0;
		n2=1;
		count=15;
		for(i=0;i<count;i++) {
			if(i==0||i==1) {
				System.out.print(i+",");
			}
			else {
				n3=n1+n2;
				System.out.print(n3+",");
				n1=n2;
				n2=n3;
			}
		}
		
	}

}
