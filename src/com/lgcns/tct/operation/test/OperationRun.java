package com.lgcns.tct.operation.test;

import java.util.List;

public class OperationRun {	
    public static void main(String[] args) {    	
		// 제공 데이터 세트2를 실행하려면 loadData에서 제공 데이터 세트1을 주석 처리하고 제공 데이터 세트2를 주석 해제하여 실행
    	String inputData = loadData();
    	printInput(inputData);
    	Operation operation = new Operation();
    	
    	// 문자열 분리 기능
    	List<String> strList = operation.getStrList(inputData);
    	printStrList(strList);
    	
    	// 새로운 문자열을 생성하는 기능
    	String newStr = operation.getNewStr(strList);
    	printNewStr(newStr);   	
    }

    private static String loadData() {

		//////////////////////////////////
		// 제공 데이터 세트 1
		/////////////////////////////////    	
    	
//    	String inputData = "A37D2CB5E8F";
    	
    	
		//////////////////////////////////
		// 제공 데이터 세트 2
		/////////////////////////////////
    	
    	String inputData = "F7T123GCZ5Q";
    	
    	return inputData;
	}
    
    private static void printInput(String inputData){
        printLineInitial();
        System.out.println(inputData);
        printLine();
    }
    
    private static void printStrList(List<String> strList) {   
    	System.out.print("[문자로 구성된 문자열]: ");
    	if(strList == null){
    		System.out.println("결과값이 없습니다.");
    	}else{    		
    		System.out.println(strList.get(0));
    	}
    	System.out.print("[숫자로 구성된 문자열]: ");
    	if(strList == null){
    		System.out.println("결과값이 없습니다.");
    	}else{    		
    		System.out.println(strList.get(1));
    	}
    	
    	printLine();         	
    } 
    
    private static void printNewStr(String newStr) {   
    	System.out.print("[결과로 생성된 문자열]: ");
    	if(newStr.equals("")){
    		System.out.println("결과값이 없습니다.");
    	}else{    		
    		System.out.println(newStr);
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

