package com.lgcns.tct.division;

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
		String tmp = ""+operationResult;
		String ret ="";
		
		for(int i=0; i<tmp.length();i++){
			char n = tmp.charAt(i);
			if(ret.indexOf(n)==-1){
				ret+=n;
			}
		}
		
		number = Integer.parseInt(ret);
		
		
		
		
		///////////////////////////// <-------------- ������� ���� (2)
		return number;
	}
	
}














