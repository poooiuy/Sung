package com.lgcns.tct.pad;

public class Pad {

	/**
	 * �̵����ڿ��� �����ϴ� ���
	 *
	 * @param 	inputData   	String			�Էµ�����(���ڿ�)
	 * @return 					String 			�̵����ڿ�
	 */
	public String getRotationStr(String inputData) {
		String rotationStr = "";
		//////////////////////// ������� ���� (1) ---------------->
		for(int i = 0; i < inputData.length(); i+=2){
			String tmp = inputData.substring(i, i+2);
			char[] tmpArr = tmp.toCharArray();
			if(tmpArr[0] != '0' && (tmpArr[1] == 'U' || tmpArr[1] == 'D' || tmpArr[1] == 'L' || tmpArr[1] == 'R')){
				rotationStr += tmp;
			}
		}
		///////////////////////////// <-------------- ������� ���� (1)
		return rotationStr;
	}

	/**
	 * �����е带 �̵���Ű�� ���
	 *
	 * @param 	inputNumberPad   	int[][]			�Էµ�����(�����е�)
	 * @param 	rotationStr   		String			�̵����ڿ�
	 * @return 						int[][]			�̵��� �����е�
	 */
	public int[][] getNumberPad(int[][] inputNumberPad, String rotationStr) {
		int[][] numberPad = null;
		//////////////////////// ������� ���� (2) ---------------->
		int arrSize = inputNumberPad.length;
		numberPad = new int[arrSize][arrSize];
		for(int i = 0; i < arrSize; i++){
			for(int j = 0; j < arrSize; j++){
				numberPad[i][j] = inputNumberPad[i][j];
			}	
		}
		
		for(int i = 0; i < rotationStr.length(); i+=2){
			String tmp = rotationStr.substring(i, i+2);
			char[] tmpArr = tmp.toCharArray();
			int direction = Integer.parseInt(String.valueOf(tmpArr[0]));
			int isUpAndDown = 0;
			
			if(tmpArr[1] == 'U' || tmpArr[1] == 'D') {
				isUpAndDown = 1;
				if(tmpArr[1] == 'U'){
					direction *= -1;
				}
			} else {
				isUpAndDown = 0;
				if(tmpArr[1] == 'L'){
					direction *= -1;
				}
			}
			rotateArr(numberPad, direction, isUpAndDown);
		}
		
		///////////////////////////// <-------------- ������� ���� (2)
		return numberPad;
	}
	
	/**
	 * �迭�� �̵���Ű�� ��� (�ַ�ǿ� ���, �������Ͽ� ����)
	 *
	 * @param 	numberPad		   	int[][]			�Էµ�����(�����е�)
	 * @param 	direction   		int				����(+�Ǵ�-)
	 * @param 	isUpAndDown   		int				��,�Ʒ�,����,������(0�Ǵ�1)
	 * @return 						int[][]			�̵��� �迭
	 */
	public void rotateArr(int[][] numberPad, int direction, int isUpAndDown) {
		int arrSize = numberPad.length;
		int[][] tmpNumberPad = new int[arrSize][arrSize];
		for(int i = 0; i < arrSize; i++){
			for(int j = 0; j < arrSize; j++){
				tmpNumberPad[i][j] = numberPad[i][j];
			}
		}
		for(int i = 0; i < arrSize; i++){
			for(int j = 0; j < arrSize; j++){
				if(isUpAndDown == 1){
					numberPad[(arrSize*arrSize+direction+i)%arrSize][j] = tmpNumberPad[i][j];
				}
				else{
					numberPad[i][(arrSize*arrSize+direction+j)%arrSize] = tmpNumberPad[i][j];
				}
			}
		}
	}

}