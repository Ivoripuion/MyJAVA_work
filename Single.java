/*
	设计模式：对问题行之有效的方法。其实它是一种方法。
	
	1,单例设计模式。
		解决的问题：可以保证一个类内存中的对象唯一性。
	必须对多个程序使用同一个配置信息对象时，就需要保证对象的唯一性。
	
	如何保证对象的唯一性呢？
	1，不允许其他程序用new创建该对象。
	2，在该类创建一个本类实体。
	3，对外提供一个方法让其他程序可以获取该对象。
		
*/
//饿汉式
class Single//类似于封装,类一加载对象即建立。
{
	private static Single s=new Single();
	private  Single(){}
	int haha;
	public static Single getInstance()
	{
		return s;
	}
}
//懒汉式
class Single2//类加载进来，对象不会建立，只有get方法使用了才建立（延迟加载）。
{
	private static Single2 s=null;
	private Single2(){}
	public static Single2 getInstance()
	{
		if(s==null)
			s=new Single2();
		return s;
	}
}
class singleDemo
{
	public static void main(String[] args)
	{
		Single s1=Single.getInstance();
		Single s2=Single.getInstance();
		System.out.println(s1==s2);
	}
}
