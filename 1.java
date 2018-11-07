class Fu
{
	Fu()
	{
		show();
	}
	void show()
	{
		System.out.println("Fu show");
	}
}
class Zi extends Fu
{
	int num=9;
	void show()
	{
		System.out.println("Zi num "+num);
	}
}
class first
{
	public static void main(String[] args)
	{
		Zi z=new Zi();
		z.show();
	}
}