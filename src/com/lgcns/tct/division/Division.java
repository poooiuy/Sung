package com.lgcns.tct.division;

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
		String input = ""+inputData;
		String tmp ="";
		
		for(int i=0;i<input.length()-1; i++){
			int n1 = Character.getNumericValue(input.charAt(i));
			if(n1 == 0) n1 = 1;
			int n2 = Character.getNumericValue(input.charAt(i+1));
			if(n2 == 0) n2 = 1;
			int num;
			if(n1 >= n2){
				num = n1/n2;
			}else{
				num = n1%n2;
			}
			
			tmp += num;
		}
		
		operationResult = Integer.parseInt(tmp);
		
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
		String tmp = ""+operationResult;
		String ret ="";
		
		for(int i=0; i<tmp.length();i++){
			char n = tmp.charAt(i);
			if(ret.indexOf(n)==-1){
				ret+=n;
			}
		}
		
		number = Integer.parseInt(ret);
		
		
		
		
		///////////////////////////// <-------------- 여기까지 구현 (2)
		return number;
	}
	
}














