package com.lgcns.tct.division.test;

import java.util.ArrayList;

public class Division {
	

	/**
	 * 연산결과를 구하는 기능
	 * 
     * @param		inputData		int			입력데이터(숫자)
     * @return						int			연산 결과
	 */
	public int getOperationResult(int inputData){
		int operationResult = 0;
		//////////////////////여기부터 구현 (1) ---------------->
		String inputDataStr = inputData+"";
		inputDataStr = inputDataStr.replace("0", "1");
		String[] arr = new String[inputDataStr.length()];
		String result = "";
		for (int i=0; i < inputDataStr.length(); i++) {
			arr[i] = inputDataStr.charAt(i)+"";
		}
		
		for(int i=0; i < inputDataStr.length()-1; i++) {
			if(Integer.parseInt(arr[i]) >= Integer.parseInt( arr[i+1])) {
				result = result + ( Integer.parseInt(arr[i]) / Integer.parseInt( arr[i+1])+"" );
			}else {
				result = result + ( Integer.parseInt(arr[i]) % Integer.parseInt( arr[i+1])+"" );
			}
		}
		
		operationResult = Integer.parseInt(result);
		///////////////////////////// <-------------- 여기까지 구현 (1)
		return operationResult;
	}
	
	/**
	 * 중복을 제거한 수를 만드는 기능
	 * 
     * @param		operationResult		int			연산 결과
     * @return							int			중복을 제거한 수
	 */
	public int getNumber(int operationResult){
		int number = 0;
		//////////////////////여기부터 구현 (2) ---------------->
		String str = operationResult+"";
		String result = "";
		for(int i=0; i< str.length(); i++) {
			char a = str.charAt(i);
			if(result.indexOf(a) == -1) {
				result = result + a;
			}
		}
		
		number = Integer.parseInt(result);
		
		///////////////////////////// <-------------- 여기까지 구현 (2)
		return number;
	}
	
}














