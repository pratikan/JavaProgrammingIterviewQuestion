package javainterviewprogram;

public class ReverseAString {

	public static void main(String[] args) {
		
	   String s="Selenium";
	//1 using for loop
	   int len = s.length();
	   String rev="";
	   
	   for(int i=len-1;i>=0;i--){
		rev=rev+s.charAt(i); 
		//System.out.println(rev);
	   }
	   System.out.println(rev);
	   
	//2 using string buffer class
	   StringBuffer sf=new StringBuffer(s);
	   System.out.println(sf.reverse());
	}

}