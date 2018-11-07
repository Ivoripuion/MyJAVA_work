class encapsulationDemo
{
	public static void main(String[] args)
	{
		person John=new person();
		John.setAge(-10);
		John.speak();
	}
}
class person
{
	private int age;//提高安全性，重要性，将变化隔离，，便于使用。
	public void setAge(int a)
	{
		if(a>0&&a<120)
			age=a;
		else
			System.out.println("错误的数值");
	}
	public int getAge()//使用时才调用。
	{
		return age;
	}
	void speak()
	{
		System.out.println("age..."+age);
	}
}
//private用于修饰类成员，修饰的只能在本类中使用。