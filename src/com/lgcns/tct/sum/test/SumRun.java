package com.lgcns.tct.sum.test;

public class SumRun {

    public static void main(String[] args) {    	
		// ���� ������ ��Ʈ2�� �����Ϸ��� loadData���� ���� ������ ��Ʈ1�� �ּ� ó���ϰ� ���� ������ ��Ʈ2�� �ּ� �����Ͽ� ����
    	int[][] inputData = loadData();
    	Sum sum = new Sum();
    	printInput(inputData);
    	
    	// �迭�� �����ϴ� ���
    	int[][] sortedArray = sum.getSortedArray(inputData);
    	printSortedArray(sortedArray);
    	
    	// �迭���� ����ϴ� ���
    	int arrSum = sum.getArrSum(sortedArray);
    	printArrSum(arrSum);
    	
    }

    private static int[][] loadData() { 
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 1
		/////////////////////////////////
    	
    	int[][] inputData = {
    			{77, 78, 12, 30},
    			{33, 78, 9, 7},
    			{5, 71, 84, 25},
    			{9, 37, 0, 27}
    	};
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 2
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
    	System.out.println("[���ĵ� �迭]");
    	if(sortedArray == null){
    		System.out.println("������� �����ϴ�.");
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
    	System.out.print("[�迭��]: ");
    	if(arrSum == 0){
    		System.out.println("������� �����ϴ�.");
    	}else{
    		System.out.println(arrSum);
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

