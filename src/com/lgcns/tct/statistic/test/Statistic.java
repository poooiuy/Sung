package com.lgcns.tct.statistic.test;

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
		int max = 0;
		for(int i=0; i < inputData.length; i++) {
			if(inputData[i] > max) {
				max = inputData[i];
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
		int max = 0;
		int last = 0;
		for(int i=0; i < inputData.length; i++) {
			if(i==0) {
				last = inputData[i];
			}else {
				if((last - inputData[i]) > max) {
					max = last - inputData[i];
					maxDecreaseYear = 2010+i;
				}
				last = inputData[i];
			}

		}
		
		///////////////////////////// <-------------- ������� ���� (2)
		return maxDecreaseYear;
	}

}