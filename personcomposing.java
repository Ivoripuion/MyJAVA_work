class person
{
	private int age;//私有化只在该类中可以用。
	private double length;
	public void compose(int g,double l)
	{
		age=g;//想要在新的地方使用就要用另外一个新变量进行赋值。
		length=l;
		if(g>=0&&g<=130&&l>0&&l<3)
		{
			System.out.print("Tne man's age is "+g+",and his length is "+l+" metres.\n");
		}
		else
		{
			System.out.print("错误的数据");
		}
	}
	public void compose()
	{
		System.out.print("Tne man's age is "+age+",and his length is "+length+" metres.");
	}
}
class personcomposing
{
	public static void main(String[] args)
	{
		person ming=new person();
		ming.compose(-12,1.2);
	}
}