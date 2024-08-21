package Try;

public class  Rough extends ufuhd{
	public void shj(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	int i;
	boolean met() {
		return i>0;
	}
	int met1() {
		return i--;
	}
	
	public static void main(String[] args) {
	Rough obj=new Rough();
	obj.i=5;
	ufuhd ob1=new ufuhd();
	//Kamal onj1=ob1.new Kamal();
	//onj1.nhg();
	System.out.println(ob1.i);
		System.out.println(obj.met1());
		System.out.println(obj.met1());
	}
}
