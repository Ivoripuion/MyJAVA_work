/*

构造代码块

*/
class PersonCode
{
	public static void main(String[] args)
	{
		//Person p1=new Person(12,"haha");
		//p1.show();
		Person.shao();
	}
}
class Person
{
	{
		//构造代码块：给所有对象初始化。
		System.out.println("person show");
	}
	int age;
	String name;
	Person(int age,String name)//构造函数：给对应对象进行针对性初始化。
	{
		this.age=age;
		this.name=name;
	}
	void show()
	{
		System.out.println(name+"..."+age);
	}
	static void shao()
	{
		System.out.println("Test");
	}
}

