package net.istudy.generatic.define.demo;

import net.istudy_2.bean.Worker;

public class generaticDefineDemo_1 {

	public static void main(String[] args) {
		Tool<Worker> tool=new Tool<Worker>();
		tool.setQ(new Worker());
		Worker worker=tool.getQ();
		System.out.println(worker.getName());
	}

}
