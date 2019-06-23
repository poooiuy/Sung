package com.lgcns.tct.garbage.test;


import java.util.List;

public class GarbageRun {

	
    public static void main(String[] args) {    	
		// ���� ������ ��Ʈ2�� �����Ϸ��� loadData���� ���� ������ ��Ʈ1�� �ּ� ó���ϰ� ���� ������ ��Ʈ2�� �ּ� �����Ͽ� ����
    	String inputData=loadData();  
		printInput(inputData);	
    	Garbage garbage = new Garbage();
    	
    	// ���� ���� ���ŵ� ��Ȱ��ǰ�� ���� �˻� ���
    	List<Character> nameList = garbage.getNameList(inputData);
    	printNameList(nameList);
    	
    	// ��Ȱ��ǰ�� ����� ��� ���
    	int ratio = garbage.getRatio(inputData);
    	printRatio(ratio);
    	    	 
    }

    private static String loadData() {
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 1
		/////////////////////////////////
    	
    	String inputData = "3P4B2S4W5G2P4B2S1W4G6P5S2G4B7W2P3G8S1B6P2S";
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 2
		/////////////////////////////////    	
    	
//    	String inputData = "4G5P2B2S7W4G3P2S2G8B3P6B7S4W2W2P5G8S4B7P6S";
    	
    	return inputData;
	}    
    
    private static void printInput(String inputData){
    	printLineInitial();    
    	System.out.println("[�Է¹��ڿ�]: "+inputData);
    	printLine();
    }
    
    private static void printNameList(List<Character> nameList) {       	
    	System.out.print("[���� ���� ���ŵ� ��Ȱ��ǰ]: ");       	    	
    	if(nameList == null){
    		System.out.println("������� �����ϴ�.");
    	}else{
    		for(char name : nameList){
    			if(name == 'P'){
    				System.out.print("�ö�ƽ ");
    			}else if(name == 'B'){
    				System.out.print("��� ");
    			}else if(name == 'S'){
    				System.out.print("��Ƽ���� ");
    			}else if(name == 'W'){
    				System.out.print("���� ");
    			}
    		}
    		System.out.println();
    	}
    	printLine();    	
    }    
    
    private static void printRatio(int ratio) {       	
    	System.out.print("[��Ȱ��ǰ�� �����]: ");       	    	
    	if(ratio == 0){
    		System.out.println("������� �����ϴ�.");
    	}else{
    		System.out.println(ratio);
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

