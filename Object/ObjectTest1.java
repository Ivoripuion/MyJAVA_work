/*
	Object类：所有类的根类。
	Object类：不断抽取得到的，具有所有对象的共性内容。
*/
class Person//extends Object
{
	String name;
	Person(String name)
	{
		super();
		this.name=name;
	}
	public boolean equals(Object p)
	{
		if(!(p instanceof Person))
		{
			throw new ClassCastException("类型错误!");
		}	
		Person P=(Person)p;
		return this.name==P.name;
	}
}
class ObjectTest1
{
	public static void main(String[] args)
	{
		Person p1=new Person("John");
		Person p2=new Person("John");
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1);
	}
}
class Demo
{}
