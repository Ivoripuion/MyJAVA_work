/*

静态代码块
随着类的加载而执行。

作用：用于给类初始化。

*/
class StaticCodeTest
{
	static
	{
		System.out.println("haha");
	}
	public static void main(String[] args)
	{
		//new StaticCode().show();
		StaticCode.show();
	}
}
class StaticCode
{
	static
	{
		System.out.println("haha");
	}
	static void show()
	{
		System.out.println("show run");
		System.out.println("show run");
	}
}
