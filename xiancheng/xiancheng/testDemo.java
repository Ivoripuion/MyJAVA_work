class duanfei
{
	public static void main(String[] args)
	{
		jisuan1 ha=new jisuan1();
		jisuan2 ho=new jisuan2();
		Thread ha1=new Thread(ha);
		Thread ho1=new Thread(ho);
		ha1.start();
		ho1.start();
	}
}
class jisuan1 implements Runnable
{
	public void run()
	{
		System.out.println(1+1+Thread.currentThread().getName());
	}
}
class jisuan2 implements Runnable
{
	public void run()
	{
		System.out.println(1+2+Thread.currentThread().getName());
	}
}