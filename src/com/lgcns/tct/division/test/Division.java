package com.lgcns.tct.division.test;

import java.util.ArrayList;

public class Division {
	

	/**
	 * �������� ���ϴ� ���
	 * 
     * @param		inputData		int			�Էµ�����(����)
     * @return						int			���� ���
	 */
	public int getOperationResult(int inputData){
		int operationResult = 0;
		//////////////////////������� ���� (1) ---------------->
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
		///////////////////////////// <-------------- ������� ���� (1)
		return operationResult;
	}
	
	/**
	 * �ߺ��� ������ ���� ����� ���
	 * 
     * @param		operationResult		int			���� ���
     * @return							int			�ߺ��� ������ ��
	 */
	public int getNumber(int operationResult){
		int number = 0;
		//////////////////////������� ���� (2) ---------------->
		String str = operationResult+"";
		String result = "";
		for(int i=0; i< str.length(); i++) {
			char a = str.charAt(i);
			if(result.indexOf(a) == -1) {
				result = result + a;
			}
		}
		
		number = Integer.parseInt(result);
		
		///////////////////////////// <-------------- ������� ���� (2)
		return number;
	}
	
}














