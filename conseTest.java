class Conse
{
	public static void main(String[] args)
	{
		Person p=new Person("John");
		p.speak();
	}						 
}
class Person
{
	private String name;
	private int age;
	void speak()
	{
		System.out.println(name+":"+age);
	}
	Person()
	{
		name="baby";
		age=1;
		System.out.println("person is live");
	}
	Person(String n)
	{
		System.out.println("person is live");
		name=n;
	}
}
//构造函数：构建创造对象时调用的函数。作用：给对象进行初始化。
//创建对象都必须要通过构造函数初始化。一个类中若没有定义构造函数，那么该类会有一个默认的空参数构造函数；若定义了，就没有了。
//构建函数：对象创建时必被调用；只能调用一次。
//一般函数：对象创建后，需要调用才调用；可调用多次。
//什么时候定义构造函数，在描述事物时，该事物已存在就具备的内容，这些内容都定义在构造函数中。
