package com.lgcns.tct.pad.test;

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
		String[] inputArr = inputData.split("");
		for(int i=0; i<inputArr.length; i++) {
			
			if( i%2 == 0 && Integer.parseInt(inputArr[i]) != 0 ) {
				
				String text = inputArr[i+1];
				if( text.equals("U") || text.equals("D") || text.equals("L") || text.equals("R") ) {
					rotationStr += inputArr[i] + inputArr[i+1];
				}
				
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
		numberPad = inputNumberPad;
		String[] rStr = new String[rotationStr.length()/2];
		for(int i=0; i<rStr.length*2; i=i+2) {
			rStr[i/2] = rotationStr.substring(i, i+2);
		}
		
		for(String str : rStr) {
			numberPad = getMethod(numberPad, str);
		}

		
		///////////////////////////// <-------------- ������� ���� (2)
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