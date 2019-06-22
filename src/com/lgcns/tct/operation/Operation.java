package com.lgcns.tct.operation;

import java.util.ArrayList;
import java.util.List;

public class Operation {
	/**
	 * 문자열 분리 기능
	 * 
     * @param		inputData			String		입력데이터(문자열)
     * @return							List		[0]: 문자로 구성된 문자열, [1]: 숫자로 구성된 문자열
	 */
	public List<String> getStrList(String inputData){
		List<String> strList = null;
		//////////////////////여기부터 구현 (1) ---------------->
		strList = new ArrayList<String>();
		String str = "";
		String numStr = "";
		char[] ch = inputData.toCharArray();
		for(char c : ch){
			if(isNum(String.valueOf(c))){
				numStr += c;
			}else{
				str += c;	
			}
		}
		strList.add(str);
		strList.add(numStr);
		///////////////////////////// <-------------- 여기까지 구현 (1)
		return strList;
	}
	
	/**
	 * 새로운 문자열을 생성하는 기능
	 * 
     * @param		strList			List		[0]: 문자로 구성된 문자열, [1]: 숫자로 구성된 문자열
     * @return						String		새로운 문자열
	 */
	public String getNewStr(List<String> strList){
		String newStr = "";
		//////////////////////여기부터 구현 (2) ---------------->
		String str = strList.get(0);
		String numStr = strList.get(1);
		char[] strArr = str.toCharArray();
		char[] numStrArr = numStr.toCharArray();
		for(int i = 0 ; i < strArr.length; i++){
			if(i == strArr.length-1){
				newStr += strArr[i];
			}else{
				newStr += strArr[i]+""+numStrArr[i];	
			}
		}
		///////////////////////////// <-------------- 여기까지 구현 (2)
		return newStr;
	}
	
	/**
	 * 숫자를 확인하는 기능(솔루션용 기능, 제공파일에 없음)
	 *
     * @param		s			String		문자열
     * @return					boolean		숫자여부
	 */
	public boolean isNum(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
    }
}
