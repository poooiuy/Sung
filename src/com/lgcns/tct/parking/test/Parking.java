package com.lgcns.tct.parking.test;

import java.util.HashMap;
import java.util.List;

public class Parking {
	
	
	/**
	 * 차종별 주차대수 계산 기능
	 *
     * @param		inputData		List		입력데이터(주차한 차량 정보)
     * @return						HashMap		차종별 주차대수 (key->"0" : value->"승용차 주차대수", key->"1" : value->"승합차 주차대수", key->"2" : value->"화물차 주차대수", key->"3" : value->"특수차 주차대수")
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
				cnt = numberOfCars.get(key) + 1; // 결함 발생
			}else{
				cnt++; 
			}
			numberOfCars.put(key, cnt);
			
		}
		
		///////////////////////////////////////////////////////////////////////////	
		return numberOfCars;
	}
	
	/**
	 * 주차요금 합계 계산 기능
	 *
     * @param		inputData		List		입력데이터(주차한 차량 정보)
     * @return						int			주차요금 합계
	 */
	public int getParkingFee(List<ParkingInfo> inputData) {
		int parkingfee = 0;
		
		///////////////////////////////////////////////////////////////////////////
		int[] fee = {1000, 1000, 2000, 3000}; // [0]:승용차, [1]:승합차, [2]:화물차, [3]:특수차의 추차요금
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
			parkingfee += price; // 결함 발생
		}
		///////////////////////////////////////////////////////////////////////////
		return parkingfee;
	}
}