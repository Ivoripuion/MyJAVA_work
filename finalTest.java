//继承的弊端：打破了封装性。
/*
	final:是一个修饰符
	fianl可以修饰类，方法，变量。
	final修饰的类不可被继承。
	final修饰的方法不可以被覆盖。
	final修饰的变量是常量，只能被赋值一次(累死const)。
		为什么要用final修饰变量，其实在程序中如果一个数据是固定的，
		那么直接使用这个数据就可以了，但是阅读性差，所以他给该数据
		起了个名称，因为值不能变化，所以用final进行修饰。
*/
class finalTest
{
	public static void main(String[] args)
	{
		
	}
}
class Fu
{
	void method()
	{
		//调用底层内存资源。
	}
}
class Zi extends Fu
{
	void method()
	{
		System.out.println("haha");
	}
}