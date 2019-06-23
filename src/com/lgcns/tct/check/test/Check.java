package com.lgcns.tct.check.test;

import java.util.TreeSet;

public class Check {
	
	
	/**
	 * üũ���� �����ϴ� ���
	 *
     * @param		inputData		int		�Էµ�����(����)
     * @return						int		üũ��
	 */
	public int getCheckNum(int inputData) {
		int checkNum = 0;
		////////////////////////������� ���� (1) ---------------->
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
		
		///////////////////////////// <-------------- ������� ���� (1)
			
		return checkNum;
	}
	
	
	/**
	 * ���ο� ���� �����ϴ� ���
	 *
     * @param		inputData		int			�Էµ�����(����)
     * @param		checkNum		int			üũ��
     * @return						int			���ο� ��
	 */
	public int getNewNum(int inputData, int checkNum) {
		int newNum = 0;
		////////////////////////������� ���� (2) ---------------->
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

		///////////////////////////// <-------------- ������� ���� (2)
		return newNum;
	}
	
}























