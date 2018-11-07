package net.istudy.generatic.define.demo;

/*public class Tool {
	private  Object object;

	*//**
	 * @return object
	 *//*
	public Object getObject() {
		return object;
	}

	*//**
	 * @param object 要设置的 object
	 *//*
	public void setObject(Object object) {
		this.object = object;
	}
	
}*/

public class Tool<Q>{//jdk1.50后使用泛型来接受类中要使用的类
					 //这个就是所谓的自定义泛型类,当类中操作的引用数据类型是确定的时候就使用泛型来表示
	private Q q;

	/**
	 * @return q
	 */
	public Q getQ() {
		return q;
	}

	/**
	 * @param q 要设置的 q
	 */
	public void setQ(Q q) {
		this.q = q;
	}
	
	/*
	 * 将泛型用在方法上
	 * */
	public <T> void show(T str_1){
		System.out.println("show::"+str_1.toString());
	}
	public <T> void print(T str_2) {
		System.out.println("print::"+str_2.toString());
	}
	
	/*
	 * 当方法静态时，不能访问类上对应的泛型，如果方法上要使用泛型，要将泛型定义在方法上
	 * 
	 * */
	public static <K> void method(K kk) {
		System.out.println("method::"+kk.toString());
	} 
}

