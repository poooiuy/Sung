package com.lgcns.tct.category;

import java.util.Arrays;
import java.util.List;


public class CategoryRun {
	
	public static List<String> categories;
	public static String categoryStr;
	
    public static void main(String[] args) {    	
		// ���� ������ ��Ʈ2�� �����Ϸ��� loadData���� ���� ������ ��Ʈ1�� �ּ� ó���ϰ� ���� ������ ��Ʈ2�� �ּ� �����Ͽ� ����
    	String[][] inputData = loadData();  
    	printInput(inputData);
    	Category category = new Category();
    	
    	// ���� ī�װ��� �˻��ϴ� ���
    	String topCategory = category.getTopCategory(inputData, categories);
    	printTopCategory(topCategory);
    	
    	// ���� ī�װ��� ������ ����ϴ� ���
    	int numberOfSubcategories = category.getNumberOfSubcategories(inputData, categoryStr);
    	printNumberOfSubcategories(numberOfSubcategories);
    }

    private static String[][] loadData() {
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 1
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
		// ���� ������ ��Ʈ 2
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
        System.out.println("���� ī�װ�\t���� ī�װ�");
        for(String[] strArr : inputData){
        	for(String str : strArr){
            	System.out.print(str+"\t\t");
            }	
        	System.out.println();
        }
        printLine();
    }
    
    private static void printTopCategory(String topCategory) {       	
    	System.out.print("[�Է����� �����Ǵ� �� ���� ī�װ�]: ");
    	for(String category : categories){
    		System.out.print(category+" ");
    	}
    	System.out.println();
    	System.out.print("[�� ���� ī�װ��� �����ϴ� ���� ī�װ� �� ������ ī�װ�]: ");
    	if(topCategory == ""){
    		System.out.println("������� �����ϴ�.");
    	}else{
    		System.out.println(topCategory);
    	}
    	printLine();    	
    } 

    
    private static void printNumberOfSubcategories(int numberOfSubcategories) {  
    	System.out.println("[�Է����� �����Ǵ� ī�װ�]: "+categoryStr);
    	System.out.print("[���� ī�װ��� ����]: ");
    	if(numberOfSubcategories == 0){
    		System.out.println("������� �����ϴ�.");
    	}else{
    		System.out.println(numberOfSubcategories);
    	}
    	printLine();    	
    } 
    
    
	private static void printLine(){
		System.out.println("------------------------------------------------------------");
	}	
	
	private static void printLineInitial(){
    	System.out.println("[�ʱ� �Է� ������]");
    }
    
    
}

