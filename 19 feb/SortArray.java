package newproject;
import java.util.Scanner;
import java.util.Arrays;


public class SortArray {
	
	
public static void main(String args[])
{
	
   Scanner input = new Scanner(System.in);
   System.out.println("Enter string :");
   String str = input.nextLine();


    char chk [] = str.toCharArray();
   for (int i = 0; i < chk.length; i++) {
     Arrays.sort(chk);
    System.out.print(+chk[i]);
}
}
}