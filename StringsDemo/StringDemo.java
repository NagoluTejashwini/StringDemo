package StringsDemo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringDemo {
	Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	
		//new StringDemo().task1();
		//new StringDemo().task2();
		//new StringDemo().task3(); 
		new StringDemo().task4(); 
		new StringDemo().task5(); 
	}
	
	void task1()
	{
		String str = new String("Hello");
		//str.concat(" Java");
		str = str.concat(" Java");
		System.out.println(str);
		
		
		str=str.toLowerCase();
		System.out.println(str);
	}
	
	void task2()
	{
		String s1 = new String("  ABC");
		String s2 = new String("abc");
		String s3 = "ABC";
		String s4 = "ABC";

		boolean a = (s1 == s2); // false
		boolean b = (s3 == s4); // true
	
		boolean c = s1.equals(s2); //  false
		boolean d = s1.equalsIgnoreCase(s2); // true
		
	}
	
	// Spring API 
	void task3()
	{
		String s1 = "  abc  ";
		System.out.println(s1.length());
	
		s1 = s1.trim();
		System.out.println(s1.length());
		
		String s2 = "0123456789";
		s2 = s2.substring(5,8);
		System.out.println(s2);
		
		String s3 = "mike@gmail.com";
		char ch = s3.charAt(5);
		System.out.println(ch);
		
		char chArr[] = s3.toCharArray();
		// ======================================
		
		String s4 = "Hello How Are You!!";
		String arr[] = s4.split(" ");
		
		for (String str : arr) {
			System.out.println(str);
		}
		
		//============================
		
		
		
	
	}
	
	// -- Home Work ---
	void task4()
	{
		
		String s1 = "abc.xyz@gmail.com";
		//String s[]= s1.split("\\.");
		String s[] = s1.split(Pattern.quote(".")); //split works only on regular expressions dot is a character
		
		for (String str : s) {
			System.out.println(str);
		}
		System.out.println("--------------------------");
		String s2 = "Spring,Hibernate,Spring-Rest,Angular,React";
		String e[] = s2.split(",");
		for (String str : e) {
			System.out.println(str);
		}
		System.out.println("--------------------------");
		String s3 = "3+2=5";
		String e1[] = s3.split("\\+");
		for (String str : e1) {
			System.out.println(str);
		}
		System.out.println("--------------------------");
		String s4 = "mike@gmail.com";
		for(String str : s4.split("@|g|\\.")) {
			System.out.println(str);
		}
		//String str_split="split method.It is cool - (Hello-World)";
		 
        //for (String str_complex : str_split.split("\\s|,|\\.|-")) {
			//System.out.println(str_complex);
        //}
 
		
	}
	
	void task5()
	{
		
		String abuse[] = {"dog","stupid","idiot","buffalo"};
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		String str1="";
		String e[] = s.split(" ");
		for(String str: e) {
			for(int j = 0; j <abuse.length;j++) {
				if(str.equals(abuse[j])) {
					String s1 = str;
					char arr[] = s1.toCharArray();
					for(int k =0; k <arr.length;k++) {
						arr[k] = '#';
					}
					String s2 = String.valueOf(arr);
					str = s2;
					
				}
				
			}
			
			str1+=(str+" ");
		}
		System.out.println(str1);
		/*
		 Input msg:- Hello dog how are you idiot
		 output:- Hello ### how are you ##### 
		 
		 * */
	}
}
