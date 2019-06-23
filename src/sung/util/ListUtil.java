package sung.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListUtil {
	
	// 정렬
	private void order() {
		List<Integer> integerList = new ArrayList<>();
		List<String> stringList = new ArrayList<>();
		
		// 오름차순 정렬 
		Collections.sort(integerList);
		Collections.sort(stringList);  
		
		// 내림차순 정렬 
		Collections.sort(integerList, new AscendingInteger());
		Collections.sort(stringList, new AscendingString());
	}
	



}

class AscendingInteger implements Comparator<Integer> 
{ 
	@Override 
	public int compare(Integer a, Integer b) {
		return b.compareTo(a);
	}
}

class AscendingString implements Comparator<String> {
	@Override 
	public int compare(String a, String b) { 
		return b.compareTo(a); 
	} 
}