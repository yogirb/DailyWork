package newproject;


class MyInner
{
	int age=10;
   class YouInner
   {
	   public void show()
	   {
		   System.out.println("Hello Inner Class :"+age);
	   }
   }
}


public class OuterDemo {

	public static void main(String[] args) {
	
		MyInner myInner=new MyInner();
		
		MyInner.YouInner youInner=myInner.new YouInner();
	youInner.show();
		
	}

}