class this2Test
{
	public static void main(String[] args)
	{
		Person p1=new Person("haha");
		p1.speak();
		Person p2=new Person("lala",10);
		Person p3=new Person("hehe",13);
		System.out.println(p2.compare(p3));
	}
}
class Person
{
	int age;
	String name;
	Person(String name)
	{
		this("haha",20);
		this.name="haha";
	}
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void speak()
	{
		System.out.println(name+"..."+age);
	}
	public boolean compare(Person p)
	{
		return this.age==p.age;
	}
}