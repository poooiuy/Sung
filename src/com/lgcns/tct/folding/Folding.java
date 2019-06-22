package com.lgcns.tct.folding;


public class Folding {
	
	
	/**
	 * 초기배열을 생성하는 기능
	 *
     * @param		inputData		int[][]		입력데이터(이차원배열)
     * @return						int[][]		생성된 초기 배열
	 */
	public int[][] getIniArr(int[][] inputData) {
		int[][] iniArr = new int[inputData.length][inputData[0].length];
		////////////////////////여기부터 구현 (1) ---------------->	
		for(int i = 0 ; i < inputData.length ; i++) {			
			for(int j = 0 ; j < inputData.length ; j++) {
				int tmp = inputData[i][j];
				iniArr[i][j] = tmp> 5 ? tmp % 5 : tmp;
			}
		}	
		
		///////////////////////////// <-------------- 여기까지 구현 (1)
		return iniArr;
	}
	
	/**
	 * 배열을 상하 좌우로 접는 기능
	 *
     * @param		iniArr		int[][]		생성된 초기 배열
     * @return					int[][]		상하 좌우로 접힌 배열	
	 */
	public int[][] getFoldingArr(int[][] iniArr) {
		int[][] foldingArr = new int[iniArr.length / 2][iniArr[0].length];;
		////////////////////////여기부터 구현 (2) ---------------->		
		for(int i = 0 ; i < foldingArr.length ; i++) {			
			for(int j = 0 ; j < foldingArr[i].length ; j++) {
				int tmp = iniArr[i][j] + iniArr[iniArr.length - i- 1][j];
				foldingArr[i][j] = tmp;
			}
		}
		int[][] foldingArr2 = new int[foldingArr.length][foldingArr[0].length / 2];
		for(int i = 0 ; i < foldingArr2.length ; i++) {
			for(int j = 0 ; j < foldingArr2[i].length ; j++) {
				int tmp = foldingArr[i][j] * foldingArr[i][foldingArr[0].length - j- 1];
				foldingArr2[i][j] = tmp;
			}
		}
		
		foldingArr = foldingArr2;
		///////////////////////////// <-------------- 여기까지 구현 (2)
		return foldingArr;
	}
	
	
	/**
	 * 최종배열의 값을 구하는 기능
	 *
     * @param		foldingArr		int[][]		상하 좌우로 접힌 배열	
     * @return						int			최종배열의 값
	 */
	public int getFinalValue(int[][] foldingArr) {
		int finalValue = 0;
		////////////////////////여기부터 구현 (3) ---------------->
				
		int[][] inner = this.inner(foldingArr);
		
		finalValue = inner[0][0];
		
		///////////////////////////// <-------------- 여기까지 구현 (3)
		return finalValue;
	}
	
	
	public int[][] inner(int[][] foldingArr) {
		int[][] arr = new int[foldingArr.length - 1][foldingArr[0].length - 1];
		if(foldingArr.length % 2 != 0) {
			int x = foldingArr.length / 2; 
			int k = -1;
			
			for(int i = 0 ; i < foldingArr.length ; i++) {
//				int[] col = foldingArr[i];
				if(i != x) {
					k++;
				} 
				int l = 0;
				for(int j = 0 ; j < foldingArr[i].length ; j++) {
					
					if(i != x && j !=x) {
						arr[k][l++] = foldingArr[i][j];
					} 
					
				}
			}
		} else {
			arr = getFoldingArr(foldingArr);
		}
		if(arr.length > 1 && arr[1].length > 1) {
			arr = this.inner(arr);
		}
		return arr;
	}
	
}