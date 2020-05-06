package sung.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayUtil {
	
	//	Array to List
	String[] strArr = new String[] {"1","2","3"};
	List<String> strList = Arrays.asList(strArr);
	
	int[] intArr2 = new int[] {1,2,3};
	List<Integer> list = Arrays.stream(intArr2).boxed().collect(Collectors.toList());
	
	public void convertIntArrToList() {
		List<Integer> intList = new ArrayList<Integer>(intArr2.length);	
		for (int i : intArr2) {
		    intList.add(i);
		}
	}
	
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
		return Arrays.stream(targetArr).anyMatch(value::equals);
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
