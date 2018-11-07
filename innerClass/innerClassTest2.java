class innerClassTest2
{
	public static void main(String[] args)
	{
		Object f=new Test();
		
	}
}
class Outer
{
	int num=4;
	class Inner
	{
		int num=3;
		void show()
		{
			
			System.out.println(num);
		}
	}
	void method()
	{
		new Inner().show();
	}
}
class Test
{
	int num=3;
	void haha()
	{
		System.out.println("num..."+Test.this.num);
	}
}