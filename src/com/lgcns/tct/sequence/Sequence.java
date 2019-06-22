package com.lgcns.tct.sequence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sequence {
	
	
	/**
	 * 연속수 목록 검색 기능
	 *
     * @param		inputData		List		입력데이터(숫자열 목록)
     * @return						List		연속수 목록
	 */
	public List<String> getSequenceList(List<String> inputData) {
		List<String> sequenceList = null;
		////////////////////////여기부터 구현 (1) ---------------->
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
		///////////////////////////// <-------------- 여기까지 구현 (1)
		return sequenceList;
	}
	
	/**
	 * 가장 큰 수 생성 기능
	 *
     * @param		sequenceList	List		연속수 목록
     * @return						int			가장 큰 수
	 */
	public int getMaxNum(List<String> sequenceList) {
		int maxNum = 0;
		////////////////////////여기부터 구현 (2) ---------------->
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
				
		///////////////////////////// <-------------- 여기까지 구현 (2)
		return maxNum;
	}
}