package a2019.calculateSumCrossword;

public class MatrixSum {
	
	/**
	 * ����(��)�� ���� �߰��ϴ� ���
	 * 
	 * @param 		inputData		�Էµ����� (2���� �迭)
	 * @return		int[][]			����(��)�� ���� �߰��� 2���� �迭
	 */
	public int[][] getHorizontalSum( int[][] inputData ) {
		
		int[][] summedData = null;
		
		////////////////////////������� �ڵ� (1) ---------------->
		summedData = new int[inputData.length][inputData[0].length+1];
		
		for(int i=0; i < inputData.length; i++) {
			int nSum = 0;
			for(int j = 0; j < inputData[0].length; j++) {
				summedData[i][j] = inputData[i][j];
				nSum += inputData[i][j];
			}
			summedData[i][inputData[0].length] = nSum;
		}
		
		///////////////////////////// <-------------- ������� �ڵ� (1)
		
		return summedData;
	}
	
	/**
	 * �߾� ���� �������� �¿� ��ȯ�� ��, ����(��)�� ���� �߰��ϴ� ���
	 * 
	 * @param 		summedData		����(��)�� ���� �߰��� 2���� �迭
	 * @return		int[][]			�¿� ��ȯ �� ����(��)�� ���� �߰��� 2���� �迭
	 */
	public int[][] getVerticalSum( int[][] summedData ) {
		
		int[][] resultData = null;
		
		////////////////////////������� �ڵ� (2) ---------------->
		resultData = new int[summedData.length+1][summedData[0].length];
		int halfLength = (int)(summedData[0].length / 2);
		//System.out.println("halfLength=" + halfLength);
		
		int[] columnSum = new int[summedData[0].length];
		
		for(int i=0; i < summedData.length; i++) {
			for(int j = 0; j < summedData[0].length; j++) {
				
				int column = 0;
				if( summedData[0].length%2 == 1 ) {  // Ȧ���϶�
					if(j == halfLength) {
						column = j;
					} else if(j > halfLength) {
						column = j - halfLength - 1;
					} else {
						column = j + halfLength + 1;
					}

				} else {  // ¦���϶�
					
					if(j >= halfLength) {
						column = j - halfLength;
					} else {
						column = j + halfLength;
					}
				}
				
				resultData[i][j] = summedData[i][column];
				
				columnSum[j] += resultData[i][j];
			}
		}	
		
		for(int j = 0; j < summedData[0].length; j++) {
			resultData[summedData.length][j] = columnSum[j];
		}
		
		///////////////////////////// <-------------- ������� �ڵ� (2)
		
		return resultData;
	}
}