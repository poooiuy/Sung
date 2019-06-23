package com.lgcns.tct.calculation.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculation {
	
	
	/**
	 * 세 수를 만들어서 큰 순서로 정렬하는 기능
	 *
     * @param		inputData		String			입력데이터(숫자열)
     * @return						List			정렬된 숫자열 목록
	 */
	public List<String> sortNumbers(String inputData) {
		List<String> sortedNumbers = null;
		////////////////////////여기부터 구현 (1) ---------------->
		
		sortedNumbers = new ArrayList<>();
		
		String input = inputData;
		if(inputData.length() == 7) {
			input = inputData.substring(0, 1) + "12" + inputData.substring(1, 7);
		}else if(inputData.length() == 8) {
			input = inputData.substring(0, 2) + "1" + inputData.substring(2, 8);
		}
		
		
		
		for(int i=0; i < input.length(); i=i+3) {
			sortedNumbers.add( input.substring(i, i+3));
		}
		
		Collections.sort(sortedNumbers);
		Collections.reverse(sortedNumbers);
		///////////////////////////// <-------------- 여기까지 구현 (1)
		return sortedNumbers;
	}
	
	/**
	 * 세 수를 이용하여 새로운 수를 생성하는 기능
	 *
     * @param		sortedNumbers	List			정렬된 숫자열 목록
     * @return						int				생성된 숫자
	 */
	public int generateNumber(List<String> sortedNumbers) {
		int generatedNumber = 0;
		////////////////////////여기부터 구현 (2) ---------------->
		int a = 0;
		int b = 0;
		int c = 0;
		
		for(String num : sortedNumbers) {
			String numStr = num;
			for(int i = 0; i < 3; i++) {
				int numInt = Integer.parseInt(String.valueOf(numStr.charAt(i)));
				if (i == 0)	a = a + numInt;
				if (i == 1)	b = b + numInt;
				if (i == 2)	c = c + numInt;
			}
		}
		generatedNumber = ((a%10)* 100) + ((b%10)* 10) + (c%10);
		

		///////////////////////////// <-------------- 여기까지 구현 (2)
		return generatedNumber;
	}
	
}