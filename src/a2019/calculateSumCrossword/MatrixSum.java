package a2019.calculateSumCrossword;

public class MatrixSum {
	
	/**
	 * 가로(행)의 합을 추가하는 기능
	 * 
	 * @param 		inputData		입력데이터 (2차원 배열)
	 * @return		int[][]			가로(행)의 합이 추가된 2차원 배열
	 */
	public int[][] getHorizontalSum( int[][] inputData ) {
		
		int[][] summedData = null;
		
		////////////////////////여기부터 코딩 (1) ---------------->
		summedData = new int[inputData.length][inputData[0].length+1];
		
		for(int i=0; i < inputData.length; i++) {
			int nSum = 0;
			for(int j = 0; j < inputData[0].length; j++) {
				summedData[i][j] = inputData[i][j];
				nSum += inputData[i][j];
			}
			summedData[i][inputData[0].length] = nSum;
		}
		
		///////////////////////////// <-------------- 여기까지 코딩 (1)
		
		return summedData;
	}
	
	/**
	 * 중앙 열을 기준으로 좌우 교환한 후, 세로(열)의 합을 추가하는 기능
	 * 
	 * @param 		summedData		가로(행)의 합이 추가된 2차원 배열
	 * @return		int[][]			좌우 교환 후 세로(열)의 합이 추가된 2차원 배열
	 */
	public int[][] getVerticalSum( int[][] summedData ) {
		
		int[][] resultData = null;
		
		////////////////////////여기부터 코딩 (2) ---------------->
		resultData = new int[summedData.length+1][summedData[0].length];
		int halfLength = (int)(summedData[0].length / 2);
		//System.out.println("halfLength=" + halfLength);
		
		int[] columnSum = new int[summedData[0].length];
		
		for(int i=0; i < summedData.length; i++) {
			for(int j = 0; j < summedData[0].length; j++) {
				
				int column = 0;
				if( summedData[0].length%2 == 1 ) {  // 홀수일때
					if(j == halfLength) {
						column = j;
					} else if(j > halfLength) {
						column = j - halfLength - 1;
					} else {
						column = j + halfLength + 1;
					}

				} else {  // 짝수일때
					
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
		
		///////////////////////////// <-------------- 여기까지 코딩 (2)
		
		return resultData;
	}
}