/*
	为了扩展以后将出现的不知道的笔记本设备，
	定义一个规则，只要设备符合规则即可。
*/

class BookPC
{
	public static void main(String[] args)
	{
		useUSB(new sharpU());
		useUSB(new Mouse());
	}
	public static void useUSB(USB u)//接口类型的引用都是指向自己的子类。
	{
		u.open();
		u.close();
	}
}

interface USB
{
	public void open();
	public void close();
	
}
//一年后，买了一个u盘
class sharpU implements USB
{
	public void open()
	{
		System.out.println("sharpU open");
	}

	public void close()
	{
		System.out.println("sharpU close");
	}
}
class Mouse implements USB
{
	public void open()
	{
		System.out.println("Mouse open");
	}

	public void close()
	{
		System.out.println("Mouse close");
	}
}










