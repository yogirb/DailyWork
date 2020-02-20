package newproject;

import java.util.Scanner;

public class Split

{  
public static void main(String args[])
{  
	 Scanner input = new Scanner(System.in);
	  System.out.println("Enter string :");
	   String str = input.nextLine();


 // String strMain ="Welcome sir"; 
  String[] arrSplit_3 = str.split("\\s");
    for (int i=0; i < arrSplit_3.length; i++)
    {
      System.out.println(arrSplit_3[i]);
    }
  }
}