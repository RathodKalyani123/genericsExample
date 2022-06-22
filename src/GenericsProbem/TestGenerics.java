package GenericsProbem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestGenerics {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "anita");
		map.put(2, "nita");
		
		Set<Map.Entry<Integer, String>> set=map.entrySet();
		Iterator<Map.Entry<Integer,String>> itr=set.iterator(); 
		
		while(itr.hasNext()) {
			Map.Entry e=itr.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
