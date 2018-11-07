class StaticTest
{
	public static void main(String[] args)
	{
		System.out.println(Person.country);
	}
}
class Person
{
	static String country="CN";
	static int age;
	Person(){}
	public static void main()
	{
		System.out.println(country+"+"+age  );
	}
}
/*
static 是一个修饰符，用于修饰成员。
static修饰的成员被所有对象共享。
static优先对象存在。
static修饰的成员多了一种调用方式，可以被类名直接调用。类名.变量名。
static修饰的数据是共享数据，对象中存储的是特有数据。
*/
/*注意事项
静态方法只能访问静态成员。(非静态既可以访问静态又可以访问非静态)
静态方法中不可以定义this,super关键字。
主函数是静态的。
*/
