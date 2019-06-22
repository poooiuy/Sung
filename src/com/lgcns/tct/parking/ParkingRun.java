package com.lgcns.tct.parking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ParkingRun {

    public static void main(String[] args) {    	
		// ���� ������ ��Ʈ2�� �����Ϸ��� loadData���� ���� ������ ��Ʈ1�� �ּ� ó���ϰ� ���� ������ ��Ʈ2�� �ּ� �����Ͽ� ����
    	List<ParkingInfo> inputData = loadData();
    	Parking parking = new Parking();
    	printInput(inputData);
    	
    	// ������ ������� ��� ���
    	HashMap<Integer, Integer> numberOfCars = parking.getNumberOfCars(inputData);
    	printNumberOfCars(numberOfCars);
    	
    	// ������� �հ� ��� ���
    	int parkingfee = parking.getParkingFee(inputData);
    	printParkingfee(parkingfee);
    }

    private static List<ParkingInfo> loadData() { 
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 1
		/////////////////////////////////
    	
    	List<ParkingInfo> inputData = Arrays.asList(
    			new ParkingInfo("11��1234", 10),
    			new ParkingInfo("34��6789", 20),
    			new ParkingInfo("76��2323", 45),
    			new ParkingInfo("33��8989", 120),
    			new ParkingInfo("99��3810", 35),
    			new ParkingInfo("46��6677", 20),
    			new ParkingInfo("47��9087", 60),
    			new ParkingInfo("90��2345", 70),
    			new ParkingInfo("90��9999", 80),
    			new ParkingInfo("45��1122", 10),
    			new ParkingInfo("23��8888", 35),
    			new ParkingInfo("78��2345", 44),
    			new ParkingInfo("88��1212", 20)
		);
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 2
		/////////////////////////////////
    	
/*    	List<ParkingInfo> inputData = Arrays.asList(
    			new ParkingInfo("11��5687", 10),
    			new ParkingInfo("21��7894", 100),
    			new ParkingInfo("68��4567", 35),
    			new ParkingInfo("92��1234", 30),
    			new ParkingInfo("98��5698", 90),
    			new ParkingInfo("72��1234", 60),
    			new ParkingInfo("81��6543", 20)
		);
*/    	
    	return inputData;
	}
    
    private static void printInput(List<ParkingInfo> inputData){
        printLineInitial();
        System.out.println("������ȣ\t �����ð�(��)");
        for(ParkingInfo parkingInfo : inputData){
        	System.out.println(parkingInfo.getCarNumber()+"\t "+parkingInfo.getParkingTime());
        }
        printLine();
    }
    
    private static void printNumberOfCars(HashMap<Integer, Integer> numberOfCars) {   
    	System.out.println("[������ �������]");
    	if(numberOfCars == null || numberOfCars.size() == 0){
    		System.out.println("������� �����ϴ�.");
    	}else{
    		List<Integer> keyList = new ArrayList<Integer>(numberOfCars.keySet());
    		Collections.sort(keyList);
    		for(int key : keyList){
    			if(key == 0){
    				System.out.print("�¿���: ");
    			}else if(key == 1){
    				System.out.print("������: ");
    			}else if(key == 2){
    				System.out.print("ȭ����: ");
    			}else{
    				System.out.print("Ư����: ");
    			}
    			System.out.println(numberOfCars.get(key)+"��");
    		}
    	}
    	printLine();      	
    } 
    
    private static void printParkingfee(int parkingfee) {   
    	System.out.print("[������� �հ�]: ");
    	if(parkingfee == 0){
    		System.out.println("������� �����ϴ�.");
    	}else{
    		System.out.println(parkingfee+"��");
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

