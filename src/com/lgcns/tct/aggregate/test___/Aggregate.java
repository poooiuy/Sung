package com.lgcns.tct.aggregate.test___;

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
		for(int i=1; i <= arraySize; i++) {
			numberOfSubArrays = numberOfSubArrays + getCount(arraySize, i);
		}

		
		///////////////////////////// <-------------- 여기까지 구현 (1)
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
	 * 최대값을 찾는 기능
	 *
     * @param		inputData			int[][]		입력데이터(NxN배열)
     * @return							int			최대값
	 */
	public int getMaximumValue(int[][] inputData) {
		int maximumValue = -1;
		boolean bFirst = false;
		
		////////////////////////여기부터 구현 (2) ---------------->
		for(int i=0; i < inputData.length; i++) {
			int maxSum = getMaxSum(inputData, i);
			if(maxSum > maximumValue) {
				maximumValue = maxSum;
			}
		}
		///////////////////////////// <-------------- 여기까지 구현 (2)
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