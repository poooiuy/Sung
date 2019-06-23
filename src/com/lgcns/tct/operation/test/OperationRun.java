package com.lgcns.tct.operation.test;

import java.util.List;

public class OperationRun {	
    public static void main(String[] args) {    	
		// ���� ������ ��Ʈ2�� �����Ϸ��� loadData���� ���� ������ ��Ʈ1�� �ּ� ó���ϰ� ���� ������ ��Ʈ2�� �ּ� �����Ͽ� ����
    	String inputData = loadData();
    	printInput(inputData);
    	Operation operation = new Operation();
    	
    	// ���ڿ� �и� ���
    	List<String> strList = operation.getStrList(inputData);
    	printStrList(strList);
    	
    	// ���ο� ���ڿ��� �����ϴ� ���
    	String newStr = operation.getNewStr(strList);
    	printNewStr(newStr);   	
    }

    private static String loadData() {

		//////////////////////////////////
		// ���� ������ ��Ʈ 1
		/////////////////////////////////    	
    	
//    	String inputData = "A37D2CB5E8F";
    	
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 2
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
    	System.out.print("[���ڷ� ������ ���ڿ�]: ");
    	if(strList == null){
    		System.out.println("������� �����ϴ�.");
    	}else{    		
    		System.out.println(strList.get(0));
    	}
    	System.out.print("[���ڷ� ������ ���ڿ�]: ");
    	if(strList == null){
    		System.out.println("������� �����ϴ�.");
    	}else{    		
    		System.out.println(strList.get(1));
    	}
    	
    	printLine();         	
    } 
    
    private static void printNewStr(String newStr) {   
    	System.out.print("[����� ������ ���ڿ�]: ");
    	if(newStr.equals("")){
    		System.out.println("������� �����ϴ�.");
    	}else{    		
    		System.out.println(newStr);
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

