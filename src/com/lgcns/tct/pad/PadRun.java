package com.lgcns.tct.pad;

public class PadRun {

	public static int[][] inputNumberPad;
	
    public static void main(String[] args) {    	
		// 제공 데이터 세트2를 실행하려면 loadData에서 제공 데이터 세트1을 주석 처리하고 제공 데이터 세트2를 주석 해제하여 실행
    	String inputData = loadData();  
    	Pad pad = new Pad();
    	
    	// 이동문자열을 추출하는 기능
    	String rotationStr = pad.getRotationStr(inputData);
    	printRotationStr(inputData, rotationStr);
    	
    	// 숫자패드를 이동시키는 기능
    	int[][] numberPad = pad.getNumberPad(inputNumberPad, rotationStr);
    	printNumberPad(rotationStr, numberPad);
    	    	 
    }

    private static String loadData() {
    	
		//////////////////////////////////
		// 제공 데이터 세트 1
		/////////////////////////////////
    	
    	inputNumberPad = new int[][]{
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12},
			{13, 14, 15, 16}
    	};
    	String inputData = "3X1U4D2R6T2K1L2D5B0L";
    	
    	
    	
		//////////////////////////////////
		// 제공 데이터 세트 2
		/////////////////////////////////    	
    	
/*    	inputNumberPad = new int[][]{
    		{1, 2, 3, 4, 5},
			{6, 7, 8, 9, 10},
			{11, 12, 13, 14, 15},
			{16, 17, 18, 19, 20},
			{21, 22, 23, 24, 25}
		};		
		String inputData = "0R1B2D3D5L7R1U2F3U";
*/    	
    	
    	return inputData;
	}   
    
    private static void printRotationStr(String inputData, String rotationStr) {
    	System.out.println("[입력문자열]: "+inputData);  
    	
    	System.out.print("[숫자패드를 이동시키는 정보를 순서대로 추출한 문자열]: ");       	    	
    	if(rotationStr == ""){
    		System.out.println("결과값이 없습니다.");
    	}else{
    		System.out.println(rotationStr);
    	}
    	printLine();    	
    }    
    
    private static void printNumberPad(String rotationStr, int[][] numberPad) {      
    	System.out.print("[숫자패드를 이동시키는 정보를 순서대로 추출한 문자열]: ");       	    	
    	if(rotationStr == ""){
    		System.out.println("입력값이 없습니다.");
    	}else{
    		System.out.println(rotationStr);
    	}
    	int arrSize = inputNumberPad.length;
    	System.out.println("[입력으로 제공된 "+arrSize+"x"+arrSize+" 숫자패드]");
    	for(int i = 0; i < arrSize; i++){
    		for(int j = 0; j < arrSize; j++){
    			System.out.print(inputNumberPad[i][j]+" ");
        	}	
    		System.out.println();
    	}
    	System.out.println();
    	System.out.println("[이동된 숫자패드]");
    	if(numberPad == null){
    		System.out.println("결과값이 없습니다.");
    	}else{
    		for(int i = 0; i < arrSize; i++){
        		for(int j = 0; j < arrSize; j++){
        			System.out.print(numberPad[i][j]+" ");
            	}	
        		System.out.println();
        	}
    	}
    	printLine();    	
    }

    private static void printLine(){
		System.out.println("------------------------------------------------------------");
	}	
}

