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
	 * �迭�� �����ϴ� ���
	 *
     * @param		inputData		int[][]		�Էµ�����(�������迭)
     * @return						int[][]		���ĵ� �迭
	 */
	public int[][] getSortedArray(int[][] inputData) {
		int[][] sortedArray = null;
		////////////////////////������� ���� (1) ---------------->
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

		
		///////////////////////////// <-------------- ������� ���� (1)
		return sortedArray;
	}
	
	/**
	 * �迭���� ����ϴ� ���
	 *
     * @param		sortedArray		int[][]		���ĵ� �迭
     * @return						int			�迭��
	 */
	public int getArrSum(int[][] sortedArray) {
		int arrSum = 0;
		////////////////////////������� ���� (2) ---------------->
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
			
		///////////////////////////// <-------------- ������� ���� (2)
		return arrSum;
	}
	
	
}