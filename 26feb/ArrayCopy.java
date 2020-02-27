package newproject;


import java.util.Arrays;

public class ArrayCopy {
	public static void main(String args[]){
		int a[]={15,10,12};
		int b[]=new int[a.length];
		
		
		b=Arrays.copyOf(a,a.length);
		
		
		for(int i=0;i<b.length;++i){
			System.out.println("b["+i+"]:"+b[i]);
		}
	}
}