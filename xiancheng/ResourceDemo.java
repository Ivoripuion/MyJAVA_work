/*
线程间通讯：
多个线程在处理同一资源，但是任务不同。



等待唤醒机制：
方法：
	wait():让线程处于冻结状态，被wait的线程会存储在线程池中。
	notify():唤醒线程池中的一个线程。
	notifyAll():唤醒线程池中的所有线程。

这些方法都必须定义在同步中，因为这些方法是用于操作线程状态的方法。
必须要明确操作的是哪个锁上的线程。

*/
class Resource
{
	String name;
	String sex;
	boolean flag=false;
}
class Input implements Runnable
{
	Resource r;
	Input(Resource r)
	{
		this.r=r;
	}
	public void run()
	{
		int x=0;
		while(true)
		{
			synchronized(r)
			{
				if(r.flag)
					try{r.wait();}catch(InterruptedException t){}
				else
				{
					if(x==0)
					{
						r.name="Mark";
						r.sex="Male";
					}
					else
					{
						r.name="丽丽";
						r.sex="女女女女女";
					}
					r.flag=true;
					r.notify();
				}
				x=(x+1)%2;
			}
		}
	}
}
class Output implements Runnable
{
	Resource r;
	Output(Resource r)
	{
		this.r=r;
	}
	public void run()
	{
		while(true)
		{
			synchronized(r)
			{
				if(!r.flag)
					try{r.wait();}catch(InterruptedException u){}
				else
				{	
					System.out.println(r.name+"..."+r.sex+"--"+Thread.currentThread().getName());	
				}
				r.flag=false;
				r.notify();
			}
		}
	}
}
class ResourceDemo
{
	public static void main(String[] args)
	{
		Resource r=new Resource();
		Input p=new Input(r);
		Output o=new Output(r);
		Thread d1=new Thread(p);
		Thread d2=new Thread(o);
		d1.start();
		d2.start();
	}
}










































