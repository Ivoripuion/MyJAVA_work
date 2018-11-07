package cn.itcast.regex.demo;


/*
 * 
 * 需求：定义一个功能对QQ号进行检验
 * 要求：长度5~15，只能是数字，0不能开头
 * 
 * */
public class RegexDemo {
	public static void main(String[] args)
	{
		String QQ="123456";
		String regex="[1-9][0-9]{4,14}";
		boolean bool=QQ.matches(regex);
		if(bool)
			System.out.println(QQ+": 符合标准");
		else
			System.out.println(QQ+": 不符合标准");
		String str="aiiiiiiiifg";
		String reg="ai{6,}fg";
		System.out.println(str.matches(reg));
	}
}
