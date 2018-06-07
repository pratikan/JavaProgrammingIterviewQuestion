package javainterviewprogram;

public class ReverseAnInteger {

	public static void main(String[] args) {
   long num=87654;
   long rev=0;
   while(num!=0){
	   rev= rev*10 + num%10;
	   num= num/10;
	   
   }
        System.out.println("reverse num is :"+rev);
        
        
      //2-Using StringBuffer method
       long num1=12345;
        System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}
