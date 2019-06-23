package com.lgcns.tct.parking.test;

import java.util.HashMap;
import java.util.List;

public class Parking {
	
	
	/**
	 * ������ ������� ��� ���
	 *
     * @param		inputData		List		�Էµ�����(������ ���� ����)
     * @return						HashMap		������ ������� (key->"0" : value->"�¿��� �������", key->"1" : value->"������ �������", key->"2" : value->"ȭ���� �������", key->"3" : value->"Ư���� �������")
	 */
	public HashMap<Integer, Integer> getNumberOfCars(List<ParkingInfo> inputData) {
		HashMap<Integer, Integer> numberOfCars = new HashMap<Integer, Integer>();
		
		///////////////////////////////////////////////////////////////////////////
		
		for(ParkingInfo parking : inputData){
			String carTypeStr = parking.getCarNumber().substring(0, 2);
			int key = -1;
			int carType = Integer.parseInt(carTypeStr);
			if(carType >= 11 && carType <= 69){
				key = 0;				
			}else if(carType >= 70 && carType <= 79){
				key = 1;
			}else if(carType >= 80 && carType <= 97){
				key = 2;
			}else if(carType >= 98 && carType <= 99){
				key = 3;
			}
			int cnt = 0;
			if(numberOfCars.containsKey(key)){
				cnt = numberOfCars.get(key) + 1; // ���� �߻�
			}else{
				cnt++; 
			}
			numberOfCars.put(key, cnt);
			
		}
		
		///////////////////////////////////////////////////////////////////////////	
		return numberOfCars;
	}
	
	/**
	 * ������� �հ� ��� ���
	 *
     * @param		inputData		List		�Էµ�����(������ ���� ����)
     * @return						int			������� �հ�
	 */
	public int getParkingFee(List<ParkingInfo> inputData) {
		int parkingfee = 0;
		
		///////////////////////////////////////////////////////////////////////////
		int[] fee = {1000, 1000, 2000, 3000}; // [0]:�¿���, [1]:������, [2]:ȭ����, [3]:Ư������ �������
		for(ParkingInfo parking : inputData){
			int time = parking.getParkingTime();
			int price = 0;
			if(time >= 30){
				String carTypeStr = parking.getCarNumber().substring(0, 2);
				int carType = Integer.parseInt(carTypeStr);
				int index = 0;
				if(carType >= 11 && carType <= 69){
					index = 0;				
				}else if(carType >= 70 && carType <= 79){
					index = 1;
				}else if(carType >= 80 && carType <= 97){
					index = 2;
				}else if(carType >= 98 && carType <= 99){
					index = 3;
				}
				price = fee[index];
			}
			parkingfee += price; // ���� �߻�
		}
		///////////////////////////////////////////////////////////////////////////
		return parkingfee;
	}
}