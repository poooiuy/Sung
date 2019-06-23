package com.lgcns.tct.operation.test;

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
		String num = "";
		String str = "";
		for(int i=0; i<inputData.length(); i++) {
			
			try {
				num = num + Integer.parseInt(inputData.charAt(i)+"");
			}catch(Exception e) {
				str = str + inputData.charAt(i);
			}
			
		}
		
		strList = new ArrayList<>();
		strList.add(str);
		strList.add(num);
		

		

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
		for(int i=0; i < strList.get(0).length(); i++) {
			newStr = newStr + strList.get(0).charAt(i);
			if(i < strList.get(0).length()-1) {
				newStr = newStr + strList.get(1).charAt(i);
			}
		}
			
		
		///////////////////////////// <-------------- 여기까지 구현 (2)
		return newStr;
	}

}
