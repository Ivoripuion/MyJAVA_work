class MainTest
{
	public static void main(String[] args)
	{
		System.out.println(args.length);
		for(int x=0;x<args.length;x++)
			System.out.println(args[x]);//[Ljava.lang.String;@15db9742
	}
}
/*
格式固定，为jvm识别和调用。

public:权限必须是最大的。
static:不需要对象。
void:主函数没有具体返回值。
main:不是关键字，只是jvm识别固定的名字。
String[] args:主函数的参数类列表，是一个数组类型的参数，而且元素都是字符串类型。
*/


