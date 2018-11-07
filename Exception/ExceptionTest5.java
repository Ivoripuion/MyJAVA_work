/*
	异常处理的捕捉方式：
	这是可以对异常进行针对性处理的方式。
	
	具体格式是：
	
	try
	{
		//需要被检测的代码。
	}
	catch(异常类 变量)//该变量用于接受发生的异常对象
	{
		//处理异常的代码。
	}
	finally
	{
		//一定会被执行的代码。
	}
	
	遇到问题才会try,当没问题不会try。
*/

class ExceptionTest5
{
	public static void main(String[] args)
	{
		Test t=new Test();
		int[] arr=new int[10];
		try{
			int num=t.method(null,-3);
			System.out.println("num..."+num);
		}
		catch(NullPointerException e){
			System.out.println(e.toString());
		}
		catch(FuShuException k){//处理针对性
			System.out.println("负数角标异常！！");	
			k.printStackTrace();//JVM的默认处理机制就是调用异常对象该方法。
			System.out.println("message:"+k.getMessage());
		}
		/*多catch父类catch放在最下面
		catch(Exception t){
			
		}
		*/
		finally{
			System.out.println("over");
		}
	
	}
}
class Test
{
	public int method(int[] arr,int index) throws FuShuException,NullPointerException
	{
		if(arr==null)
			throw new NullPointerException("空指针！！");
		if(index<0)
			throw new FuShuException("角标为负数！:"+index);
		return arr[index];
	}
}
class FuShuException extends Exception
{
	FuShuException()
	{}
	FuShuException(String k)
	{
		super(k);
	}
}



/*
	异常处理的原则：
	1，函数内部如果抛出需要检测的异常，那么函数上必须声明。
	否则必须在函数内用trycatch捕捉，否则编译失败。
	
	2，如果调用了声明异常的函数，要么trycatch要么throws，否则编译失败。
	
	3，什么时候catch，什么时候throws？
		功能内容可以解决，用catch。
		解决不了，用throws告诉调用者，由调用者解决。
		
	4，一个功能内部如果抛出了多个异常，那么调用时，必须有对应多个catch进行针对性处理。
	内部有几个需要检测的异常，就抛出几个，抛出几个，就catch几个。


*/





















