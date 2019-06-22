package com.lgcns.tct.sum;


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
		int arraySize = inputData.length;
		sortedArray = new int[arraySize][arraySize];
		for(int i=0; i<arraySize; i++) {
			for(int j=0; j<arraySize; j++) {
				sortedArray[i][j] = inputData[i][j]%10;
			}
		}
		for(int i=0; i<arraySize; i++){
			for(int j=0; j<arraySize; j++){
				for(int k=j+1; k<arraySize; k++){
					if(sortedArray[i][j] > sortedArray[i][k]) {
						int tmp = sortedArray[i][j];
						sortedArray[i][j] = sortedArray[i][k];
						sortedArray[i][k] = tmp;
					}
				}
			}
		}
		for(int i=0; i<arraySize; i++){
			for(int j=0; j<arraySize; j++){
				for(int k=j+1; k<arraySize; k++){
					if(sortedArray[j][i] > sortedArray[k][i]) {
						int tmp = sortedArray[j][i];
						sortedArray[j][i] = sortedArray[k][i];
						sortedArray[k][i] = tmp;
					}
				}
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
					int flag = 0;
					for(int k=0; k<4; k++) {
						int nx = i+dx[k];
						int ny = j+dy[k];
						if(nx<arraySize && nx>=0 && ny<arraySize && ny>=0) {
							if(sortedArray[i][j] == sortedArray[nx][ny]) {
								flag = 1;
								break;
							}
						}
					}
					if(flag == 0){
						arrSum += sortedArray[i][j];
					}
				}
			}
		}
		///////////////////////////// <-------------- ������� ���� (2)
		return arrSum;
	}
	
}