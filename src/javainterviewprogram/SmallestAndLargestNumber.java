package javainterviewprogram;

import java.util.Arrays;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		int numbers[] ={-10, 24 ,50 ,-88 ,98747};
		//              (0  ,1  ,2 , 3 , 4)position
		//time complexity=O(n)
		int largest=numbers[0];
	    int smallest=numbers[0];
	    for(int i=1;i<numbers.length;i++){
	    	if(numbers[i]>largest){
	    		largest=numbers[i];//24/50/98747
	    	}
	    	else if(numbers[i]<smallest){
	    		smallest=numbers[i];//-88
	    	}
	    }
	    System.out.println("\n given array is::"+ Arrays.toString(numbers));
	    System.out.println("largest number is ::"+largest);
	    System.out.println("smallest number is ::"+smallest);
	}

}
