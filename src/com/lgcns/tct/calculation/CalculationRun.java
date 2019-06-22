package com.lgcns.tct.calculation;

import java.util.List;

public class CalculationRun {

    public static void main(String[] args) {    	
		// 제공 데이터 세트2를 실행하려면 loadData에서 제공 데이터 세트1을 주석 처리하고 제공 데이터 세트2를 주석 해제하여 실행
    	String inputData = loadData();
    	Calculation calculation = new Calculation();
    	printInput(inputData);
    	
    	// 세 수를 만들어서 큰 순서로 정렬하는 기능
    	List<String> sortedNumbers = calculation.sortNumbers(inputData);
    	printSortNumbers(sortedNumbers);
    	
    	// 세 수를 이용하여 새로운 수를 생성하는 기능
    	int generatedNumber = calculation.generateNumber(sortedNumbers);
    	printGenerateNumber(generatedNumber);
    }

    private static String loadData() {
    	
    	
		//////////////////////////////////
		// 제공 데이터 세트 1
		/////////////////////////////////
    	
    	String inputData = "132362689";
    	
    	
		//////////////////////////////////
		// 제공 데이터 세트 2
		/////////////////////////////////    	
    	
    	//String inputData = "4217836";
    	
    	return inputData;
	}    
    
    private static void printInput(String inputData){
        printLineInitial();
        System.out.println("숫자: "+inputData);
        printLine();
    }
    
    private static void printSortNumbers(List<String> sortedNumbers) {   
    	System.out.print("[정렬된 숫자]: ");
    	if(sortedNumbers == null){
    		System.out.println("결과값이 없습니다.");
    	}else{    		
    		for(String numStr : sortedNumbers){
    			System.out.print(numStr + " ");
    		}
    		System.out.println();
    	}
    	printLine();    	
    } 
    
    private static void printGenerateNumber(int generatedNumber) {   
    	System.out.print("[생성된 숫자]: ");
    	if(generatedNumber == 0){
    		System.out.println("결과값이 없습니다.");
    	}else{    	
    		System.out.println(generatedNumber);
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

