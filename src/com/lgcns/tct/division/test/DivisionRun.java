package com.lgcns.tct.division.test;

public class DivisionRun {

	
    public static void main(String[] args) {    	
		// ���� ������ ��Ʈ2�� �����Ϸ��� loadData���� ���� ������ ��Ʈ1�� �ּ� ó���ϰ� ���� ������ ��Ʈ2�� �ּ� �����Ͽ� ����
    	int inputData = loadData();
    	Division division = new Division();
    	
    	// �������� ���ϴ� ���
    	int operationResult = division.getOperationResult(inputData);
    	printOperationResult(inputData, operationResult);
    	
    	// �ߺ��� ������ ���� ����� ���
    	int number = division.getNumber(operationResult);
    	printNumber(operationResult, number);
    	
    }

    private static int loadData() {
    	
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 1
		/////////////////////////////////    	
    	
//    	int inputData = 3402822;
    	
    	
    	
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 2
		/////////////////////////////////
    	
    	int inputData = 235283;
    	
    	return inputData;
	}
    
    private static void printOperationResult(int inputData, int operationResult) {   
    	System.out.println("[���� ���]");
    	System.out.println("�Է�: "+inputData);
    	System.out.print("���: ");
    	if(operationResult == 0){
    		System.out.println("������� �����ϴ�.");
    	}else{    		
    		System.out.println(operationResult);
    	}
    	printLine();         	
    } 
    
    private static void printNumber(int operationResult , int Number) {   
    	System.out.println("[�ߺ��� ������ ��]");
    	System.out.print("�Է�: ");
    	if(operationResult == 0){
    		System.out.println("�Է°��� �����ϴ�.");
    	}else{    		
    		System.out.println(operationResult);
    	}
    	
    	System.out.print("���: ");
    	if(Number == 0){
    		System.out.println("������� �����ϴ�.");
    	}else{    		
    		System.out.println(Number);
    	}
    	printLine();         	
    } 
    
	private static void printLine(){
		System.out.println("--------------------------------------------------------------------");
	}  
}

