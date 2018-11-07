/*
	异常：在运行时期发生的不正常的情况。
	
	在JAVA中用类的形式对不正常的情况进行了描述和封装对象。
	描述不正常的类，就称为异常类。 
	
	其实异常就是JAVA通过面向对象的思想将问题封装成了对象。
	
	用异常类进行描述。
	不同的问题用不同的类进行具体的描述。比如角标越界。空指针等。 
	
	问题很多，意味着描述的类也很多。
	将其共性进行向上抽取，形成了异常体系。
	
	最终问题就分成了两大类：
	Throwable:
		|--1，一般不可处理的。Error
		|--2，可处理的。Exception
	
*/

class ExceptionTest1
{
	public static void main(String[] args)
	{
		sleep(-6);
		
	}
	public static void sleep(int time)
	{
		System.out.println("sleep for"+sleep+"minutes");
	}
}
class fuTime
{
	
}
class bigTime
{
	
}
