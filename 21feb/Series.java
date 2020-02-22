package newproject;

public class Series {
	
	public static void main(String[] args)
	{
		int p=36;
		int i;
		int count=0;
		for( i=p;i>=10;i--)
		{
			count++;
			System.out.println(i);
			i--;
			if(count%2==0)
				i=i-2;
			}
		
	}
	

}
