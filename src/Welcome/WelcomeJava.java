package Welcome;

public class WelcomeJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to java");
		String S1="test";  //String initailized using literals
		String S2="test2";   //String initailized using literals
		System.out.println(S1==S2);// equals comparator
		
		//String using New keywords
		
		String obj1=new String("Sadashiv");//String decration using new keyword
		String obj2=new String("Sadashiv");//String decration using new keyword
		
		
		System.out.println(obj1==obj2);// 
		
		System.out.println(obj1.equals(obj2));
		
		System.out.println(obj1.length());
	
		
		

	}

}
