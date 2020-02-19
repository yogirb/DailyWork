package newproject;

public class Interface
{	
	public static void main(String...args) 
	{		
		Impl imp=new Impl();
    System.out.println(imp.add(3, 5));
    System.out.println(imp.Sub(8, 5));
    System.out.println(imp.mul(8, 5));
    }
}

interface Add
{
    int add(int a,int b);
    default int mul(int a,int b)
    {
    	return a*b;
    }
}

interface Sub
{
int Sub(int a,int b);
}


class Impl implements Add,Sub 
{
public int add(int a, int b)
{
return a+b;
}
public int Sub(int a, int b)
{
return a-b;
}
}