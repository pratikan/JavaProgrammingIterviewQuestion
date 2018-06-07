package javainterviewprogram;

import java.util.Scanner;

//Fibonacci number-The number is said to be in a Fibonacci series if 
//each subsequent number is the sum of the previous two numbers.

public class FindFibobacciSeries {

	public static void main(String[] args) {
		//case1
		/*int a=0;
		int b=1;
		int i;
		for(i=0;i<10;i++){
			System.out.println(a);
			a=a+b;
			b=a-b;
*/
		//case 2 using arrya
		int febCount = 15;
        int[] feb = new int[febCount];
        feb[0] = 0;
        feb[1] = 1;
        for(int i=2; i < febCount; i++){
            feb[i] = feb[i-1] + feb[i-2];
        }

        for(int i=0; i< febCount; i++){
                System.out.print(feb[i] + " ");
        }		
        //3 using scanner class
		/* int n, a = 0, b = 0, c = 1;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter value of n:");
	        n = s.nextInt();
	        System.out.print("Fibonacci Series:");
	        for(int i = 1; i <= n; i++)
	        {
	            a = b;
	            b = c;
	            c = a + b;
	            System.out.print(a+" ");
	        }
		
		
		*/

	}

}
