package newproject;

public class MainThread

{

	public static void main(String[] args)
	{
		 System.out.println(Thread.currentThread().getName());
		
		ThreadDemo thread1 = new ThreadDemo();
		ThreadTwo thread2=new ThreadTwo();
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY-2);
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY+2);
		t1.start();
		t2.start();
		
		
		System.out.println("main thread priority:"+Thread.currentThread().getPriority());
		System.out.println("thread-1 priority:"+t1.getPriority());
		System.out.println("thread-2 priority:"+t2.getPriority());
		
		
		//for(int i=1;i<=5;i++)
		//  {
		//	 System.out.println(Thread.currentThread().getName()+":"+i);
	   // 	}
		
		
		
		
		//Thread t= Thread.currentThread();
		//System.out.println(t);
       /// System.out.println(t.getName());
      //  t.setName("thread1");
    	//System.out.println(t);
      //  System.out.println(t.getPriority());
      //  System.out.println("main thrad:"+t.isDaemon());
     //   System.out.println("isAlive:"+t.isAlive());

	}

}
