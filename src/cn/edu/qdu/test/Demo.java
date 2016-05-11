package cn.edu.qdu.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
//		Map map=new HashMap();
//		map.put(1,new Students(1, 89));
//		map.put(2,new Students(2, 89));
//		map.put(3,new Students(3, 89));
//		map.put(4,new Students(4, 89));
//		System.out.println(map.get(3));
		//泛型
		List<Students> list=new ArrayList<Students>();
		list.add(new Students(3,89));
		list.add(new Students(1,46));
		list.add(new Students(2,87));
		
//		Collections.sort(list);
		//增强for循环
//		for (Object object : list) {
//			System.out.println(object);
//		}
		//普通 for循环
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		Collections.sort(list,new Comp());
//		System.out.println(list);
//		
//		Set set = new TreeSet();
//		set.add(new Students(1,89));
//		set.add(new Students(2,46));
//		set.add(new Students(3,87));
//		set.add(new Students(4,78));
//		set.add(new Students(5,65));
//		set.add(new Students(6,35));
//		Set set = new TreeSet();
//		set.add("aaaa");
//		set.add("bbbb");
//		set.add("cccc");
//		System.out.println(set);
		//遍历器
//	    Iterator it=set.iterator();
//	    while (it.hasNext()) {
//           System.out.println(it.next());			
//		}
		//增强for循环
//		for (Object object : set) {
//			System.out.println(object);
//		}
//		Set hs = new HashSet();
//	    List a = new ArrayList();
//		List l = new LinkedList();
//		t.add("王云");
//		t.add("刘静涛");
//		t.add("南天华");
//		hs.add("王云");
//		hs.add("刘静涛");
//		hs.add("南天华");
//		a.add("南天华");
//		a.add("刘静涛");
//		l.add("南天华");
//		l.add("刘静涛");
//		 System.out.println("TreeSet");
//		 System.out.println(t);
//		 
//		 System.out.println("HashSet");
//		 System.out.println(hs);
//		 System.out.println("ArrayList");
//		 System.out.println(a);
//		 System.out.println("LinkedList");
//		 System.out.println(l);
//		 
////		Iterator it = t.iterator();
////		while (it.hasNext()) {
////			System.out.println(it.next());
////		}
	}
}
