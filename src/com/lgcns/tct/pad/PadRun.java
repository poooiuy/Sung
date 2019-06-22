package com.lgcns.tct.pad;

public class PadRun {

	public static int[][] inputNumberPad;
	
    public static void main(String[] args) {    	
		// ���� ������ ��Ʈ2�� �����Ϸ��� loadData���� ���� ������ ��Ʈ1�� �ּ� ó���ϰ� ���� ������ ��Ʈ2�� �ּ� �����Ͽ� ����
    	String inputData = loadData();  
    	Pad pad = new Pad();
    	
    	// �̵����ڿ��� �����ϴ� ���
    	String rotationStr = pad.getRotationStr(inputData);
    	printRotationStr(inputData, rotationStr);
    	
    	// �����е带 �̵���Ű�� ���
    	int[][] numberPad = pad.getNumberPad(inputNumberPad, rotationStr);
    	printNumberPad(rotationStr, numberPad);
    	    	 
    }

    private static String loadData() {
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 1
		/////////////////////////////////
    	
    	inputNumberPad = new int[][]{
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12},
			{13, 14, 15, 16}
    	};
    	String inputData = "3X1U4D2R6T2K1L2D5B0L";
    	
    	
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 2
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
    	System.out.println("[�Է¹��ڿ�]: "+inputData);  
    	
    	System.out.print("[�����е带 �̵���Ű�� ������ ������� ������ ���ڿ�]: ");       	    	
    	if(rotationStr == ""){
    		System.out.println("������� �����ϴ�.");
    	}else{
    		System.out.println(rotationStr);
    	}
    	printLine();    	
    }    
    
    private static void printNumberPad(String rotationStr, int[][] numberPad) {      
    	System.out.print("[�����е带 �̵���Ű�� ������ ������� ������ ���ڿ�]: ");       	    	
    	if(rotationStr == ""){
    		System.out.println("�Է°��� �����ϴ�.");
    	}else{
    		System.out.println(rotationStr);
    	}
    	int arrSize = inputNumberPad.length;
    	System.out.println("[�Է����� ������ "+arrSize+"x"+arrSize+" �����е�]");
    	for(int i = 0; i < arrSize; i++){
    		for(int j = 0; j < arrSize; j++){
    			System.out.print(inputNumberPad[i][j]+" ");
        	}	
    		System.out.println();
    	}
    	System.out.println();
    	System.out.println("[�̵��� �����е�]");
    	if(numberPad == null){
    		System.out.println("������� �����ϴ�.");
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

