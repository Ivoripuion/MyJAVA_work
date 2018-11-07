class innerClassTest6
{
	public static void main(String[] args)
	{
		new Outer().method();
	}
}
class Outer
{
	void method()
	{
		new Object()//这里其实是一个子类
		{
			public void show1()
			{
				System.out.println("show run");
			}
		};
		obj.show1();
	}
}
