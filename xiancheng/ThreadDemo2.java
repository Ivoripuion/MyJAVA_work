class ThreadDemo2
{
	public static void main(String[] args)
	{
		Demo d=new Demo();
		Thread d1=new Thread(d);
		Thread d2=new Thread(d);
		d1.start();
		d2.start();			
	}
}
class Demo extends Fu implements Runnable//准备扩展Demo类的功能，让其中内容可以作为多线程执行（接口）。
{
	public void run()
	{
		show();
	}
	public void show()
	{
		for(int x=1;x<10;x++)
			System.out.println("x = "+x+"...."+Thread.currentThread().getName());
	}
}
class Fu
{
	
	Fu()
	{}
}
/*
	创建线程的第二种方式：实现Runnable接口。


*/