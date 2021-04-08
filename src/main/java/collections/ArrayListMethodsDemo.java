package collections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListMethodsDemo {

	public static void main(String[] args) throws Exception {
		ArrayList l = new ArrayList();
		l.add(19);
		l.add(20);
		l.add(19);
		l.add(null);
		l.add(12);
		l.add(null);
		ArrayList ll = new ArrayList();
		for(int i = 0; i<l.size(); i++) {
			Object o = l.get(i);
			if(!ll.contains(o)) {
				ll.add(o);
			}
		}
		System.out.println(ll);
		
		HashSet set = new HashSet(l);
		l = new ArrayList(set);
		System.out.println(l);
	}
	public static int findCapacity(ArrayList<Integer> al) throws Exception {
        	Field field = ArrayList.class.getDeclaredField("elementData");
        	field.setAccessible(true);
        return ((Object[]) field.get(al)).length;
 
    }

}
