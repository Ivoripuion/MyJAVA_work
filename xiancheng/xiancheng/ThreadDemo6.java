/*
	生产者消费者案例
	
	多生产者，多消费者
	
	
	
	while判断标记，解决了线程获得执行权后是否要运行
	notifyAll解决了本方线程唤醒对方线程
*/
class Resource
{
	private String name;
	private int count=1;
	private boolean flag=false;
	public synchronized void set(String name)
	{
		while(flag)
			try{this.wait();}catch(InterruptedException e){}
		
		this.name=name+count;
		count++;
		System.out.println(Thread.currentThread().getName()+"...生产者..."+this.name);
		flag=true;
		notifyAll();
	}
	public synchronized void out()
	{
		while(!flag)
			try{this.wait();}catch(InterruptedException e){}
		System.out.println(Thread.currentThread().getName()+"...消费者.........."+this.name);
		flag=false;
		notifyAll();
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
class ThreadDemo6
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




















