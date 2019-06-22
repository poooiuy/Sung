package com.lgcns.tct.sequence;

import java.util.Arrays;
import java.util.List;

public class SequenceRun {

    public static void main(String[] args) {    	
		// ���� ������ ��Ʈ2�� �����Ϸ��� loadData���� ���� ������ ��Ʈ1�� �ּ� ó���ϰ� ���� ������ ��Ʈ2�� �ּ� �����Ͽ� ����
    	List<String> inputData = loadData();
    	Sequence sequence = new Sequence();
    	
    	// ���Ӽ� ��� �˻� ���
    	List<String> sequenceList = sequence.getSequenceList(inputData);
    	printsSquenceList(inputData, sequenceList);
    	
    	// ���� ū �� ���� ���
    	int maxNum = sequence.getMaxNum(sequenceList);
    	printMaxNum(sequenceList, maxNum);
    }

    private static List<String> loadData() { 
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 1
		/////////////////////////////////
    	
    	List<String> inputData = Arrays.asList(
    			"2234", "123", "5678", "456", "8978", "3321", "12", "345", "689"
		);
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 2
		/////////////////////////////////
    	
/*    	List<String> inputData = Arrays.asList(
    			"3425", "689", "456", "2345", "1254", "7754", "3255", "345"
		);
*/    	
    	return inputData;
	}
    
    private static void printsSquenceList(List<String> inputData, List<String> sequenceList) {   
    	System.out.println("[���Ӽ� ���] ");
    	System.out.print("�Է�: ");
    	for(String str : inputData){
    		System.out.print(str + " ");
    	}
    	System.out.println();
    	System.out.print("���: ");
    	if(sequenceList == null){
    		System.out.println("������� �����ϴ�.");
    	}else{    		
    		for(String str : sequenceList){
        		System.out.print(str + " ");
        	}
    		System.out.println();
    	}
    	printLine();      	
    } 
    
    private static void printMaxNum(List<String> sequenceList, int maxNum) {   
    	System.out.println("[���� ū ��] ");
    	System.out.print("�Է�: ");
    	if(sequenceList == null){
    		System.out.println("�Է°��� �����ϴ�.");
    	}else{    		
    		for(String str : sequenceList){
        		System.out.print(str + " ");
        	}
    		System.out.println();
    	}
    	System.out.print("���: ");
    	if(maxNum == 0){
    		System.out.println("������� �����ϴ�.");
    	}else{
    		System.out.println(maxNum);
    	}
    	printLine();      	
    } 

	private static void printLine(){
		System.out.println("--------------------------------------------------------------------");
	}  
}

