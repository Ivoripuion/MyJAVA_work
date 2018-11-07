package day_16;


public class WrapperDemo_2 {

	public static void main(String[] args) {
		
		int num = 4;
		
		Integer num_1=4;//jdk 1.5新特性;自动装箱，简化书写
	
		Integer a=new Integer(222);
		Integer b=new Integer(222);
		System.out.println(a==b);
		System.out.println(a.equals(b));

		Integer a_1=127;
		Integer b_1=127;
		System.out.println(a_1==b_1);
		System.out.println(a_1.equals(b_1));
	}

}
