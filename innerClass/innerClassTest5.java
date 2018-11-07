/*
	匿名内部类。就是内部类的简写格式。
	
	必须有前提：
	内部类必须继承或者实现一个外部类或者接口。
	
	匿名内部类：其实就是一个匿名子类对象。
	形式：new 父类or接口(){子类内容}
*/

class innerClassTest5
{
	public static void main(String[] args)
	{
		new Outer().method();
	}
}
class Outer
{
	int num=4;
	/*
	class Inner extends test
	{
		void show()
		{
			System.out.println("num..."+num);
		}
	}
	*/
	public void method()
	{
		new test() //匿名内部类。
		{
			void show()
			{
				System.out.println("show...........");
			}
		}.show();
	}
	
}
abstract class test
{
	abstract void show();
}


















