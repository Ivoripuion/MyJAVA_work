package net.istudy.generatic.define.demo;

public class GeneraticDemo3 {

	public static void main(String[] args) {
		InterImp imp=new InterImp();
		imp.show("ssd");
		InterImp2<Integer> imp_2=new InterImp2<Integer>();
		imp_2.show(new Integer(2));
	}

}
interface Inter<T>{//泛型接口，将泛型定义在接口上
	public void show(T t);
}

class InterImp implements Inter<String>{

	@Override
	public void show(String t) {
		System.out.println("show::"+t);
	}
	
}

class InterImp2<Q> implements Inter<Q>{

	@Override
	public void show(Q t) {
		System.out.println("show::"+t);
	}


}
