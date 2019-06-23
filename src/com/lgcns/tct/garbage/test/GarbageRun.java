package com.lgcns.tct.garbage.test;


import java.util.List;

public class GarbageRun {

	
    public static void main(String[] args) {    	
		// 제공 데이터 세트2를 실행하려면 loadData에서 제공 데이터 세트1을 주석 처리하고 제공 데이터 세트2를 주석 해제하여 실행
    	String inputData=loadData();  
		printInput(inputData);	
    	Garbage garbage = new Garbage();
    	
    	// 가장 많이 수거된 재활용품의 종류 검색 기능
    	List<Character> nameList = garbage.getNameList(inputData);
    	printNameList(nameList);
    	
    	// 재활용품의 백분율 계산 기능
    	int ratio = garbage.getRatio(inputData);
    	printRatio(ratio);
    	    	 
    }

    private static String loadData() {
    	
		//////////////////////////////////
		// 제공 데이터 세트 1
		/////////////////////////////////
    	
    	String inputData = "3P4B2S4W5G2P4B2S1W4G6P5S2G4B7W2P3G8S1B6P2S";
    	
		//////////////////////////////////
		// 제공 데이터 세트 2
		/////////////////////////////////    	
    	
//    	String inputData = "4G5P2B2S7W4G3P2S2G8B3P6B7S4W2W2P5G8S4B7P6S";
    	
    	return inputData;
	}    
    
    private static void printInput(String inputData){
    	printLineInitial();    
    	System.out.println("[입력문자열]: "+inputData);
    	printLine();
    }
    
    private static void printNameList(List<Character> nameList) {       	
    	System.out.print("[가장 많이 수거된 재활용품]: ");       	    	
    	if(nameList == null){
    		System.out.println("결과값이 없습니다.");
    	}else{
    		for(char name : nameList){
    			if(name == 'P'){
    				System.out.print("플라스틱 ");
    			}else if(name == 'B'){
    				System.out.print("비닐 ");
    			}else if(name == 'S'){
    				System.out.print("스티로폼 ");
    			}else if(name == 'W'){
    				System.out.print("종이 ");
    			}
    		}
    		System.out.println();
    	}
    	printLine();    	
    }    
    
    private static void printRatio(int ratio) {       	
    	System.out.print("[재활용품의 백분율]: ");       	    	
    	if(ratio == 0){
    		System.out.println("결과값이 없습니다.");
    	}else{
    		System.out.println(ratio);
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

