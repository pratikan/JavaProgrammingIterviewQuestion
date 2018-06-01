package javainterviewprogram;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String s="100";
		System.out.println(s+20);//String concatenation
		int x=Integer.parseInt(s);//conversion string to integer using wrapper class
		System.out.println(x);
		//no of wrapper class Integer,Double,Character,Boolean
		//String to Double
		String y="23.13";
		
		System.out.println(y+10);
		double d=Double.parseDouble(y);
		System.out.println(d+20);
		
		//String to Boolean
		String k="true";
		boolean b=Boolean.parseBoolean(k);
		System.out.println(b);
		
		//int to String conversion
		int j=200;
		System.out.println(j+20);
		String ss=String.valueOf(j);//"200"
		System.out.println(ss+20);
		
		String u="100A";
		Integer.parseInt(u);//exception-NumberFormatException
		
		
		

	}

}
