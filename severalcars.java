class Car
{
	//该类不需要独立运行，所以不需要主函数。
	int num;
	String colour;//成员变量定义在类中，在整个类中均有效。
}
class severalcars
{
	public static void main(String[] args)
	{
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		show(c1);
		show(c2);
		show(c3);
	}	
	public static void show(Car c)
	{
		c.num=4;
		c.colour="red";
		System.out.print("num="+c.num+";colour="+c.colour+";\n");
	}
}

