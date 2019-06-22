package com.lgcns.tct.statistic;

public class Statistic {

	/**
	 * ����� ���� ���� ���� ���� �˻� ���
	 *
	 * @param 	inputData   	int[]			�Էµ�����(����� �� ������) ([0]:2010��, [1]:2011��, [2]:2012��, [3]:2013��, [4]:2014��, [5]:2015��, [6]:2016��)
	 * @return 					int 			����� ���� ���� ���� ����
	 */
	public int getMaxYear(int[] inputData) {
		int maxYear = 0;
		//////////////////////// ������� ���� (1) ---------------->
		int maxNum = 0;
		for(int i = 0; i < inputData.length; i++){
			int num = inputData[i];
			if(maxNum < num){
				maxNum = num;
				maxYear = 2010+i;
			}
		}
		///////////////////////////// <-------------- ������� ���� (1)
		return maxYear;
	}

	/**
	 * ����� ���� ���� ũ�� ������ ���� �˻� ���
	 *
	 * @param 	inputData   	int[]			�Էµ�����(����� �� ������) ([0]:2010��, [1]:2011��, [2]:2012��, [3]:2013��, [4]:2014��, [5]:2015��, [6]:2016��)
	 * @return 					int 			����� ���� ���� ũ�� ������ ����
	 */
	public int getMaxDecreaseYear(int[] inputData) {
		int maxDecreaseYear = 0;
		//////////////////////// ������� ���� (2) ---------------->
		
		int maxDecrease = Integer.MAX_VALUE;
		
		for(int i = 1; i < inputData.length; i++){
			int decrease = inputData[i] - inputData[i-1];
			if(maxDecrease > decrease){
				maxDecrease = decrease;
				maxDecreaseYear = 2010+i;
			}
		}
		
		///////////////////////////// <-------------- ������� ���� (2)
		return maxDecreaseYear;
	}

}