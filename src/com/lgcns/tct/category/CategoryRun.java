package com.lgcns.tct.category;

import java.util.Arrays;
import java.util.List;


public class CategoryRun {
	
	public static List<String> categories;
	public static String categoryStr;
	
    public static void main(String[] args) {    	
		// 제공 데이터 세트2를 실행하려면 loadData에서 제공 데이터 세트1을 주석 처리하고 제공 데이터 세트2를 주석 해제하여 실행
    	String[][] inputData = loadData();  
    	printInput(inputData);
    	Category category = new Category();
    	
    	// 상위 카테고리를 검색하는 기능
    	String topCategory = category.getTopCategory(inputData, categories);
    	printTopCategory(topCategory);
    	
    	// 하위 카테고리의 개수를 계산하는 기능
    	int numberOfSubcategories = category.getNumberOfSubcategories(inputData, categoryStr);
    	printNumberOfSubcategories(numberOfSubcategories);
    }

    private static String[][] loadData() {
    	
		//////////////////////////////////
		// 제공 데이터 세트 1
		/////////////////////////////////
    	
//    	String[][] inputData = {
//    			{"M","B"},
//    			{"M","C"},
//    			{"M","K"},
//    			{"B","E"},
//    			{"C","F"},
//    			{"C","G"},
//    			{"C","H"},
//    			{"K","I"},
//    			{"K","J"},
//    			{"E","D"},
//    			{"F","L"},
//    			{"F","A"},
//    			{"H","N"},
//    			{"H","O"},
//    			{"J","P"},
//    			{"J","Q"}
//		};
//    	
//    	categories = Arrays.asList(
//    			"F", "N"
//		);
//    	categoryStr = "J";
    	
    	
		//////////////////////////////////
		// 제공 데이터 세트 2
		/////////////////////////////////    	
    	    	
    	String[][] inputData = {
			{"Z","B"},
			{"Z","W"},
			{"Z","V"},
			{"B","E"},
			{"W","F"},
			{"W","G"},
			{"V","H"},
			{"V","I"},
			{"V","J"},
			{"E","K"},
			{"F","L"},
			{"G","M"},
			{"G","N"},
			{"H","O"},
			{"I","P"},
			{"J","Q"}
   		};
       	
       	categories = Arrays.asList(
       			"I", "O"
   		);
       	categoryStr = "G";
    	
    	return inputData;
    	
	}    


    private static void printInput(String[][] inputData){
        printLineInitial();
        System.out.println("상위 카테고리\t하위 카테고리");
        for(String[] strArr : inputData){
        	for(String str : strArr){
            	System.out.print(str+"\t\t");
            }	
        	System.out.println();
        }
        printLine();
    }
    
    private static void printTopCategory(String topCategory) {       	
    	System.out.print("[입력으로 제공되는 두 개의 카테고리]: ");
    	for(String category : categories){
    		System.out.print(category+" ");
    	}
    	System.out.println();
    	System.out.print("[두 개의 카테고리를 포함하는 상위 카테고리 중 최하위 카테고리]: ");
    	if(topCategory == ""){
    		System.out.println("결과값이 없습니다.");
    	}else{
    		System.out.println(topCategory);
    	}
    	printLine();    	
    } 

    
    private static void printNumberOfSubcategories(int numberOfSubcategories) {  
    	System.out.println("[입력으로 제공되는 카테고리]: "+categoryStr);
    	System.out.print("[하위 카테고리의 개수]: ");
    	if(numberOfSubcategories == 0){
    		System.out.println("결과값이 없습니다.");
    	}else{
    		System.out.println(numberOfSubcategories);
    	}
    	printLine();    	
    } 
    
    
	private static void printLine(){
		System.out.println("------------------------------------------------------------");
	}	
	
	private static void printLineInitial(){
    	System.out.println("[초기 입력 데이터]");
    }
    
    
}

