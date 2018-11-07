/*
	À¿À¯’πœ÷

*/
class Test implements Runnable
{
	private boolean flag;
	Test(boolean flag)
	{
		this.flag=flag;
	}
	public void run()
	{
		if(flag)
		{
			synchronized(myLock.locka)
			{
				System.out.println("if...locka");
				synchronized(myLock.lockb)
				{
					System.out.println("if...lockb");
				}
			}
		}	
		else
		{
			synchronized(myLock.lockb)
			{
				System.out.println("else...lockb");
				synchronized(myLock.locka)
				{
					System.out.println("else...locka");
				}
			}
		}	
	}
}
class myLock
{
	public static final Object locka=new Object();
	public static final Object lockb=new Object();
	
}
class DeadLock
{
	public static void main(String[] args)
	{
		Test t1=new Test(true);
		Test t2=new Test(false);
		Thread d1=new Thread(t1);
		Thread d2=new Thread(t2);
		d1.start();
		d2.start();
	}
}














