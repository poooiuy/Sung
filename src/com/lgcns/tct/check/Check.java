package com.lgcns.tct.check;


public class Check {
	
	
	/**
	 * 체크수를 생성하는 기능
	 *
     * @param		inputData		int		입력데이터(숫자)
     * @return						int		체크수
	 */
	public int getCheckNum(int inputData) {
		int checkNum = 0;
		////////////////////////여기부터 구현 (1) ---------------->
		String input = ""+inputData;
		int num = input.length();
		for(int i=0; i<num; i++){
			checkNum += Character.getNumericValue(input.charAt(i)) * (num-i);
		}
		
		if(checkNum % num == 0){
			checkNum = checkNum/num;
		}else{
			checkNum = checkNum % num;
		}
		
		
		
		///////////////////////////// <-------------- 여기까지 구현 (1)
			
		return checkNum;
	}
	
	
	/**
	 * 새로운 수를 생성하는 기능
	 *
     * @param		inputData		int			입력데이터(숫자)
     * @param		checkNum		int			체크수
     * @return						int			새로운 수
	 */
	public int getNewNum(int inputData, int checkNum) {
		int newNum = 0;
		////////////////////////여기부터 구현 (2) ---------------->
		
		String strTmp = ""+inputData;
		String checkStr = ""+checkNum;
		int strCnt = checkStr.length();
		
		if(strCnt > 1){
			if(checkStr.charAt(0) > checkStr.charAt(1)){
				strTmp = checkStr.charAt(0)+strTmp+checkStr.charAt(1);
				
			}else if(checkStr.charAt(0) < checkStr.charAt(1)){
				strTmp = checkStr.charAt(1)+strTmp+checkStr.charAt(0);
			}else{
				strTmp = checkStr.charAt(0)+strTmp+checkStr.charAt(0);
			}
			
			
		}else{
			strTmp = strTmp+checkNum;
		}
		
		
		newNum = Integer.parseInt(strTmp); 
		
		///////////////////////////// <-------------- 여기까지 구현 (2)
		return newNum;
	}
	
}























