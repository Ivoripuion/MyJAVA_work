/*
	如何创建一个线程呢？
	创建线程方式一：继承Thread类。
	
	步骤：
	1，定义一个类继承Thread类
	2，覆盖Thread类中的run方法
	3，直接创建Thread类的子类对象
	4，调用start方法调用并开启线程
	
*/

class ThreadDemo 
{
	public static void main(String[] args)
	{
		
		/*
			创建线程的目的是为了开启一条执行代码的路径，去运行指定代码和其他代码实现同时运行。
		*/	
		Demo2 d1=new Demo2("错森");
		Demo2 d2=new Demo2("Jack_Black");
		d1.start();//开启线程
		for(int x=0;x<10;x++)
			System.out.println("haha...."+Thread.currentThread().getName());
		d2.start();
	}
}
class Demo2 extends Thread
{
	private String name;
	Demo2(String name)
	{
		this.name=name;
	}
	public void run()
	{
		show();
	}
	public void show()
	{
		for(int x=0;x<10;x++)
		{
			System.out.println(this.name+"...x="+x+"..."+Thread.currentThread().getName());
		}
	}
}























 