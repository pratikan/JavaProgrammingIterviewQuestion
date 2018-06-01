//How To Print * Pattern
/*
***
*****
*******
**********/

package javainterviewprogram;

public class PrintThePattern {

	public static void main(String[] args) {
		int p = 0;
		for( int i=0; i<=5; i++ ){
		for( int k=1; k<=5-i; k++ ){
		System.out.print (" ");
		}
		for( int j=1; j<=i+p; j++ ){
		System.out.print ("*");
		}
		System.out.println ();
		p=p+1;
		}
		}

	}


