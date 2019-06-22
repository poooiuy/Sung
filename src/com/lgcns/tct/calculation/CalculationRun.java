package com.lgcns.tct.calculation;

import java.util.List;

public class CalculationRun {

    public static void main(String[] args) {    	
		// ���� ������ ��Ʈ2�� �����Ϸ��� loadData���� ���� ������ ��Ʈ1�� �ּ� ó���ϰ� ���� ������ ��Ʈ2�� �ּ� �����Ͽ� ����
    	String inputData = loadData();
    	Calculation calculation = new Calculation();
    	printInput(inputData);
    	
    	// �� ���� ���� ū ������ �����ϴ� ���
    	List<String> sortedNumbers = calculation.sortNumbers(inputData);
    	printSortNumbers(sortedNumbers);
    	
    	// �� ���� �̿��Ͽ� ���ο� ���� �����ϴ� ���
    	int generatedNumber = calculation.generateNumber(sortedNumbers);
    	printGenerateNumber(generatedNumber);
    }

    private static String loadData() {
    	
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 1
		/////////////////////////////////
    	
    	String inputData = "132362689";
    	
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 2
		/////////////////////////////////    	
    	
    	//String inputData = "4217836";
    	
    	return inputData;
	}    
    
    private static void printInput(String inputData){
        printLineInitial();
        System.out.println("����: "+inputData);
        printLine();
    }
    
    private static void printSortNumbers(List<String> sortedNumbers) {   
    	System.out.print("[���ĵ� ����]: ");
    	if(sortedNumbers == null){
    		System.out.println("������� �����ϴ�.");
    	}else{    		
    		for(String numStr : sortedNumbers){
    			System.out.print(numStr + " ");
    		}
    		System.out.println();
    	}
    	printLine();    	
    } 
    
    private static void printGenerateNumber(int generatedNumber) {   
    	System.out.print("[������ ����]: ");
    	if(generatedNumber == 0){
    		System.out.println("������� �����ϴ�.");
    	}else{    	
    		System.out.println(generatedNumber);
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

