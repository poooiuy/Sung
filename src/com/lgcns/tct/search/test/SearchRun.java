package com.lgcns.tct.search.test;

import java.util.Arrays;
import java.util.List;

public class SearchRun {

    public static void main(String[] args) {    	
		// ���� ������ ��Ʈ2�� �����Ϸ��� loadData���� ���� ������ ��Ʈ1�� �ּ� ó���ϰ� ���� ������ ��Ʈ2�� �ּ� �����Ͽ� ����
    	List<String> inputData = loadData();
    	Search search = new Search();
    	
    	// ��ȿ�� �˻��� ����� �����ϴ� ���
    	List<String> validWordList = search.getValidWordList(inputData);
    	printValidWordList(inputData, validWordList);
    	
    	// �ǽð� �˻��� ���� 1���� ����ϴ� ���
    	String searchWord = search.getSearchWord(validWordList);
    	printSearchWord(validWordList, searchWord);
    }

    private static List<String> loadData() { 
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 1
		/////////////////////////////////
    	
//    	List<String> inputData = Arrays.asList(
//    			"korea", "1korea", "worldcup", "worl2d", "WorldCUp", "WorldCup", "movie", "sunday3", "KOREA"
//		);
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 2
		/////////////////////////////////    	
    
    	List<String> inputData = Arrays.asList(
    			"program", "WinDows10", "WINDOWS7", "PROgram", "JAVA", "Java6", "C", "test", "Team"
		);
    
    	return inputData;
	}
    
    private static void printValidWordList(List<String> inputData, List<String> validWordList) {   
    	System.out.print("[�˻��� ���]: ");
    	for(String input : inputData){
    		System.out.print(input + " ");
    	}
    	System.out.println();
    	
    	System.out.print("[��ȿ�� �˻��� ���]: ");
    	if(validWordList == null){
    		System.out.println("������� �����ϴ�.");
    	}else{    		
    		for(String input : validWordList){
        		System.out.print(input + " ");
        	}
    		System.out.println();
    	}
    	printLine();      	
    } 
    
    private static void printSearchWord(List<String> validWordList, String searchWord) {   
    	System.out.print("[��ȿ�� �˻��� ���]: ");
    	if(validWordList == null){
    		System.out.println("�Է°��� �����ϴ�.");
    	}else{    		
    		for(String input : validWordList){
        		System.out.print(input + " ");
        	}
    		System.out.println();
    	}
    	
    	System.out.print("[�ǽð� �˻��� ���� 1��]: ");
    	if(searchWord.equals("")){
    		System.out.println("������� �����ϴ�.");
    	}else{    		
    		System.out.println(searchWord);
    	}
    	printLine();      	
    }  

    
	private static void printLine(){
		System.out.println("--------------------------------------------------------------------");
	}  
}

