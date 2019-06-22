package com.lgcns.tct.parking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ParkingRun {

    public static void main(String[] args) {    	
		// 제공 데이터 세트2를 실행하려면 loadData에서 제공 데이터 세트1을 주석 처리하고 제공 데이터 세트2를 주석 해제하여 실행
    	List<ParkingInfo> inputData = loadData();
    	Parking parking = new Parking();
    	printInput(inputData);
    	
    	// 차종별 주차대수 계산 기능
    	HashMap<Integer, Integer> numberOfCars = parking.getNumberOfCars(inputData);
    	printNumberOfCars(numberOfCars);
    	
    	// 주차요금 합계 계산 기능
    	int parkingfee = parking.getParkingFee(inputData);
    	printParkingfee(parkingfee);
    }

    private static List<ParkingInfo> loadData() { 
    	
		//////////////////////////////////
		// 제공 데이터 세트 1
		/////////////////////////////////
    	
    	List<ParkingInfo> inputData = Arrays.asList(
    			new ParkingInfo("11가1234", 10),
    			new ParkingInfo("34오6789", 20),
    			new ParkingInfo("76나2323", 45),
    			new ParkingInfo("33노8989", 120),
    			new ParkingInfo("99이3810", 35),
    			new ParkingInfo("46거6677", 20),
    			new ParkingInfo("47마9087", 60),
    			new ParkingInfo("90오2345", 70),
    			new ParkingInfo("90우9999", 80),
    			new ParkingInfo("45소1122", 10),
    			new ParkingInfo("23노8888", 35),
    			new ParkingInfo("78이2345", 44),
    			new ParkingInfo("88구1212", 20)
		);
    	
		//////////////////////////////////
		// 제공 데이터 세트 2
		/////////////////////////////////
    	
/*    	List<ParkingInfo> inputData = Arrays.asList(
    			new ParkingInfo("11너5687", 10),
    			new ParkingInfo("21구7894", 100),
    			new ParkingInfo("68고4567", 35),
    			new ParkingInfo("92가1234", 30),
    			new ParkingInfo("98거5698", 90),
    			new ParkingInfo("72아1234", 60),
    			new ParkingInfo("81사6543", 20)
		);
*/    	
    	return inputData;
	}
    
    private static void printInput(List<ParkingInfo> inputData){
        printLineInitial();
        System.out.println("차량번호\t 주차시간(분)");
        for(ParkingInfo parkingInfo : inputData){
        	System.out.println(parkingInfo.getCarNumber()+"\t "+parkingInfo.getParkingTime());
        }
        printLine();
    }
    
    private static void printNumberOfCars(HashMap<Integer, Integer> numberOfCars) {   
    	System.out.println("[차종별 주차대수]");
    	if(numberOfCars == null || numberOfCars.size() == 0){
    		System.out.println("결과값이 없습니다.");
    	}else{
    		List<Integer> keyList = new ArrayList<Integer>(numberOfCars.keySet());
    		Collections.sort(keyList);
    		for(int key : keyList){
    			if(key == 0){
    				System.out.print("승용차: ");
    			}else if(key == 1){
    				System.out.print("승합차: ");
    			}else if(key == 2){
    				System.out.print("화물차: ");
    			}else{
    				System.out.print("특수차: ");
    			}
    			System.out.println(numberOfCars.get(key)+"대");
    		}
    	}
    	printLine();      	
    } 
    
    private static void printParkingfee(int parkingfee) {   
    	System.out.print("[주차요금 합계]: ");
    	if(parkingfee == 0){
    		System.out.println("결과값이 없습니다.");
    	}else{
    		System.out.println(parkingfee+"원");
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

