package com.lgcns.tct.aggregate;

public class AggregateRun {

    public static void main(String[] args) {    	
		// 제공 데이터 세트2를 실행하려면 loadData에서 제공 데이터 세트1을 주석 처리하고 제공 데이터 세트2를 주석 해제하여 실행
    	int[][] inputData = loadData();
    	printInput(inputData);
    	Aggregate aggregate = new Aggregate();
    	
    	// 부분 배열의 개수를 구하는 기능
    	int numberOfSubArrays = aggregate.getNumberOfSubArrays(inputData.length);
    	printNumberOfSubArrays(inputData.length, numberOfSubArrays);
    	
    	// 최대값을 찾는 기능
    	int maximumValue = aggregate.getMaximumValue(inputData);
    	printMaximumValue(inputData.length, maximumValue);
    }

    private static int[][] loadData() {
    	
    	
		//////////////////////////////////
		// 제공 데이터 세트 1
		/////////////////////////////////
    	
    	int[][] inputData =  {
    			{-1, 0, 7, 9},
    			{-6, 2, -3, 5},
    			{3, -6, 0, -5},
    			{7, 8, -7, 2}
    	};
    	
		//////////////////////////////////
		// 제공 데이터 세트 2
		/////////////////////////////////
    	  	
//    	int[][] inputData =  {
//    			{1, -3, 0, 2, 5},
//    			{-3, 0, 8, -3, 7},
//    			{9, -1, -2, 6, 0},
//    			{-2, -5, 9, 7, 6},
//    			{3, 2, 4, 7, -5}
//    	};
    	
    	return inputData;
	}    
    
    private static void printInput(int[][] inputData){
        printLineInitial();        
        for(int i = 0 ; i < inputData.length; i++){
        	for(int j = 0 ; j < inputData.length; j++){
            	System.out.print(inputData[i][j]+" ");
            }
        	System.out.println();
        }
        printLine();
    }
    
    private static void printNumberOfSubArrays(int size, int numberOfSubArrays) {   
    	System.out.print("["+size+"x"+size+"배열의 부분 배열 개수]: ");
    	if(numberOfSubArrays == 0){
    		System.out.println("결과값이 없습니다.");
    	}else{    		
    		System.out.println(numberOfSubArrays+"개");
    	}
    	printLine();    	
    } 
    
    private static void printMaximumValue(int size, int maximumValue) {   
    	System.out.print("["+size+"x"+size+"배열의 부분 배열내의 최대합]: ");
    	if(maximumValue == 0){
    		System.out.println("결과값이 없습니다.");
    	}else{    		
    		System.out.println(maximumValue);
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

