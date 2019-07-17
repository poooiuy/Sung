package com.lgcns.tct.pad.test;

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
		String[] inputArr = inputData.split("");
		for(int i=0; i<inputArr.length; i++) {
			
			if( i%2 == 0 && Integer.parseInt(inputArr[i]) != 0 ) {
				
				String text = inputArr[i+1];
				if( text.equals("U") || text.equals("D") || text.equals("L") || text.equals("R") ) {
					rotationStr += inputArr[i] + inputArr[i+1];
				}
				
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
		numberPad = inputNumberPad;
		String[] rStr = new String[rotationStr.length()/2];
		for(int i=0; i<rStr.length*2; i=i+2) {
			rStr[i/2] = rotationStr.substring(i, i+2);
		}
		
		for(String str : rStr) {
			numberPad = getMethod(numberPad, str);
		}

		
		///////////////////////////// <-------------- 여기까지 구현 (2)
		return numberPad;
	}
	
	public int[][] getMethod(int[][] inputNumberPad, String rotationStr){
		
		int[][] pad = null;
		
		System.out.println(inputNumberPad.length);
		
		int count = Integer.parseInt(rotationStr.charAt(0)+"");
		String cmd = rotationStr.charAt(1)+"";
		
		for(int i=0; i<count; i++) {
			
			int[][] tmp = null;
			
			switch(cmd) {
			case "U" :
				
				break;
			case "D" :
				break;
			case "L" :
				break;
			case "R" :
				break;
			}
			pad = tmp;
		}
		
		return pad;
		
	}
	



}