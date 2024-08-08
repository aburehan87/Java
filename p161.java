//Threading

class p161
{
	public static void main(String cp[])
	{
		try
		{
			
			for(int i=0;i<=3;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
	
}

	