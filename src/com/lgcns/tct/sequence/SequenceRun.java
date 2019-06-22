package com.lgcns.tct.sequence;

import java.util.Arrays;
import java.util.List;

public class SequenceRun {

    public static void main(String[] args) {    	
		// 제공 데이터 세트2를 실행하려면 loadData에서 제공 데이터 세트1을 주석 처리하고 제공 데이터 세트2를 주석 해제하여 실행
    	List<String> inputData = loadData();
    	Sequence sequence = new Sequence();
    	
    	// 연속수 목록 검색 기능
    	List<String> sequenceList = sequence.getSequenceList(inputData);
    	printsSquenceList(inputData, sequenceList);
    	
    	// 가장 큰 수 생성 기능
    	int maxNum = sequence.getMaxNum(sequenceList);
    	printMaxNum(sequenceList, maxNum);
    }

    private static List<String> loadData() { 
    	
		//////////////////////////////////
		// 제공 데이터 세트 1
		/////////////////////////////////
    	
    	List<String> inputData = Arrays.asList(
    			"2234", "123", "5678", "456", "8978", "3321", "12", "345", "689"
		);
    	
		//////////////////////////////////
		// 제공 데이터 세트 2
		/////////////////////////////////
    	
/*    	List<String> inputData = Arrays.asList(
    			"3425", "689", "456", "2345", "1254", "7754", "3255", "345"
		);
*/    	
    	return inputData;
	}
    
    private static void printsSquenceList(List<String> inputData, List<String> sequenceList) {   
    	System.out.println("[연속수 목록] ");
    	System.out.print("입력: ");
    	for(String str : inputData){
    		System.out.print(str + " ");
    	}
    	System.out.println();
    	System.out.print("출력: ");
    	if(sequenceList == null){
    		System.out.println("결과값이 없습니다.");
    	}else{    		
    		for(String str : sequenceList){
        		System.out.print(str + " ");
        	}
    		System.out.println();
    	}
    	printLine();      	
    } 
    
    private static void printMaxNum(List<String> sequenceList, int maxNum) {   
    	System.out.println("[가장 큰 수] ");
    	System.out.print("입력: ");
    	if(sequenceList == null){
    		System.out.println("입력값이 없습니다.");
    	}else{    		
    		for(String str : sequenceList){
        		System.out.print(str + " ");
        	}
    		System.out.println();
    	}
    	System.out.print("출력: ");
    	if(maxNum == 0){
    		System.out.println("결과값이 없습니다.");
    	}else{
    		System.out.println(maxNum);
    	}
    	printLine();      	
    } 

	private static void printLine(){
		System.out.println("--------------------------------------------------------------------");
	}  
}

