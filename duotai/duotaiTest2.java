abstract class Animal
{
	abstract void Eat();
}
class Dog extends Animal
{
	void Eat()
	{
		System.out.println("dog...meat");
	}
	void lookhome()
	{
		System.out.println("看家");
	}
}
class Cat extends Animal
{
	void Eat()
	{
		System.out.println("cat...fish");
	}
	void playMouse()
	{
		System.out.println("玩老鼠");
	}
}
class rabbit extends Animal
{
	void Eat()
	{
		System.out.println("rabbit...carrots");
	}
	void jump()
	{
		System.out.println("跳一跳");
	}
}
class duotaiTest2
{
	public static void main(String[] args)
	{
		Animal c=new Cat();//自动类型提升（向上转型）,但是特有功能无法访问。作用：限制特有功能的使用。
		c.Eat();
		//如果还想用特有功能，可以向下转型。
		Cat d=(Cat)c;
		d.playMouse();

	}
	public static void method(Animal a)
	{
		a.Eat();
	}
}
/*
	多态的好处：
		提高了代码的扩展性。
		前期代码可以使用后期内容。

	多态的前提：
		1，必须有关系：继承，实现
		2，必须有覆盖

*/










