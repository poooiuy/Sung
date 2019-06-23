package com.lgcns.tct.search.test;

import java.util.Arrays;
import java.util.List;

public class SearchRun {

    public static void main(String[] args) {    	
		// 제공 데이터 세트2를 실행하려면 loadData에서 제공 데이터 세트1을 주석 처리하고 제공 데이터 세트2를 주석 해제하여 실행
    	List<String> inputData = loadData();
    	Search search = new Search();
    	
    	// 유효한 검색어 목록을 추출하는 기능
    	List<String> validWordList = search.getValidWordList(inputData);
    	printValidWordList(inputData, validWordList);
    	
    	// 실시간 검색어 순위 1위를 계산하는 기능
    	String searchWord = search.getSearchWord(validWordList);
    	printSearchWord(validWordList, searchWord);
    }

    private static List<String> loadData() { 
    	
		//////////////////////////////////
		// 제공 데이터 세트 1
		/////////////////////////////////
    	
//    	List<String> inputData = Arrays.asList(
//    			"korea", "1korea", "worldcup", "worl2d", "WorldCUp", "WorldCup", "movie", "sunday3", "KOREA"
//		);
    	
		//////////////////////////////////
		// 제공 데이터 세트 2
		/////////////////////////////////    	
    
    	List<String> inputData = Arrays.asList(
    			"program", "WinDows10", "WINDOWS7", "PROgram", "JAVA", "Java6", "C", "test", "Team"
		);
    
    	return inputData;
	}
    
    private static void printValidWordList(List<String> inputData, List<String> validWordList) {   
    	System.out.print("[검색어 목록]: ");
    	for(String input : inputData){
    		System.out.print(input + " ");
    	}
    	System.out.println();
    	
    	System.out.print("[유효한 검색어 목록]: ");
    	if(validWordList == null){
    		System.out.println("결과값이 없습니다.");
    	}else{    		
    		for(String input : validWordList){
        		System.out.print(input + " ");
        	}
    		System.out.println();
    	}
    	printLine();      	
    } 
    
    private static void printSearchWord(List<String> validWordList, String searchWord) {   
    	System.out.print("[유효한 검색어 목록]: ");
    	if(validWordList == null){
    		System.out.println("입력값이 없습니다.");
    	}else{    		
    		for(String input : validWordList){
        		System.out.print(input + " ");
        	}
    		System.out.println();
    	}
    	
    	System.out.print("[실시간 검색어 순위 1위]: ");
    	if(searchWord.equals("")){
    		System.out.println("결과값이 없습니다.");
    	}else{    		
    		System.out.println(searchWord);
    	}
    	printLine();      	
    }  

    
	private static void printLine(){
		System.out.println("--------------------------------------------------------------------");
	}  
}

