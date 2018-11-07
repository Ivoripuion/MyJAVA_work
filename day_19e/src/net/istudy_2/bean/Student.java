package net.istudy_2.bean;

public class Student extends Person {

	public Student() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Student(String name, int age) {
		super(name, age);
		// TODO 自动生成的构造函数存根
	}

	/* （非 Javadoc）
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "student::"+name+":"+age;
	}
	
}
