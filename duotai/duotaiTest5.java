/*
	多态时，
	成员的特点：
	1，成员变量。
		编译时：参考引用型变量所属的类中是否有调用的成员变量，有，编译通过，没有则编译失败。
		运行时：参考引用型变量所属的类中是否有调用的成员变量，并运行该所属类中的成员变量。
		简单说：编译和运行都参考等号左边。
				
	2，成员函数（非静态）。
		编译时：参考引用型变量所属的类中是否有调用的函数。有，编译通过，没有，编译失败。
		运行时：参考的是对象所属的类中是否有调用函数。
		简单说：编译看左边，运行看右边。
		
	3，静态函数。
		不涉及多态性（对象的多态性）
*/

class Fu
{
	int num=3;
	void show()
	{
		System.out.println("Fu show");
	}
	static void method()
	{
		System.out.println("Fu...method");
	}
}
class Zi extends Fu
{
	int num=4;
	void show()	
	{
		System.out.println("Zi show");
	}
	static void method()
	{
		System.out.println("Zi...method");
	}
}
class duotaiTest5
{
	public static void main(String[] args)
	{
		Fu f=new Zi();
		f.show();
		f.method();
		System.out.println(f.num);
		Zi z=(Zi)f;
		z.method();
		System.out.println(z.num);
	}
}














 