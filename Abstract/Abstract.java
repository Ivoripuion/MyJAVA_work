/*
	抽象类：
	抽象：笼统，模糊，看不懂！不具体。
	
	特点：
		1，方法只有声明没有实现时，该方法就是抽象方法，需要被abstract修饰。
		抽象方法必须被定义在抽象类中。该类也必须被abstract修饰。
		2，抽象类不能被实例化。因为调用抽象方法没有意义。
		3，抽象类必须由其子类全部覆盖后该子类才可以实例化。
	抽象类要被使用必须是父类。

*/

class Abstract
{
	public static void main()
	{
		
	}
}
abstract class Test
{
	String data="Test";
	abstract void show();
}
class TestA extends Test
{
	void show()
	{
		System.out.println("Test...A");
	}
}
class TestB extends Test
{
	void show()
	{
		System.out.println("Test...B");
	}
}