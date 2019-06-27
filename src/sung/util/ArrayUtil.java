package sung.util;

import java.util.Arrays;
import java.util.List;

public class ArrayUtil {
	
	//	Array to List
	String[] strArr = new String[] {"1","2","3"};
	List<String> strList = Arrays.asList(strArr);
	
	
	//	Copy
	public void copyArray() {
		String[] strArray = {"orange", "red", "green'"};
		String[] copiedArray = Arrays.stream(strArray).toArray(String[]::new);
	}
	
	
	// Sort
	static int[] intArr = new int[]{ 2, 6, 3, 1, 5, 4 };
	public void sort() {
		Arrays.sort(intArr);
	}
	
	
	//	Array�� �ش� ���� �ִ��� Ȯ��
	public boolean isHasValue(String[] targetArr, String value) {
		return Arrays.stream(strArr).anyMatch(value::equals);
	}


	//	Reverse Array - �迭 ������
	public static int[] reverseArrayInt(int[] n) {
	    int left  = 0;             // �� ���� ����� ÷��
	    int right = n.length - 1;  // �� ���� ����� ÷��

	    while (left < right) {
	      int temp = n[left];
	      n[left]  = n[right];     // �¿� ��� ��ȯ
	      n[right] = temp;

	      left++; right--;         // �迭�� �߰� �κ����� ��ĭ�� �̵�
	    }

	    return n;
	  }

}
