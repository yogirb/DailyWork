package newproject;


public class ThreadTwo implements Runnable
{
	Resource resource;	
	
	public ThreadTwo(Resource resource)
	{
		this.resource=resource;
	}
	 @Override
	 public void run() {
		 try {
			resource.display("Thread-2");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }}




	

		
		//for(int i=1;i<=10;i++)
		//{
		//	   System.out.println("Thread-2:"+i);
		//}
	
	
	
	
