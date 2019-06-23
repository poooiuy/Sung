package com.lgcns.tct.division.test;

public class DivisionRun {

	
    public static void main(String[] args) {    	
		// 제공 데이터 세트2를 실행하려면 loadData에서 제공 데이터 세트1을 주석 처리하고 제공 데이터 세트2를 주석 해제하여 실행
    	int inputData = loadData();
    	Division division = new Division();
    	
    	// 연산결과를 구하는 기능
    	int operationResult = division.getOperationResult(inputData);
    	printOperationResult(inputData, operationResult);
    	
    	// 중복을 제거한 수를 만드는 기능
    	int number = division.getNumber(operationResult);
    	printNumber(operationResult, number);
    	
    }

    private static int loadData() {
    	
    	
		//////////////////////////////////
		// 제공 데이터 세트 1
		/////////////////////////////////    	
    	
//    	int inputData = 3402822;
    	
    	
    	
    	
		//////////////////////////////////
		// 제공 데이터 세트 2
		/////////////////////////////////
    	
    	int inputData = 235283;
    	
    	return inputData;
	}
    
    private static void printOperationResult(int inputData, int operationResult) {   
    	System.out.println("[연산 결과]");
    	System.out.println("입력: "+inputData);
    	System.out.print("출력: ");
    	if(operationResult == 0){
    		System.out.println("결과값이 없습니다.");
    	}else{    		
    		System.out.println(operationResult);
    	}
    	printLine();         	
    } 
    
    private static void printNumber(int operationResult , int Number) {   
    	System.out.println("[중복을 제거한 수]");
    	System.out.print("입력: ");
    	if(operationResult == 0){
    		System.out.println("입력값이 없습니다.");
    	}else{    		
    		System.out.println(operationResult);
    	}
    	
    	System.out.print("출력: ");
    	if(Number == 0){
    		System.out.println("결과값이 없습니다.");
    	}else{    		
    		System.out.println(Number);
    	}
    	printLine();         	
    } 
    
	private static void printLine(){
		System.out.println("--------------------------------------------------------------------");
	}  
}

