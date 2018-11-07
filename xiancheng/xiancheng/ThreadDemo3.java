/*
	需求：卖票

*/

class ThreadDemo3 
{
	public static void main(String[] args)
	{
		Ticket t1=new Ticket();
		Thread d1=new Thread(t1);
		Thread d2=new Thread(t1);
		Thread d3=new Thread(t1);
		d1.start();
		d2.start();
		d3.start();
	}
}
class Ticket implements Runnable
{
	private int num=1000;
	Object obj=new Object();
	public void run()
	{
		sale();
	}
	public void sale()
	{
		while(true)
		{
			synchronized(obj)//同步锁
			{
				if(num>0)
				{
					try
					{
						Thread.sleep(10);
					}
					catch(InterruptedException k){}
					System.out.println("TicketID: "+num--+"--"+Thread.currentThread().getName());
				}
			}
		}
	}
}

/*
	多线程安全问题产生原因：
		1，多个线程在操作共享数据。
		2，操作共享数据的线程代码有多条。
		
	解决思路：
	将多条操作共享数据的代码封装起来。当有线程在执行这些代码时，
	其他线程不可以参与运算。
	必须把这些代码都执行完毕后，其他线程才可以参与运算。
	
	在java中，用同步代码块就可以解决这个问题。
	
	同步代码块格式：
	synchronized(对象)
	{
		需要被同步的代码;
	}
	同步的好处：
	解决了线程的安全问题。
	
	同步的弊端：
	相对相率降低，因为同步外的线程都会判断同步锁（无效判断）。
	
	同步的前提：
	必须有多个线程，并使用同一个锁。
	
*/








