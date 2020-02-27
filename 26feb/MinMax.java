package newproject;

public class MinMax 
{
	public static void main(String[] args) 
	{
		int a[] = new int[] { 45,52,21 };

		int min = a[0]; 
		int max = a[0]; 

		for (int i = 1; i < a.length; i++)  
		{
			if (a[i] > max) 
			{
				max = a[i];
			}
			if (a[i] < min) 
			{
				min = a[i];
			}
		}

		System.out.println("Max : " + max);
		System.out.println("Min " + min);
	}

}