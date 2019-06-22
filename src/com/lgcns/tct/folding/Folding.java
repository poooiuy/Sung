package com.lgcns.tct.folding;


public class Folding {
	
	
	/**
	 * �ʱ�迭�� �����ϴ� ���
	 *
     * @param		inputData		int[][]		�Էµ�����(�������迭)
     * @return						int[][]		������ �ʱ� �迭
	 */
	public int[][] getIniArr(int[][] inputData) {
		int[][] iniArr = new int[inputData.length][inputData[0].length];
		////////////////////////������� ���� (1) ---------------->	
		for(int i = 0 ; i < inputData.length ; i++) {			
			for(int j = 0 ; j < inputData.length ; j++) {
				int tmp = inputData[i][j];
				iniArr[i][j] = tmp> 5 ? tmp % 5 : tmp;
			}
		}	
		
		///////////////////////////// <-------------- ������� ���� (1)
		return iniArr;
	}
	
	/**
	 * �迭�� ���� �¿�� ���� ���
	 *
     * @param		iniArr		int[][]		������ �ʱ� �迭
     * @return					int[][]		���� �¿�� ���� �迭	
	 */
	public int[][] getFoldingArr(int[][] iniArr) {
		int[][] foldingArr = new int[iniArr.length / 2][iniArr[0].length];;
		////////////////////////������� ���� (2) ---------------->		
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
		///////////////////////////// <-------------- ������� ���� (2)
		return foldingArr;
	}
	
	
	/**
	 * �����迭�� ���� ���ϴ� ���
	 *
     * @param		foldingArr		int[][]		���� �¿�� ���� �迭	
     * @return						int			�����迭�� ��
	 */
	public int getFinalValue(int[][] foldingArr) {
		int finalValue = 0;
		////////////////////////������� ���� (3) ---------------->
				
		int[][] inner = this.inner(foldingArr);
		
		finalValue = inner[0][0];
		
		///////////////////////////// <-------------- ������� ���� (3)
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