package com.lgcns.tct.calculation;

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
		sortedNumbers = new ArrayList<String>();
		
		String inputDataStr= inputData;
		if(inputData.length() == 7){
			inputDataStr = inputData.substring(0,1)+"12"+inputData.substring(1);
		}else if(inputDataStr.length() == 8){
			inputDataStr = inputData.substring(0,2)+"1"+inputData.substring(2);
		} 
		for(int i = 0; i < inputDataStr.length(); i= i+3){
			String eachNumber = inputDataStr.substring(i, i+3);
			sortedNumbers.add(eachNumber); 
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
		int first = 0;
		int second = 0;
		int third = 0;
		
		for(int i=0; i<sortedNumbers.size(); i++) {
			String numberStr = String.valueOf(sortedNumbers.get(i));			
			for(int j = 0; j < 3; j++) {
				int currentNum = Integer.parseInt(String.valueOf(numberStr.charAt(j)));
				if(j == 0){
					first += currentNum;
				}else if(j ==1){
					second += currentNum;
				}else{
					third += currentNum;
				}
			}
		}
		
		generatedNumber = (first%10)*100 + (second%10)*10 + (third%10);
		///////////////////////////// <-------------- 여기까지 구현 (2)
		return generatedNumber;
	}
	
}