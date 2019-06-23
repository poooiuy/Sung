package com.lgcns.tct.sum.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Sum {
	
	
	/**
	 * 배열을 정렬하는 기능
	 *
     * @param		inputData		int[][]		입력데이터(이차원배열)
     * @return						int[][]		정렬된 배열
	 */
	public int[][] getSortedArray(int[][] inputData) {
		int[][] sortedArray = null;
		////////////////////////여기부터 구현 (1) ---------------->
		sortedArray = new int[inputData.length][inputData.length];
		
		for(int i=0; i < inputData.length; i++) {
			for(int j=0; j < inputData.length; j++) {
				sortedArray[i][j] = (inputData[i][j]) % 10;
			}
		}
		
		for(int i=0; i < inputData.length; i++) {
			List<Integer> temp = new ArrayList<>();
			for(int j=0; j < inputData.length; j++) {
				temp.add(sortedArray[i][j]);
			}
			Collections.sort(temp);

			for(int j=0; j < inputData.length; j++) {
				sortedArray[i][j] = temp.get(j);
			}
		}
		
		for(int j=0; j < inputData.length; j++) {
			List<Integer> temp = new ArrayList<>();
			for(int i=0; i < inputData.length; i++) {
				temp.add(sortedArray[i][j]);
			}
			Collections.sort(temp);

			for(int i=0; i < inputData.length; i++) {
				sortedArray[i][j] = temp.get(i);
			}
		}

		
		///////////////////////////// <-------------- 여기까지 구현 (1)
		return sortedArray;
	}
	
	/**
	 * 배열합을 계산하는 기능
	 *
     * @param		sortedArray		int[][]		정렬된 배열
     * @return						int			배열합
	 */
	public int getArrSum(int[][] sortedArray) {
		int arrSum = 0;
		////////////////////////여기부터 구현 (2) ---------------->
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		int arraySize = sortedArray.length;
		
		for(int i=0; i<arraySize; i++){
			for(int j=0; j<arraySize; j++){
				if(sortedArray[i][j] != 0) {
					boolean flag = false;
					for(int k=0; k<4; k++) {
						int nx = i+dx[k];
						int ny = j+dy[k];
						if(nx<arraySize && nx>=0 && ny<arraySize && ny>=0) {
							if(sortedArray[i][j] == sortedArray[nx][ny]) {
								flag = true;
								break;
							}
						}
					}
					if(!flag) {
						arrSum += sortedArray[i][j];
					}
				}
			}
		}
			
		///////////////////////////// <-------------- 여기까지 구현 (2)
		return arrSum;
	}
	
	
}