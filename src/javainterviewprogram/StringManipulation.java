package javainterviewprogram;

public class StringManipulation {

	public static void main(String[] args) {
	  String str="The rains have started here";
	 String str1="The rains Have started here";
	 System.out.println(str.length());
	 System.out.println(str.charAt(5));//a is on 5th position count starting from 0
	 System.out.println(str.indexOf("s"));//s position is 8th
	 System.out.println(str.indexOf("s",str.indexOf("s")+1));//2nd occurrence of s
	 //System.out.println(str.indexOf("s",str.indexOf("s",str.indexOf("s")+1)+1));//3rd occurrence of s
	 System.out.println(str.indexOf("have"));
	 System.out.println(str.indexOf("rains"));
	 System.out.println(str.indexOf("Hello"));//Hello not present in string so output -1
	 
	 //String comparison
	 System.out.println(str.equals(str1));//both strings are same
	 System.out.println(str.equalsIgnoreCase(str1));
	 
	 //Substring
	 System.out.println(str.substring(0, 9));
	 //trim
	 String s=" Hello World ";
	 System.out.println(s.trim());
	 System.out.println(s.replace(" ", ""));
	 
	 String date="05-11-1989";//want to replace with 05/11/1989
	 System.out.println(date.replace("-","/"));
	 
	 //Split
	 String test="Hello_World_Test_Selenim";
	 String testval[]=test.split("_");
	 for(int i=0;i<testval.length;i++){
		 System.out.println(testval[i]);
	 }
	 //String concatenation means add or merge
	 String s2="cares";
	 System.out.println(s2.concat("s"));//caress output after cancat
	 
	 String x="Hello";
	 String y="World";
	 int a=100;
	 int b=200;
	 System.out.println(x+y+a+b);
	 System.out.println(x+y+(a+b));
	 System.out.println(a+b+x+y);
	 }
}
