/*
	抽象类练习。
	雇员示例
		需求：公司中程序员有姓名，工号，薪水，工作内容。
		项目经理除了有姓名，工号，薪水还有奖金，工作内容。
		对给出的数据进行数据建模。
*/

//描述雇员
abstract class Employee
{
	private String name;
	private String ID;
	private double pay;
	Employee(String name,String ID,double pay)
	{
		this.name=name;
		this.ID=ID;
		this.pay=pay;
	}
	public abstract void work();
}
//描述程序员
class Programmer extends Employee
{
	Programmer(String name,String ID,double pay)
	{
		super(name,ID,pay);
	}
	public void work()
	{
		System.out.println("code...");
	}
}
//描述经理
class Manager extends Employee
{
	private int bonus;
	Manager(String name,String ID,double pay)
	{
		super(name,ID,pay);
	}
	public void work()
	{
		System.out.println("manager");
	}
}
class abstract_test
{
	public static void main(String[] args)
	{
		
	}
}


















