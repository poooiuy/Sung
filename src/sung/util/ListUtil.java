/*
 * �����͸� ���� ó���ϴ� ����
 * List��  �����͸� �߰��� ������� �ε��� ��ȣ�� �Ű���
 * ������ �ߺ� ���
 * ���� ����
 */

package sung.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListUtil {
	
	
	// ����
	private void order() {
		List<Integer> integerList = new ArrayList<>();
		List<String> stringList = new ArrayList<>();
		
		// �������� ���� 
		Collections.sort(integerList);
		Collections.sort(stringList);  
		
		// �������� ���� 
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