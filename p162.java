class MyThread
implements Runnable
{
	Thread t;
	public void beginThread()//here,we create a begin function for the thread
	{
		t=new Thread(this);//here,this is used to indicate that this thread works in this class
		t.start();
	}
	public void run()//here,we create a run function for the thread which will be called in the main class
	{
		try
		{
			for(int i=1;i<=3;i++)
			{
				Thread.sleep(2000);
				System.out.println(i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	class p162
	{
		public static void main(String cp[])
		{
			System.out.println("Main Begins");
			MyThread mt=new MyThread();//this creates the object mt
			mt.beginThread();//this starts the thread,which is called from the begin function
			System.out.println("Thread stops");
		}
	}
}

			
		