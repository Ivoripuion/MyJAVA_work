/*
	当一个抽象类中的方法都是抽象的时候，就可以用另一种方式来表达，
	就是 接口 interface。
*/
/*
	定义借口使用的关键字不是class是interface。
*/

interface Test
{
	public static final int NUM=4;
	public abstract void show();
}

/*
	对于接口中常见的成员：而且这些成员都有固定的修饰符。
	1,全局常量：public static final
	
	2，抽象方法。public abstract 
	
	接口中的成员都是公共的权限。
*/
//类与类之间是继承关系，类与借口之间是实现关系。
/*
	接口不可以实例化。
	只能由实现了接口的子类并覆盖了借口中所有的抽象方法后，该子类才可以实例化。
	否则，该子类就是一个抽象类。
*/
class TestImp implements/*实现*/ Test
{
	public void show()
	{}
	
}

/*
	在java中不能实现多继承，会出现调用的不确定性。
	所以java将继承机制改良，在java中变成多实现。
	
	一个类可以实现多个借口。
*/
interface A
{
	public abstract void show();
	
}

interface B
{
	public abstract void show();
}

class TestAgain implements A,B//多实现
{
	public void show(){} 	
}


/*
	一个类在继承另一个类的同时，还可以实现多接口。
	
	
*/

class Q
{
	public int method()
	{
		return 0;
	}
	
}

abstract class Test2 extends Q implements A,B
{
}
/*
	接口的出现避免了单继承的局限性。

*/

interface CC
{
	void show();
}
interface MM
{
	void method();
	
}
interface QQ extends CC//接口与接口之间是继承关系，而且可以多继承。
{
	
	
}
class interfaceTest 
{
	public static void main(String[] args)
	{
		TestImp haha=new TestImp();
	}
}


























