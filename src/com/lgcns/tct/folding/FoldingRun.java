package com.lgcns.tct.folding;

public class FoldingRun {

    public static void main(String[] args) {    	
		// ���� ������ ��Ʈ2�� �����Ϸ��� loadData���� ���� ������ ��Ʈ1�� �ּ� ó���ϰ� ���� ������ ��Ʈ2�� �ּ� �����Ͽ� ����
    	int[][] inputData = loadData();
    	Folding folding = new Folding();
    	printInput(inputData);
    	
    	// �ʱ�迭�� �����ϴ� ���
    	int[][] iniArr = folding.getIniArr(inputData); 
    	printIniArr(iniArr);
    	
    	// �迭�� ���� �¿�� ���� ���
    	int[][] foldingArr = folding.getFoldingArr(iniArr);
    	printFoldingArr(foldingArr);
    	
    	// �����迭�� ���� ���ϴ� ���
    	int finalValue = folding.getFinalValue(foldingArr);
    	printFinalArr(finalValue);
    	
    }

    private static int[][] loadData() { 
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 1
		/////////////////////////////////
    	
    	int[][] inputData = {
    			{1, 2, 7, 5, 4, 3},
    		    {3, 6, 3, 3, 2, 4},
    		    {5, 2, 3, 4, 4, 6},
    		    {2, 4, 4, 5, 1, 3},
    		    {9, 1, 5, 8, 5, 2},
    		    {2, 2, 1, 4, 4, 5}
    	};
    	
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 2
		/////////////////////////////////

//    	int[][] inputData = {
//    			{5, 6, 1, 2, 5, 6, 7, 2},
//    		    {2, 2, 5, 7, 4, 1, 5, 6},
//    		    {9, 5, 8, 4, 1, 2, 6, 8},
//    		    {3, 5, 1, 4, 8, 7, 9, 8},
//    		    {6, 2, 1, 4, 5, 8, 7, 9},
//    		    {5, 4, 7, 8, 9, 7, 1, 2},
//    		    {1, 2, 5, 4, 7, 8, 9, 4},
//    		    {2, 4, 6, 8, 7, 8, 9, 1}
//    	};
    	
    	return inputData;
	}
    
    private static void printInput(int[][] inputData){
        printLineInitial();        
        int arrSize = inputData.length;
        for(int i = 0; i < arrSize; i++){
        	for(int j = 0; j < arrSize; j++){
            	System.out.print(inputData[i][j] + " ");
            }	
        	System.out.println();
        }
        printLine();
    }
    
    
    private static void printIniArr(int[][] iniArr) {   
    	System.out.println("[������ �ʱ� �迭]");
    	if(iniArr == null){
    		System.out.println("������� �����ϴ�.");
    	}else{    		
    		int arrSize = iniArr.length;
            for(int i = 0; i < arrSize; i++){
            	for(int j = 0; j < arrSize; j++){
                	System.out.print(iniArr[i][j] + " ");
                }	
            	System.out.println();
            }
    	}
    	printLine();      	
    } 
    
    private static void printFoldingArr(int[][] foldingArr) {   
    	System.out.println("[���� �¿�� ���� �迭]");
    	if(foldingArr == null){
    		System.out.println("������� �����ϴ�.");
    	}else{    		
    		int arrSize = foldingArr.length;
            for(int i = 0; i < arrSize; i++){
            	for(int j = 0; j < arrSize; j++){
                	System.out.print(foldingArr[i][j] + " ");
                }	
            	System.out.println();
            }
    	}
    	printLine();      	
    } 
    
    private static void printFinalArr(int finalValue) {   
    	System.out.print("[���� �迭�� ��]: ");
    	if(finalValue == 0){
    		System.out.println("������� �����ϴ�.");
    	}else{    		
    		System.out.println(finalValue);
    	}
    	printLine();      	
    } 

    
    private static void printLineInitial(){
    	System.out.println("[�ʱ� �Է� ������]");
    }
    
	private static void printLine(){
		System.out.println("--------------------------------------------------------------------");
	}  
}

