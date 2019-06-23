package com.lgcns.tct.calculation.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculation {
	
	
	/**
	 * �� ���� ���� ū ������ �����ϴ� ���
	 *
     * @param		inputData		String			�Էµ�����(���ڿ�)
     * @return						List			���ĵ� ���ڿ� ���
	 */
	public List<String> sortNumbers(String inputData) {
		List<String> sortedNumbers = null;
		////////////////////////������� ���� (1) ---------------->
		
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
		///////////////////////////// <-------------- ������� ���� (1)
		return sortedNumbers;
	}
	
	/**
	 * �� ���� �̿��Ͽ� ���ο� ���� �����ϴ� ���
	 *
     * @param		sortedNumbers	List			���ĵ� ���ڿ� ���
     * @return						int				������ ����
	 */
	public int generateNumber(List<String> sortedNumbers) {
		int generatedNumber = 0;
		////////////////////////������� ���� (2) ---------------->
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
		

		///////////////////////////// <-------------- ������� ���� (2)
		return generatedNumber;
	}
	
}