package javainterviewprogram;

public class ReverseAnInteger {

	public static void main(String[] args) {
   int num=87654;
   int rev=0;
   while(num!=0){
	   rev= rev*10+num%10;
	   num=num/10;
	   
   }
        System.out.println("reverse num is :"+rev);
      //2-Using StringBuffer method
        int num1=12345;
        System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}
