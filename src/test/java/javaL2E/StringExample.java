package javaL2E;

public class StringExample {
	
		public static void main(String args[]){  
		String s4="java";  
		char ch[]={'s','t','r','i','n','g','s'};  
		String s2=new String(ch);  
		String s3=new String("example");  
		System.out.println(s4);  
		System.out.println(s2);  
		System.out.println(s3);  
		
		String s1="java by javatpoint";  
		System.out.println(s1.endsWith("t"));  
		System.out.println(s1.endsWith("point"));
		
		 String str = "Welcome to Javatpoint.com";  
	        System.out.println(str.endsWith("point"));  
	        if(str.endsWith(".com")) {  
	            System.out.println("String ends with .com");  
	        }else System.out.println("It does not end with .com"); 
		}
}
	
