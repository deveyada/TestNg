import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class arraylistdemo {

	public static void main(String[] args) {
		//arraylist
		ArrayList<String> a = new ArrayList<String>();
		a.add("Devesh");
		a.add("Divisha");
		a.add("Shweta");
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.indexOf("Divisha"));
		System.out.println(a.isEmpty());
		a.set(2, "House");
		System.out.println(a);
		System.out.println(a.size());
		
		//hashset
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(3);
		hs.add(56);
		hs.add(90);
		hs.add(1);
		hs.add(12);
		hs.add(109);
		System.out.println(hs);
		System.out.println("Size is " + hs.size());
		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
