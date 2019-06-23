package com.lgcns.tct.aggregate.test___;

public class Aggregate {
	
	
	/**
	 * �κ� �迭�� ������ ���ϴ� ���
	 *
     * @param		arraySize			int		�迭 ũ��
     * @return							int		�κ� �迭�� ����
	 */
	public int getNumberOfSubArrays(int arraySize) {
		int numberOfSubArrays = 0;
		////////////////////////������� ���� (1) ---------------->
		for(int i=1; i <= arraySize; i++) {
			numberOfSubArrays = numberOfSubArrays + getCount(arraySize, i);
		}

		
		///////////////////////////// <-------------- ������� ���� (1)
		return numberOfSubArrays;
	}
	
	private int getCount(int arraySize, int num) {
		int result = 0;
		for(int i=num; i<= arraySize; i++) {
			result = result+1;
		}
		
		return result*result;
		
	}



	
	
	/**
	 * �ִ밪�� ã�� ���
	 *
     * @param		inputData			int[][]		�Էµ�����(NxN�迭)
     * @return							int			�ִ밪
	 */
	public int getMaximumValue(int[][] inputData) {
		int maximumValue = -1;
		boolean bFirst = false;
		
		////////////////////////������� ���� (2) ---------------->
		for(int i=0; i < inputData.length; i++) {
			int maxSum = getMaxSum(inputData, i);
			if(maxSum > maximumValue) {
				maximumValue = maxSum;
			}
		}
		///////////////////////////// <-------------- ������� ���� (2)
		return maximumValue;
	}
		
	private int getMaxSum(int[][] inputDatainputData, int num) {
		int result = 0;
		for(int i=0; i < inputDatainputData.length - num; i++) {
			for(int j=0; j<inputDatainputData.length - num; j++) {
				result = result + inputDatainputData[i][j];
			}
		}
		
		return result;
	}


	
}