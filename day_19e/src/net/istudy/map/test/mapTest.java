package net.istudy.map.test;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * 练习：
 * "sdsdfsrgreyrjutiret"获取该字符串中每一个字母出现的次数。
 * 要求打印结果是：e(2)......;
 * 
 * 思路：
 * 观察即可发现，字母与次数之间存在映射关系。
 * 所以就可以想到，能存储映射关系的有数组和map集合
 * 关系中一方是有序编号吗？不是，
 * 那就使用map集合
 * 又可以发现可以保证唯一性的一方具备着顺序如a b c
 * 所以可以使用TreeMap集合
 * 
 * 
 * */
public class mapTest {

	public static void main(String[] args) {
		String test="sdsdfsrgreyrjutiret";
		TreeMap<Character, Integer> map=new TreeMap<Character,Integer>(new CompareByChar());
		for(int x=0;x<test.length();x++) {
			if(map.containsKey(test.charAt(x))) {
				int num=map.get(test.charAt(x));
				++num;
				map.put(test.charAt(x), num);
			}else {
				map.put(test.charAt(x), 1);
			}
		}
		Set<Map.Entry<Character,Integer>> tm=map.entrySet();
		Iterator<Map.Entry<Character,Integer>> it=tm.iterator();
		while(it.hasNext()) {
			Map.Entry<Character, Integer> m=it.next();
			Character key=m.getKey();
			Integer value=m.getValue();
			System.out.print(key+"("+value+")");
		} 
	}

}
