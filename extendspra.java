/*
	子类的初始化过程： 子类中所有构造函数默认都会访问父类。
*/
class Fu
{
	Fu()
	{
		System.out.println("fu run");
	}
	
}
class Zi extends Fu
{
	Zi()
	{
		//super();
		System.out.println("Zi run");
	}
}
class Extendspra
{
	public static void main(String[] args)
	{
		new Zi();
	}
}