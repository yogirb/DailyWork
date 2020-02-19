package newproject;
import java.util.Scanner;

public class TAsk {
	
	public static void main(String args[])
	{		Scanner input = new Scanner( System.in );
		System.out.println("Enter 1st number: ");
		int min = input.nextInt( );
		Scanner input1 = new Scanner( System.in );
		System.out.println("Enter last number: ");
		int max = input1.nextInt( );		int count=0;
for(int i = min; i<=max; i++)
{    String number = String.valueOf(i);
    while(number.contains("1"))
    {
        number= number.substring(number.indexOf("1")+1);
        count ++;
    }
}
System.out.println(count);

	}
}

