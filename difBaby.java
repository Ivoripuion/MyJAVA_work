class difBaby
{
	public static void main(String[] args)
	{
		Person p1=new Person("错森");
		Person p2=new Person();
		p1.speak();
		p2.speak();
	}
}
class Person
{
	int age;
	String name;
	Person()//孩子出生没有名字。
	{
		name="baby";
		age=1;
	}
	Person(String name1)//孩子出生既有名字。
	{
		name=name1;
		age=1;
	}
	void speak()
	{
		System.out.println(name+"..."+age);
	}
}