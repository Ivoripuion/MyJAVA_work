/*
	jdk1.5新特性改良

*/
import java.util.concurrent.locks.*;
class Resource
{
	private String name;
	private int count=1;
	private boolean flag=false;
	Lock lock=new ReentrantLock();
	Condition c1=lock.newCondition();
	Condition c2=lock.newCondition();
	public void set(String name)
	{
		lock.lock();
		try
		{
			while(flag)
				try{c1.await();}catch(InterruptedException e){}
			this.name=name+count;
			count++;
			System.out.println(Thread.currentThread().getName()+"...生产者..."+this.name);
			flag=true;
			c2.signal();
		}
		finally
		{
			lock.unlock();
		}
	}
	
	public void out()
	{
		lock.lock();
		try
		{
			while(!flag)
				try{c2.await();}catch(InterruptedException e){}
			System.out.println(Thread.currentThread().getName()+"...消费者.........."+this.name);
			flag=false;
			c1.signal();
		}
		finally
		{
			lock.unlock();
		}
	}
}
class Producer implements Runnable
{
	private Resource r;
	Producer(Resource r)
	{
		this.r=r;
	}
	public void run()
	{
		while(true)
			r.set("kaoya");
	}
}
class Consumer implements Runnable
{
	Resource r;
	Consumer(Resource r)
	{
		this.r=r;
	}
	public void run()
	{
		while(true)
			r.out();
	}
}
class ThreadDemo7
{
	public static void main(String[] args)
	{
		Resource r=new Resource();
		Producer p=new Producer(r);
		Consumer c=new Consumer(r);
		Thread d1=new Thread(p);
		Thread d2=new Thread(c);
		Thread d3=new Thread(p);
		Thread d4=new Thread(c);
		d1.start();
		d2.start();
		d3.start();
		d4.start();
	}
}
