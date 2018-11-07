class duotaiTest3
{
	public static void main(String[] args)
	{
		Person o=new Male();
		o.Sex();
		Male k=(Male)o;
		k.kiss();
	}
}
class Person
{
	void Sex()
	{
		System.out.println("make love");
	}
	void Kiss()
	{
		System.out.println("tongue");
	}
}
class Male extends Person
{
	void Sex()
	{
		System.out.println("penetrated");
	}
	void kiss()
	{
		System.out.println("tongued");
	}
}