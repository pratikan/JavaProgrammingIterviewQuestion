package javainterviewprogram;

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
		int[]feb=new int[10];
		feb[0]=0;
		feb[1]=1;
		for(int i=2;i<10;i++){
			feb[i]=feb[i-1]+feb[i-2];
			}
		for(int i=0;i<10;i++){
			System.out.println(feb[i]);
		}
		

	}

}
