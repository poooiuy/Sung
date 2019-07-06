/*
 * 데이터를 순차 처리하는 구조
 * List에  데이터를 추가한 순서대로 인덱스 번호가 매겨짐
 * 데이터 중복 허용
 * 정렬 가능
 */

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
	
	
	//	List to Array
	List<String> stringList = new ArrayList<>();
	String[] strings = stringList.stream().toArray(String[]::new);
	

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