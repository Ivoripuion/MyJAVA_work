class Car
{
	//该类不需要独立运行，所以不需要主函数。
	int num;
	String colour;//成员变量定义在类中，在整个类中均有效。
	void run()
	{
		System.out.print("num="+num+";colour="+colour);
	}
}
class carDemo
{
	public static void main(String[] args)
	{
		Car c=new Car();
		c.num=5;
		c.colour="red";
		c.run();//使用对象.成员来运行成员。
	}
}

	
