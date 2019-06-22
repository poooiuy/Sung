package com.lgcns.tct.check;


public class Check {
	
	
	/**
	 * üũ���� �����ϴ� ���
	 *
     * @param		inputData		int		�Էµ�����(����)
     * @return						int		üũ��
	 */
	public int getCheckNum(int inputData) {
		int checkNum = 0;
		////////////////////////������� ���� (1) ---------------->
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
		
		
		
		///////////////////////////// <-------------- ������� ���� (1)
			
		return checkNum;
	}
	
	
	/**
	 * ���ο� ���� �����ϴ� ���
	 *
     * @param		inputData		int			�Էµ�����(����)
     * @param		checkNum		int			üũ��
     * @return						int			���ο� ��
	 */
	public int getNewNum(int inputData, int checkNum) {
		int newNum = 0;
		////////////////////////������� ���� (2) ---------------->
		
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
		
		///////////////////////////// <-------------- ������� ���� (2)
		return newNum;
	}
	
}























