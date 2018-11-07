/*
	多线程下的单例设计模式：

*/
//饿汉式 妈的都没有线程问题，还简单
class Single
{
	private static final Single s=new Single();
	private Single(){}
	public static Single getInstance()
	{
		return s;
	}
}

//懒汉式
class Single2 implements Runnable
{
	private static Single2 s=null;
	private Single2(){};
	public static synchronized Single2 getInstance()
	{
		if(s==null)
		{
			synchronized(Single2.class)
			{
				if(s==null)
				{	
					s=new Single2();
						try{Thread.sleep(10);}catch(InterruptedException e){}
				}
				
			}
		}
		return s;
	}
	public void run()
	{
		this.getInstance();
	}
}
class SingleDemo
{
	public static void main(String[] args)
	{
		Single2 d=Single2.getInstance();
		Thread d1=new Thread(d);
		Thread d2=new Thread(d);
		
	}
}












