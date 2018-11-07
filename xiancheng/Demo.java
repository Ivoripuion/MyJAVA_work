/*
	进程：正在进行中的程序（直译）。
	
	线程：就是进程中一个负责程序执行的控制单元。
	
	一个进程当中至少要有一个线程。
	
	
	开启多个线程是为了同时运行多个代码。这个内容可以称为线程要执行的任务。
*/
class Demo
{
	public void finalize()
	{
		System.out.println("demo ok");
	}
}
class ThreadDemo
{
	public static void main(String[] args)
	{
		new Demo();
		new Demo();
		new Demo();
		System.gc();
		new Demo();
		System.out.println("duoxiancheng");
	}
}