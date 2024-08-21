package Try;

import java.util.Arrays;

 public class Problems {
  private class Kamal{
		 int nhg() {
			 System.out.println("kaml");
			return 3;
		}
	}
	int i;
	void metd() {
		i++;
		System.out.println(i);
	}
	public static void main(String[] args) {
	   
		Problems obj=new Problems();
		obj.metd();
		obj.metd();
		Problems obj1=new Problems();
		obj1.metd();
		System.out.println(obj1.i);
		
	  /*  Kamal obj2=obj1.new Kamal();
		System.out.println(obj.i);
	    System.out.println(obj1.i);
	    System.out.println(obj2.nhg());
	    ufuhd.main(null);*/
	}
	
}
 class ufuhd extends Problems{
	static void bj() {
		System.out.println("kamal");
	}
	public static void main(String[] args) {
		System.out.println("hi");
		ufuhd.bj();
	}
}
