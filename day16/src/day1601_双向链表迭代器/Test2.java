package day1601_双向链表迭代器;

import java.util.Iterator;

public class Test2 {
	public static void main(String[] args) {
		Test1<String> list = new Test1<>();
		list.add("aaa");
		list.add("ggg");
		list.add("uuu");
		list.add("nnn");
		list.add("qqq");
		list.add("kkk");
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.size()-1);
		System.out.println(list.get(2));
		System.out.println("-----------------");
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i));
			System.out.println("-----------------------------");
			Iterator<String> it = list.iterator();
			System.out.println(it);
			String v = it.next();
			System.out.println(v);
			System.out.println("-----------------------");
			/*foreach语法，对集合有要求
			 * 要求集合必须实现Iterable接口
			 * 必须是Iterable接口的子类，才能使用foreach
			 * 
			 * */
			for (String s : list) {
				System.out.println(s);
			}
		}
	}
}
