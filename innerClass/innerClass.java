/*
	1，内部类特点：内部类可以直接访问外部类中的成员。
	2，外部类要访问内部类，必须建立内部类对象。

*/
class innerClassTest
{
	public static void main(String[] args)
	{
		Outer.Inner in=new Outer.Inner();
		in.show();
		Outer.Inner2 in2=new Outer.Inner2();
	}
	
}
class Outer
{
	private static int num=4;
	static class Inner//内部类
	{
		void show()
		{
			System.out.println("num..."+num);
		}
		static void func()//若内部类中定义了静态成员，该内部类也必须是静态的。
		{
			
		}
	}
	static class Inner2//若内部类是静态的。相当于一个外部类。
	{
		
	}
	public void method()
	{
		Inner in=new Inner();
		in.show();
	}
}