//this关键字test，增强代码阅读性。
//当成员变量和局部变量重名，可以用this关键字来区分。
//this代表对象。哪个对象，当前对象。this就是所在函数所属对象的引用。简单说，哪个对象调用了this所在的函数,this就代表哪个函数。
class difBaby_dif
{
	public static void main(String[] args)
	{
		Person p1=new Person("haha");
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
	Person(String name)//孩子出生既有名字。
	{
		this.name=name;//this关键字：这个类中的name。
		age=1;
	}
	void speak()
	{
		System.out.println(name+"..."+age);
	}
}