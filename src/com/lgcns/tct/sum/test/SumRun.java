package com.lgcns.tct.sum.test;

public class SumRun {

    public static void main(String[] args) {    	
		// 제공 데이터 세트2를 실행하려면 loadData에서 제공 데이터 세트1을 주석 처리하고 제공 데이터 세트2를 주석 해제하여 실행
    	int[][] inputData = loadData();
    	Sum sum = new Sum();
    	printInput(inputData);
    	
    	// 배열을 정렬하는 기능
    	int[][] sortedArray = sum.getSortedArray(inputData);
    	printSortedArray(sortedArray);
    	
    	// 배열합을 계산하는 기능
    	int arrSum = sum.getArrSum(sortedArray);
    	printArrSum(arrSum);
    	
    }

    private static int[][] loadData() { 
    	
		//////////////////////////////////
		// 제공 데이터 세트 1
		/////////////////////////////////
    	
    	int[][] inputData = {
    			{77, 78, 12, 30},
    			{33, 78, 9, 7},
    			{5, 71, 84, 25},
    			{9, 37, 0, 27}
    	};
    	
		//////////////////////////////////
		// 제공 데이터 세트 2
		/////////////////////////////////
    	
//    	int[][] inputData = {
//    			{11, 32, 57, 65, 34},
//			    {53, 16, 3, 93, 22},
//			    {35, 22, 73, 64, 14},
//			    {12, 24, 34, 45, 91},
//			    {9, 51, 35, 28, 75}
//    	};
    	
    	
    	return inputData;
	}
    
    private static void printInput(int[][] inputData){
        printLineInitial();
        int arraySize = inputData.length;
        for(int i = 0; i < arraySize; i++){
        	for(int j = 0; j < arraySize; j++){
            	System.out.print(inputData[i][j]+" ");
            }	
        	System.out.println();
        }
        printLine();
    }

    private static void printSortedArray(int[][] sortedArray) { 
    	System.out.println("[정렬된 배열]");
    	if(sortedArray == null){
    		System.out.println("결과값이 없습니다.");
    	}else{
    		int arraySize = sortedArray.length;
    		for(int i = 0; i < arraySize; i++){
            	for(int j = 0; j < arraySize; j++){
                	System.out.print(sortedArray[i][j]+" ");
                }	
            	System.out.println();
            }
    	}
    	printLine();      	
    } 
    
    private static void printArrSum(int arrSum) { 
    	System.out.print("[배열합]: ");
    	if(arrSum == 0){
    		System.out.println("결과값이 없습니다.");
    	}else{
    		System.out.println(arrSum);
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

