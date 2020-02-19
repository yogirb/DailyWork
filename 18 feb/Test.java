package newproject;

public class Test {
	public static void main(String...args)
    
	
	{
		StaticDemo d=new StaticDemo();
		StaticDemo d1=new StaticDemo();
		d1.x=30;
		System.out.println(d.x);
		System.out.println(d.y);
		System.out.println(d1.x);
	}
}


class StaticDemo
{
	 int x=10;
	 static int y=20;
	 
	 static public void show()
	 {
		 System.out.println("x");
	 }
}