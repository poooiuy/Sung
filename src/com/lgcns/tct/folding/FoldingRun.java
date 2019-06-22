package com.lgcns.tct.folding;

public class FoldingRun {

    public static void main(String[] args) {    	
		// 제공 데이터 세트2를 실행하려면 loadData에서 제공 데이터 세트1을 주석 처리하고 제공 데이터 세트2를 주석 해제하여 실행
    	int[][] inputData = loadData();
    	Folding folding = new Folding();
    	printInput(inputData);
    	
    	// 초기배열을 생성하는 기능
    	int[][] iniArr = folding.getIniArr(inputData); 
    	printIniArr(iniArr);
    	
    	// 배열을 상하 좌우로 접는 기능
    	int[][] foldingArr = folding.getFoldingArr(iniArr);
    	printFoldingArr(foldingArr);
    	
    	// 최종배열의 값을 구하는 기능
    	int finalValue = folding.getFinalValue(foldingArr);
    	printFinalArr(finalValue);
    	
    }

    private static int[][] loadData() { 
    	
		//////////////////////////////////
		// 제공 데이터 세트 1
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
		// 제공 데이터 세트 2
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
    	System.out.println("[생성된 초기 배열]");
    	if(iniArr == null){
    		System.out.println("결과값이 없습니다.");
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
    	System.out.println("[상하 좌우로 접힌 배열]");
    	if(foldingArr == null){
    		System.out.println("결과값이 없습니다.");
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
    	System.out.print("[최종 배열의 값]: ");
    	if(finalValue == 0){
    		System.out.println("결과값이 없습니다.");
    	}else{    		
    		System.out.println(finalValue);
    	}
    	printLine();      	
    } 

    
    private static void printLineInitial(){
    	System.out.println("[초기 입력 데이터]");
    }
    
	private static void printLine(){
		System.out.println("--------------------------------------------------------------------");
	}  
}

