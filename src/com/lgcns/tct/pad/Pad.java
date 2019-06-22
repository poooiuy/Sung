package com.lgcns.tct.pad;

public class Pad {

	/**
	 * 이동문자열을 추출하는 기능
	 *
	 * @param 	inputData   	String			입력데이터(문자열)
	 * @return 					String 			이동문자열
	 */
	public String getRotationStr(String inputData) {
		String rotationStr = "";
		//////////////////////// 여기부터 구현 (1) ---------------->
		for(int i = 0; i < inputData.length(); i+=2){
			String tmp = inputData.substring(i, i+2);
			char[] tmpArr = tmp.toCharArray();
			if(tmpArr[0] != '0' && (tmpArr[1] == 'U' || tmpArr[1] == 'D' || tmpArr[1] == 'L' || tmpArr[1] == 'R')){
				rotationStr += tmp;
			}
		}
		///////////////////////////// <-------------- 여기까지 구현 (1)
		return rotationStr;
	}

	/**
	 * 숫자패드를 이동시키는 기능
	 *
	 * @param 	inputNumberPad   	int[][]			입력데이터(숫자패드)
	 * @param 	rotationStr   		String			이동문자열
	 * @return 						int[][]			이동된 숫자패드
	 */
	public int[][] getNumberPad(int[][] inputNumberPad, String rotationStr) {
		int[][] numberPad = null;
		//////////////////////// 여기부터 구현 (2) ---------------->
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
		
		///////////////////////////// <-------------- 여기까지 구현 (2)
		return numberPad;
	}
	
	/**
	 * 배열을 이동시키는 기능 (솔루션용 기능, 제공파일에 없음)
	 *
	 * @param 	numberPad		   	int[][]			입력데이터(숫자패드)
	 * @param 	direction   		int				방향(+또는-)
	 * @param 	isUpAndDown   		int				위,아래,왼쪽,오른쪽(0또는1)
	 * @return 						int[][]			이동된 배열
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