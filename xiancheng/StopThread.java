/*
	线程停止两个方法：
		1，stop(过时)
		2，run方法结束
		
	怎么控制线程的任务结束呢？
	任务中都会有循环结构，只要控制住循环就可以结束任务。
	
	
	控制循环就用标记来完成。

*/

class StopThread
{
	public static void main(String[] args)
	{
		Task t=new Task();
		Thread d1=new Thread(t);
		Thread d2=new Thread(t);
		d1.start();
		d2.start();
		int num=1;
		for(;;)
		{
			if(++num==50)
			{
				//t.setFlag();
				d1.interrupt();
				d2.interrupt();
				break;
			}
			System.out.println("main..."+num);
		}
		System.out.println("over");
	}
}
class Task implements Runnable
{
	boolean flag=true;
	public synchronized void run()
	{
		while(flag)
		{
			try
			{
				wait();
			}
			catch(InterruptedException i)
			{
				System.out.println(Thread.currentThread().getName()+"................+++++++++++++");
				flag=false;
			}
			System.out.println(Thread.currentThread().getName()+".....");	
		}
	}
	public void setFlag()
	{
		flag=false;
	}
}



















