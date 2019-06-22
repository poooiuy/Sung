package com.lgcns.tct.aggregate;

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
		for(int i=1;i<=arraySize;i++){
			numberOfSubArrays += getNumberSum(arraySize, i);
		}
		
		///////////////////////////// <-------------- ������� ���� (1)
		return numberOfSubArrays;
	}


	private int getNumberSum(int arraySize, int initialNumber) {
		int maxX = 0;
		
		for(int i=initialNumber;i<=arraySize;i++){
			if ( i <= arraySize ) {
				maxX++;
			} else {
				break;
			}
		
		}
		
		return (maxX * maxX);
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
		for(int i=1;i<=inputData.length;i++){
			int tMaximumValue = getMaxValue(inputData,i);
			
			if ( bFirst ) {
				bFirst = false;
				maximumValue = tMaximumValue;
			} else {
				if ( maximumValue < tMaximumValue ) {
					maximumValue = tMaximumValue;
				}
			}
		}
		
		///////////////////////////// <-------------- ������� ���� (2)
		return maximumValue;
	}


	private int getMaxValue(int[][] inputData, int endValue) {
		int maximumValue = 0;
		int maxLength = inputData.length;
		int orgCurrentXEnd = endValue;
		
		int currentXEnd = endValue;
		int currentYEnd = endValue;
		int currentXStart = 0;
		int currentYStart = 0;
		
		while ( maxLength >= currentXEnd ) {
			int sum = 0;
			for(int i=currentXStart;i<currentXEnd;i++){
				for(int j=currentYStart;j<currentYEnd;j++){
					sum = sum + inputData[j][i];
				}
			}
			currentXStart++;;
			currentXEnd++;
			
			if ( maximumValue < sum ) {
				maximumValue = sum;
			}
		}
		currentYStart++;
		currentYEnd++;
	
		currentXEnd = orgCurrentXEnd;
		currentXStart = 0;
		while ( maxLength >= currentYEnd ) {
			int sum = 0;
			for(int i=currentXStart;i<currentXEnd;i++){
				for(int j=currentYStart;j<currentYEnd;j++){
					sum = sum + inputData[j][i];
				}
			}
			currentXStart++;;
			currentXEnd++;
			
			currentYStart++;
			currentYEnd++;
			
			if ( maximumValue < sum ) {
				maximumValue = sum;
			}
		}
		return maximumValue;
	}
	
}