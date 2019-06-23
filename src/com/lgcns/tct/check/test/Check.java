package com.lgcns.tct.check.test;

import java.util.TreeSet;

public class Check {
	
	
	/**
	 * 체크수를 생성하는 기능
	 *
     * @param		inputData		int		입력데이터(숫자)
     * @return						int		체크수
	 */
	public int getCheckNum(int inputData) {
		int checkNum = 0;
		////////////////////////여기부터 구현 (1) ---------------->
		String inputString = inputData+"";
		int length = inputString.length();
		
		int total = 0;
		
		for(int i=0; i < length; i++) {
			int sub = Integer.parseInt(inputString.charAt(i)+"") * (length-i);
			total = total + sub;
		}
		
		if (total%length == 0) {
			checkNum = total/length;
		}else {
			checkNum = total%length;
		}
		
		///////////////////////////// <-------------- 여기까지 구현 (1)
			
		return checkNum;
	}
	
	
	/**
	 * 새로운 수를 생성하는 기능
	 *
     * @param		inputData		int			입력데이터(숫자)
     * @param		checkNum		int			체크수
     * @return						int			새로운 수
	 */
	public int getNewNum(int inputData, int checkNum) {
		int newNum = 0;
		////////////////////////여기부터 구현 (2) ---------------->
		String checkNumStr = checkNum+"";
		String inputDataStr = inputData + "";
		
		if(checkNumStr.length() == 1) {
			newNum = Integer.parseInt(inputData + checkNumStr);
		}else {
//			System.out.println(checkNumStr.charAt(0));
//			System.out.println(checkNumStr.charAt(1));
			if( checkNumStr.charAt(0) > checkNumStr.charAt(1) ) {
				inputDataStr = checkNumStr.charAt(0)+"" + inputData+"" + checkNumStr.charAt(1)+"";
			}else {
				inputDataStr = checkNumStr.charAt(1)+"" + inputData+"" + checkNumStr.charAt(0)+"";
			}
			newNum = Integer.parseInt(inputDataStr);
		}

		///////////////////////////// <-------------- 여기까지 구현 (2)
		return newNum;
	}
	
}























