package Try;

public class Problem {

	public static void main(String[] args) {
		char ar[]= {'a','e','i','o','u'	};
		char ch='u';
		for(char cha : ar) {
			if(ch==cha) {
				System.out.println("vowel");
				break;
			}
			else if(ch!=cha){
				continue;
			}
			else {
				System.out.println("constant");
			}
			
			
		}
	
	}
}
