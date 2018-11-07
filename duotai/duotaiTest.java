//对象的多态性。
/*
	一个对象对应着不同的形态。
	
	多态在代码中的体现：
		父类或接口的引用指向其子类的对象。

*/
class Fu
{
	Fu()
	{
		
	}
}
class Zi extends Fu
{
	Zi()
	{
		super();
	}
}
class duotaiTest
{
	Fu hah=new Zi();//一个对象，两种形态。
}