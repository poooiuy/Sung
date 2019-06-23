package com.lgcns.tct.check.test;

public class CheckRun {

    public static void main(String[] args) {    	
		// 제공 데이터 세트2를 실행하려면 loadData에서 제공 데이터 세트1을 주석 처리하고 제공 데이터 세트2를 주석 해제하여 실행
    	int inputData = loadData();
    	Check check = new Check();
    	printInput(inputData);
    	
    	// 체크수를 생성하는 기능
    	int checkNum = check.getCheckNum(inputData);
    	printCheckNum(checkNum);
    	
    	// 새로운 수를 생성하는 기능
    	int newNum = check.getNewNum(inputData, checkNum);
    	printNewNum(newNum);
    }

    private static int loadData() { 
    	
		//////////////////////////////////
		// 제공 데이터 세트 1
		/////////////////////////////////
    	
//    	int inputData = 37817;
    	
		//////////////////////////////////
		// 제공 데이터 세트 2
		/////////////////////////////////    	
    	int inputData = 98794;
    	return inputData;
	}
    
    private static void printInput(int inputData){
        printLineInitial();        
        System.out.println(inputData);
        printLine();
    }
    
    
    private static void printCheckNum(int checkNum) {   
    	System.out.print("[체크수]: ");
    	if(checkNum == 0){
    		System.out.println("결과값이 없습니다.");
    	}else{    		
    		System.out.println(checkNum);
    	}
    	printLine();      	
    } 
    
    private static void printNewNum(int newNum) {   
    	System.out.print("[새로운 수]: ");
    	if(newNum == 0){
    		System.out.println("결과값이 없습니다.");
    	}else{    		
    		System.out.println(newNum);
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

