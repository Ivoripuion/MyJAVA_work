/*
	子父类中构造函数的特点。
	子类构造了，发现父类也构造了，为什么呢？
	原因：子类构造函数中第一行有一个默认的隐式语句。super();
	子类的实例化过程:子类中的所有构造函数默认都会访问父类中空参数的构造函数。
	子类构造函数中若第一行有了this的调用，那么super的调用就没有了，因为super和this都只能第一在第一行。
	但是可以保证子类中一定有访问父类构造函数。
*/
class Fu
{
	Fu(int x)
	{
		System.out.print("Fu run\n");
	}
}
class Zi extends Fu
{
	Zi()
	{
		//super();调用父类中空参数的构造函数,必须放在子类构造函数第一行，因为父类初始化动作必须先完成。
		super(4);
		System.out.print("A...Zi run\n");
	}
	Zi(int x)
	{
		this();
		System.out.println("B...Zi run");
	}
}
class ExtendTest4
{
	public static void main(String[] args)
	{
		new Zi(2);
	}
}
class Demo extends Object
{
	Demo()
	{
		super();
	}
}
/*
	一个对象实例化过程
	person p=new person()
	1，JVM读取指定路径下的person.class文件并加载进内存，
	并会先加载父类（如果有直接的父类的情况下）。
	2，在堆内存中分配地址值。
	3，并在对象空间中，对对象中的属性默认初始化。
	4，调用对应的构造函数，进行初始化。
	5，在构造函数中第一行先调用父类中的构造函数进行初始化。
	6，父类函数初始化完成后再对子类的属性进行显示初始化。
	7，在进行子类构造函数的特定初始化。
	8，初始化完成后，将地址值赋给引用变量。
*/













