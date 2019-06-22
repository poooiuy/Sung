package com.lgcns.tct.elevator;

import java.util.Arrays;
import java.util.List;

public class ElevatorRun {
	
	public static List<ElevatorInfo> elevatorInfoList;

    public static void main(String[] args) {    	
		// 제공 데이터 세트2를 실행하려면 loadData에서 제공 데이터 세트1을 주석 처리하고 제공 데이터 세트2를 주석 해제하여 실행
    	String inputData = loadData();
    	printInput(inputData);
    	Elevator elevator = new Elevator();
    	
    	// 사용 전력량을 계산하는 기능
    	int power = elevator.calculatePower(inputData);
    	printPower(power);
    	
    	
    	// 사용 전력량을 기준으로 내림차순 정렬하는 기능
    	List<ElevatorInfo> powerList = elevator.sortDescending(elevatorInfoList);
    	printPowerList(powerList);
    	
    }

    private static String loadData() {
    	
    	
		//////////////////////////////////
		// 제공 데이터 세트 1
		/////////////////////////////////
    	
    	String inputData = "1,7,4,B1,B4,10,7,B2,3,1,B4,B1,9,1";
    	elevatorInfoList = Arrays.asList(
			new ElevatorInfo("E1", "1,7,4,B1,B4,10,7,B2,3,1,B4,B1,9,1"),
			new ElevatorInfo("E2", "1,2,7,4,B3,7,B2,2,6,B1,9,8,B1,9"),
			new ElevatorInfo("E3", "1,3,4,B1,B4,11,7,B4,B2,1,B4,B1,8,2"),
			new ElevatorInfo("E4", "1,3,9,B1,B3,7,1,B4,8,1,B4,6,8,9")
		);
    	
		//////////////////////////////////
		// 제공 데이터 세트 2
		/////////////////////////////////    	
    	
    	
/*    	String inputData = "9,7,B2,B1,B4,7,10,9,B1,10,B2,B1,9,B2";
    	elevatorInfoList = Arrays.asList(
			new ElevatorInfo("E1", "9,7,B2,B1,B4,7,10,9,B1,10,B2,B1,9,B2"),
			new ElevatorInfo("E2", "B1,6,B1,6,B3,6,B1,1,B3,10,B2,8,B1,9"),
			new ElevatorInfo("E3", "7,3,4,B1,B2,3,2,1,B4,1,B4,B3,4,3"),
			new ElevatorInfo("E4", "B3,5,9,B3,B1,B2,3,B3,B2,10,B4,1,B2,9")
		);
*/    	
    	
    	return inputData;
	}    
    
  
    private static void printInput(String inputData){
        printLineInitial();
        System.out.println("운행정보: "+inputData);
        printLine();
    }
    
   
    
    private static void printPower(int power) {   
    	System.out.print("[사용 전력량]: ");
    	if(power == 0){
    		System.out.println("결과값이 없습니다.");
    	}else{    		
    		System.out.println(power);
    	}
    	printLine();    	
    } 

    private static void printPowerList(List<ElevatorInfo> powerList) {   
    	System.out.println("[정렬된 사용 전력량]: ");
    	if(powerList == null){
    		System.out.println("결과값이 없습니다.");
    	}else{    		
    		for(int i = 0 ; i < powerList.size(); i++){
    			System.out.print(powerList.get(i).getName()+"("+powerList.get(i).getPower()+") ");
    		}
    		System.out.println();
    	}
    	printLine();    	
    } 
    
    private static void printLineInitial(){
    	System.out.println("[초기 입력 데이터]");
    }
    
	private static void printLine(){
		System.out.println("--------------------------------------------------------------------");
	}	
	
	
	   
}

