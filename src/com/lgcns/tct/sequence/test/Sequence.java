package com.lgcns.tct.sequence.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Sequence {
	
	
	/**
	 * ���Ӽ� ��� �˻� ���
	 *
     * @param		inputData		List		�Էµ�����(���ڿ� ���)
     * @return						List		���Ӽ� ���
	 */
	public List<String> getSequenceList(List<String> inputData) {
		List<String> sequenceList = null;
		////////////////////////������� ���� (1) ---------------->
		sequenceList = new ArrayList<>();
		
		for(String str : inputData) {
			int temp=0;
			boolean flag = true;
			for(int i=0; i< str.length(); i++){
				int a = Integer.parseInt(str.charAt(i)+"");
				if(i == 0) {
					temp = a;
				}else {
					if(temp + 1 != a) {
						flag = false;
						break;
					}else {
						temp = a;
					}
				}
				
			}
			if(flag) {
				sequenceList.add(str);
			}
		}

		///////////////////////////// <-------------- ������� ���� (1)
		return sequenceList;
	}
	
	/**
	 * ���� ū �� ���� ���
	 *
     * @param		sequenceList	List		���Ӽ� ���
     * @return						int			���� ū ��
	 */
	public int getMaxNum(List<String> sequenceList) {
		int maxNum = 0;
		////////////////////////������� ���� (2) ---------------->
		TreeSet<Integer> tree = new TreeSet<>();
		for(String str : sequenceList) {
			tree.add(Integer.parseInt(str));
		}
		
		int max = (int) tree.toArray()[tree.size()-1];
		int min = (int) tree.toArray()[0];
		
		int num1 = Integer.parseInt(max+""+min);
		int num2 = Integer.parseInt(min+""+max);
		
		if(num1 >= num2) {
			maxNum = num1;
		}else {
			maxNum = num2;
		}
		

				
		///////////////////////////// <-------------- ������� ���� (2)
		return maxNum;
	}
}