package com.lgcns.tct.aggregate;

public class Aggregate {
	
	
	/**
	 * 부분 배열의 개수를 구하는 기능
	 *
     * @param		arraySize			int		배열 크기
     * @return							int		부분 배열의 개수
	 */
	public int getNumberOfSubArrays(int arraySize) {
		int numberOfSubArrays = 0;
		////////////////////////여기부터 구현 (1) ---------------->
		for(int i=1;i<=arraySize;i++){
			numberOfSubArrays += getNumberSum(arraySize, i);
		}
		
		///////////////////////////// <-------------- 여기까지 구현 (1)
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
	 * 최대값을 찾는 기능
	 *
     * @param		inputData			int[][]		입력데이터(NxN배열)
     * @return							int			최대값
	 */
	public int getMaximumValue(int[][] inputData) {
		int maximumValue = -1;
		boolean bFirst = false;
		
		////////////////////////여기부터 구현 (2) ---------------->
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
		
		///////////////////////////// <-------------- 여기까지 구현 (2)
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