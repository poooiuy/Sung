package com.lgcns.tct.check.test;

public class CheckRun {

    public static void main(String[] args) {    	
		// ���� ������ ��Ʈ2�� �����Ϸ��� loadData���� ���� ������ ��Ʈ1�� �ּ� ó���ϰ� ���� ������ ��Ʈ2�� �ּ� �����Ͽ� ����
    	int inputData = loadData();
    	Check check = new Check();
    	printInput(inputData);
    	
    	// üũ���� �����ϴ� ���
    	int checkNum = check.getCheckNum(inputData);
    	printCheckNum(checkNum);
    	
    	// ���ο� ���� �����ϴ� ���
    	int newNum = check.getNewNum(inputData, checkNum);
    	printNewNum(newNum);
    }

    private static int loadData() { 
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 1
		/////////////////////////////////
    	
//    	int inputData = 37817;
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 2
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
    	System.out.print("[üũ��]: ");
    	if(checkNum == 0){
    		System.out.println("������� �����ϴ�.");
    	}else{    		
    		System.out.println(checkNum);
    	}
    	printLine();      	
    } 
    
    private static void printNewNum(int newNum) {   
    	System.out.print("[���ο� ��]: ");
    	if(newNum == 0){
    		System.out.println("������� �����ϴ�.");
    	}else{    		
    		System.out.println(newNum);
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

