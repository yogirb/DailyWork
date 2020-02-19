package newproject;



class p
{
	
	 public void display()
	 {
		 System.out.println("class A");
	 }
}

class q extends p
{
	
	public void display()
	{
		System.out.println("class B");
	}
}


class Poly
{          // @Override
	public static void main(String[] args)
	{  
		p a1=new q();
		a1.display();
	}
}