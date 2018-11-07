package mypack;
//import packa.DemoA;//导入类用的。
import packa.*;//导入packa中所有的类。
class PackageTest1
{
	public static void main(String[] args)
	{
		DemoA a=new DemoA();
		a.show();
		System.out.println("PackageTest1");
	}
}
/*
	PackageTest1.java:6: 错误: 找不到符号
                DemoA a=new DemoA();
                ^
  符号:   类 DemoA
  位置: 类 PackageTest1
PackageTest1.java:6: 错误: 找不到符号
                DemoA a=new DemoA();
                            ^
  符号:   类 DemoA
  位置: 类 PackageTest1
2 个错误

类名写错：
必须明确其包名，正确名称是包名.类名



*/