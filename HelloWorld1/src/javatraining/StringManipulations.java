package javatraining;

public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//comparing two strings
		
		String S1= "Hello";
		String S2= "Hello";
		String S3= "hello";
		
		if (S1==S2) {
			System.out.println("Equal");
		}
		
		if (S1==S3) {
			System.out.println("Equal");
		}
		// e= is object of string case
		if (S1.equals(S3)) {
			System.out.println("Equals");
		}
		
		// equals ignore case is string function
		if (S1.equalsIgnoreCase(S3)) {
			System.out.println("Equals ignore case");
		}
		
		//finding a word in a scentence
		String S4 = "How are you ?";
				
		if (S4.indexOf("you") != 1) {
			System.out.println("Found");
		}
			else {
			System.out.println("Not Found");
		}
		
		System.out.println(S4.toUpperCase());
				
				
		
		

	}

}
