package com.lgcns.tct.sequence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
		sequenceList = new ArrayList<String>();
		for(String str : inputData){
			char[] strArr = str.toCharArray();
			int tmp = Integer.parseInt(String.valueOf(strArr[0]));
			boolean check = true;
			for(int i = 1; i < strArr.length; i++){
				int intCh = Integer.parseInt(String.valueOf(strArr[i]));
				if(tmp == intCh - 1){
					tmp = intCh;
				}else{
					check = false;
					break;
				}
			}
			if(check){
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
		List<Integer> tmpSequenceList = new ArrayList<Integer>();
		for(String str : sequenceList){
			tmpSequenceList.add(Integer.parseInt(str));
		}
		Collections.sort(tmpSequenceList);
		String minStr = String.valueOf(tmpSequenceList.get(0));
		Collections.reverse(tmpSequenceList);
		String maxStr = String.valueOf(tmpSequenceList.get(0));
		int firstNum = Integer.parseInt(minStr + maxStr);
		int secondNum = Integer.parseInt(maxStr + minStr);
		
		if(firstNum > secondNum){
			maxNum = firstNum;
		}else{
			maxNum = secondNum;
		}
				
		///////////////////////////// <-------------- ������� ���� (2)
		return maxNum;
	}
}