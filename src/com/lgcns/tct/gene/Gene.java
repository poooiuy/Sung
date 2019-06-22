package com.lgcns.tct.gene;

public class Gene {
	/**
	 * 단순비교 방식의 유사도 측정 기능
	 * 
     * @param		inputData			String		입력데이터(유전자 문자열)
     * @return							int			유사도
	 */
	public int measureSimpleComparison(String inputData){
		int similarity = 0;
		//////////////////////여기부터 구현 (1) ---------------->
		String[] inputDataArr = inputData.split(",");
		String firstStr = inputDataArr[1];
		String secondStr = inputDataArr[0];		
		String[][] inputArr = getInputArr(firstStr, secondStr);
		int rowSize = firstStr.length() + secondStr.length() - 1;
		
		int iniSimilarity = 0;
		for(int index = 0; index < rowSize; index++){
			if(!inputArr[0][index].equals(" ") && !inputArr[1][index].equals(" ")){
				if(inputArr[0][index].equals(inputArr[1][index])){
					iniSimilarity++;
				}	
			}
		}
		if(similarity < iniSimilarity){
			similarity = iniSimilarity;
		}
		
		int firstStrLengthEnd = firstStr.length();
		for(int i = 0; i < rowSize - firstStr.length(); i++){
			for(int j = firstStrLengthEnd-1; j >= 0; j--){
				inputArr[0][j+1] =inputArr[0][j];
				if(j == 0){
					inputArr[0][j] = " ";
				}
			}
			firstStrLengthEnd++;
			int tmpSimilarity = 0;
			for(int index = 0; index < rowSize; index++){
				if(!inputArr[0][index].equals(" ") && !inputArr[1][index].equals(" ")){
					if(inputArr[0][index].equals(inputArr[1][index])){
						tmpSimilarity++;
					}	
				}
			}
			if(similarity < tmpSimilarity){
				similarity = tmpSimilarity;
			}
		}
		
		int secondStrLengthStart = rowSize - secondStr.length();
		for(int i = 0; i < rowSize - secondStr.length(); i++){
			for(int j = secondStrLengthStart; j < rowSize; j++){		
				inputArr[1][j-1] = inputArr[1][j];
				if(j == rowSize-1){
					inputArr[1][j] = " ";
				}
			}
			secondStrLengthStart--;
			int tmpSimilarity = 0;
			for(int index = 0; index < rowSize; index++){
				if(!inputArr[0][index].equals(" ") && !inputArr[1][index].equals(" ")){
					if(inputArr[0][index].equals(inputArr[1][index])){
						tmpSimilarity++;
					}	
				}
			}
			if(similarity < tmpSimilarity){
				similarity = tmpSimilarity;
			}
		}
		
		
		///////////////////////////// <-------------- 여기까지 구현 (1)
		return similarity;
	}
	
	/**
	 * 행렬비교 방식의 유사도 측정 기능
	 * 
     * @param		inputData				String		입력데이터(유전자 문자열)
     * @param		similarityMatrix		int[][]		입력데이터(유사도 측정 행렬)
     * @return								int			가장 큰 유사도
	 */
	public int measureSortComparison(String inputData, int[][] similarityMatrix){
		int maxSimilarity = 0;
		//////////////////////여기부터 구현 (2) ---------------->
		int tmpMax = Integer.MIN_VALUE;
		String[] inputDataArr = inputData.split(",");
		String firstStr = inputDataArr[1];
		String secondStr = inputDataArr[0];		
		String[][] inputArr = getInputArr(firstStr, secondStr);
		int rowSize = firstStr.length() + secondStr.length() - 1;
		
		int iniSimilarity = 0;
		for(int index = 0; index < rowSize; index++){
			int rowIndex = getIndexNum(inputArr[0][index]);
			int colIndex = getIndexNum(inputArr[1][index]);
			iniSimilarity += similarityMatrix[rowIndex][colIndex];
		}
		
		if(tmpMax < iniSimilarity){
			tmpMax = iniSimilarity;
		}
		int firstStrLengthEnd = firstStr.length();
		for(int i = 0; i < rowSize - firstStr.length(); i++){
			for(int j = firstStrLengthEnd-1; j >= 0; j--){
				inputArr[0][j+1] =inputArr[0][j];
				if(j == 0){
					inputArr[0][j] = " ";
				}
			}
			firstStrLengthEnd++;
			
			
			int tmpSimilarity = 0;
			for(int index = 0; index < rowSize; index++){
				int rowIndex = getIndexNum(inputArr[0][index]);
				int colIndex = getIndexNum(inputArr[1][index]);
				tmpSimilarity += similarityMatrix[rowIndex][colIndex];
			}
			if(tmpMax < tmpSimilarity){
				tmpMax = tmpSimilarity;
			}
		}
		
		int secondStrLengthStart = rowSize - secondStr.length();
		for(int i = 0; i < rowSize - secondStr.length(); i++){
			for(int j = secondStrLengthStart; j < rowSize; j++){		
				inputArr[1][j-1] = inputArr[1][j];
				if(j == rowSize-1){
					inputArr[1][j] = " ";
				}
			}
			secondStrLengthStart--;
			int tmpSimilarity = 0;
			for(int index = 0; index < rowSize; index++){
				int rowIndex = getIndexNum(inputArr[0][index]);
				int colIndex = getIndexNum(inputArr[1][index]);
				tmpSimilarity += similarityMatrix[rowIndex][colIndex];
			}
			if(tmpMax < tmpSimilarity){
				tmpMax = tmpSimilarity;
			}
		}
		
		maxSimilarity = tmpMax;
		///////////////////////////// <-------------- 여기까지 구현 (2)
		return maxSimilarity;
	}
	
	/**
	 * 입력문자열을 배열로 만드는 기능 (솔루션용 기능, 제공파일에 없음)
	 *
     * @param		firstStr			String				첫번째 문자열
     * @param		secondStr			String				두번째 문자열
     * @return							String[][]			배열
	 */
	public String[][] getInputArr(String firstStr, String secondStr){
		int rowSize = firstStr.length() + secondStr.length() - 1;
		String[][] inputArr = new String[2][rowSize];
		for(int i = 0; i < inputArr.length; i++){
			for(int j = 0; j < inputArr[i].length; j++){
				inputArr[i][j] = " ";
			}	
		}
		int index = 0;
		char[] chArr = firstStr.toCharArray();
		char[] chArr2 = secondStr.toCharArray();
		for(char c : chArr){
			inputArr[0][index] = String.valueOf(c);
			index++;
		}
		index = rowSize - secondStr.length();
		for(char c : chArr2){
			inputArr[1][index] = String.valueOf(c);
			index++;
		}
		return inputArr;
	}
	
	/**
	 * 인덱스를 가져오는 기능(솔루션용 기능, 제공파일에 없음)
	 *
     * @param		str			String		문자열
     * @return					int			인덱스
	 */
	public int getIndexNum(String str){
		int num = 0;
		if(str.equals("A")){
			num = 0;
		}else if(str.equals("C")){
			num = 1;
		}else if(str.equals("G")){
			num = 2;
		}else if(str.equals("T")){
			num = 3;
		}else if(str.equals(" ")){
			num = 4;
		}
		
		return num;
	}
}
