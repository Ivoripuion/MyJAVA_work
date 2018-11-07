/*
	应用。	
*/
//异常类：lanPing
class lanPing extends Exception
{
	lanPing(){}
	lanPing(String msg)
	{
		super(msg);
	}
}
//异常类：MaoYan
class MaoYan extends Exception
{
	MaoYan(){}
	MaoYan(String l)
	{
		super(l);
	}
}
class NoPlanException extends Exception
{
	NoPlanException(){}
	NoPlanException(String msg)
	{
		super(msg);
	}
}
//主函数运行
class ExceptionApp
{
	public static void main(String[] args)
	{
		Teacher t=new Teacher("Yuma");
		try
		{
			t.prelect();
		}
		catch(NoPlanException n)//只有该异常对象老师无法解决被抛出，采用其它的方法解决。
		{
			System.out.println("课时调整");
		}
	}
}
//老师类
class Teacher
{
	private String name;
	private Computer comp;
	Teacher(String name)
	{
		this.name=name;
		comp=new Computer();
	}
	//若电脑无法使用，老师要求同学练习。
	public void test()
	{
		System.out.println("大家练习");
	}
	//冒烟异常老师无法解决，需要抛出。
	public void prelect()throws NoPlanException
	{
		try
		{
			comp.run();
			System.out.println(name+"上课");
		}
		catch(MaoYan m)
		{
			System.out.println(m);
			test();
			throw new NoPlanException("课时无法进行");
		}
		catch(lanPing l)
		{
			System.out.println(l);
			comp.reset();
			prelect();//修复完成继续讲课。
		}
		
	}
}
class Computer
{
	private int state=2;
	public void run()throws lanPing,MaoYan//若电脑遇到了自己无法解决的问题，将问题抛出
	{
		if(state==1)
			throw new lanPing("电脑蓝屏了！！！");
		if(state==2)
			throw new MaoYan("电脑冒烟了！！！");
		System.out.println("Computer...Run");
	}
	//电脑重启方法。
	public void reset()
	{
		state=0;
		System.out.println("重启");
	}
}
























