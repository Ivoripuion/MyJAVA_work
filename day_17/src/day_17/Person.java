package day_17;


public class Person implements Comparable {
	private int age;
	private String name;
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public Person() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
	
	public Person(String name, int age) {
		// TODO 自动生成的构造函数存根
		super();
		this.name=name;
		this.age=age;
	}

	/* （非 Javadoc）
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
	//	System.out.println(this+"......hashCode");
		return this.name.hashCode()+this.age;
	}

	public int getAge() {
		return this.age;
	}

	public boolean equals(Object obj) {
//		System.out.println(this+"...equals..."+obj);
		return this.hashCode()==obj.hashCode();
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return name+": "+age;
	}

	public int compareTo(Object o) {
		Person p=(Person)o;
		int temp=this.age-p.age;
		return temp==0?this.name.compareTo(p.name):temp;
//		if(this.age>p.age)
//			return 1;
//		else if(this.age<p.age)
//			return -1;
//		else if (this.age==p.age) {
//			if(this.name!=p.name)
//				return 1;
//		}
//		return 0;
	}	
}
