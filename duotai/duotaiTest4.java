class duotaiTest4
{
	public static void main(String[] args)
	{
		Animal d=new Dog();
		method(d);
		Animal c=new Cat();
		method(c);
	}
	public static void method(Animal a)
	{
		a.eat();
		if(a instanceof Dog)//instanceof用于判断对象的具体类型，向下转型
		{
			Dog c=(Dog)a;
			c.lookdoor();
		}
		if(a instanceof Cat)
		{
			Cat c=(Cat)a;
			c.catchMouse();
		}
	}
}
abstract class Animal
{
	abstract void eat();
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("dog...meat");
	}
	void lookdoor()
	{
		System.out.println("look door");
	}
}
class Cat extends Animal
{
	void eat()
	{
		System.out.println("cat...fish");
	}
	void catchMouse()
	{
		System.out.println("catch Mouse");
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

