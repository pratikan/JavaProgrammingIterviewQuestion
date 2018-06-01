package javainterviewprogram;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsinArray {

	public static void main(String[] args) {
		String names[]={"java","java script","ruby","python","c","java","c"};
		//1 compare each element/worse choice 
		for(int i=0;i<names.length;i++){
			for(int j=i+1;j<names.length;j++){
				
		           if(names[i].equals(names[j])){
					System.out.println("Duplicate element is::"+names[i]);
				}
			}
		}
//2 by Using hashset:it is a part of java collection
		//duplicates are not allowed
		
		Set<String> store=new HashSet<String>();
		for(String name:names){
			if(store.add(name)==false){
				System.out.println("Duplicate element is::"+name);
			}
		}
		
	}

}
