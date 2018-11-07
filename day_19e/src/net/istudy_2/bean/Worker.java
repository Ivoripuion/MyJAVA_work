package net.istudy_2.bean;

public class Worker extends Person {

	public Worker() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Worker(String name, int age) {
		super(name, age);
		// TODO 自动生成的构造函数存根
	}

	/* （非 Javadoc）
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "worker::"+name+":"+age;
	}
	
}
