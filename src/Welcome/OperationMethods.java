package Welcome;

import java.util.Iterator;

public class OperationMethods {
	public static int number;
	public static String name;
public static void main(String[] args) {
	name="suhail Ahmad Riyaz";
	System.out.println("Length of the name is: " + name.length());
	System.out.println("The character at index 3 is: " + name.charAt(3));
	System.out.println("Sub String in the start and end of the name are: " + name.substring(4, 10));
	System.out.println("Find index result with index is: " + name.indexOf("Ri"));
	System.out.println("Replace method result is: " + name.replace("Ahmad", "Abdullah"));
	//Replace All
	System.out.println("Replace All method result is: " + name.replaceAll(name, "Sulaiman Suhail"));	
	//Split
	String[] splitName=name.split(" ");
	for (String namex : splitName) {
		System.out.println("afer split by space the name is:" + namex);
	}	
	//Case Conversion
	System.out.println("to Uppar Case Results is: " +name.toUpperCase());
	System.out.println("to uppar case result of first name only is:" + splitName[0].toUpperCase());
	
	System.out.println("to lower case result is:" +name.toLowerCase());
	System.out.println("to lower case result of Middle name is: " + splitName[2].toLowerCase());		
}
}
