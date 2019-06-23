package com.lgcns.tct.statistic.test;

public class StatisticRun {

	
    public static void main(String[] args) {    	
		// ���� ������ ��Ʈ2�� �����Ϸ��� loadData���� ���� ������ ��Ʈ1�� �ּ� ó���ϰ� ���� ������ ��Ʈ2�� �ּ� �����Ͽ� ����
    	int[] inputData=loadData();  
		printInput(inputData);	
    	Statistic statistics = new Statistic();
    	
    	// ����Ƽ��� ���� ���� ���� �˻� ���
    	int maxYear = statistics.getMaxYear(inputData);
    	printMaxYear(maxYear);
    	
    	// ����� ���� ���� ũ�� ������ ���� �˻� ���
    	int maxDecreaseYear = statistics.getMaxDecreaseYear(inputData);
    	printMaxDecreaseYear(maxDecreaseYear);
    	    	 
    }

    private static int[] loadData() {
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 1
		/////////////////////////////////
    	
//    	int[] inputData = { //[0]:2010��, [1]:2011��, [2]:2012��, [3]:2013��, [4]:2014��, [5]:2015��, [6]:2016��   
//    		470200, 471300, 484600, 436500, 435400, 438400, 406200	
//    	};
    	
    	
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 2
		/////////////////////////////////    	
    	int[] inputData = { //[0]:2010��, [1]:2011��, [2]:2012��, [3]:2013��, [4]:2014��, [5]:2015��, [6]:2016��
        		654789, 659821, 557892, 324897, 578965, 621457, 521456	
    	};
    	
    	
    	return inputData;
	}    
    
    private static void printInput(int[] inputData){
    	printLineInitial();    
    	System.out.println("\t2010\t2011\t2012\t2013\t2014\t2015\t2016");
    	System.out.print("����Ƽ�\t");
    	for(int num : inputData){
    		System.out.print(num+"\t");	
    	}
    	System.out.println();
    	printLine();
    }
    
    private static void printMaxYear(int maxYear) {       	
    	System.out.print("[����� ���� ���� ���� ����]: ");       	    	
    	if(maxYear == 0){
    		System.out.println("������� �����ϴ�.");
    	}else{
    		System.out.println(maxYear);
    	}
    	printLine();    	
    }    
    
    private static void printMaxDecreaseYear(int maxDecreaseYear) {       	
    	System.out.print("[����� ���� ���� ũ�� ������ ����]: ");       	    	
    	if(maxDecreaseYear == 0){
    		System.out.println("������� �����ϴ�.");
    	}else{
    		System.out.println(maxDecreaseYear);
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

