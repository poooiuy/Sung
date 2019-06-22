package com.lgcns.tct.elevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Elevator {
	
	
	/**
	 * 사용 전력량을 계산하는 기능
	 *
     * @param		inputData			String			입력 데이터(운행정보)
     * @return							int				사용 전력량
	 */
	public int calculatePower(String inputData) {
		int power = 0;
		String[] inputDataArr = inputData.split(",");
		for(int i = 0; i < inputDataArr.length-1; i++){
			int firstLevel = 0;
			int secondLevel = 0;
			if(inputDataArr[i].charAt(0) == 'B'){				
				firstLevel = -1 * Integer.parseInt(inputDataArr[i].substring(1));
			}else{
				firstLevel = Integer.parseInt(inputDataArr[i]);
			}
			if(inputDataArr[i+1].charAt(0) == 'B'){
				secondLevel = -1 * Integer.parseInt(inputDataArr[i+1].substring(1));
			}else{
				secondLevel = Integer.parseInt(inputDataArr[i+1]);
			}
			
			int difference = Math.abs(firstLevel-secondLevel);
			if((firstLevel > 0 && secondLevel < 0) || (firstLevel < 0 && secondLevel > 0)){
				difference--;
			}
			
			if(firstLevel > secondLevel){
				power += difference * 5;
			}else{
				power += difference * 9;  // 결함 발생
			}
			
		}
		return power;
	}
	
	/**
	 * 사용 전력량을 기준으로 내림차순 정렬하는 기능
	 *
     * @param		elevatorInfoList	List			입력데이터(각 엘리베이터의 정보)
     * @return							List			사용 전력량을 기준으로 정렬된 정보
	 */
	public List<ElevatorInfo> sortDescending(List<ElevatorInfo> elevatorInfoList) {
		List<ElevatorInfo> powerList = null;
		powerList = new ArrayList<ElevatorInfo>();
		for(int i = 0 ; i < elevatorInfoList.size(); i++){
			String drivingInfo = elevatorInfoList.get(i).getDrivingInfo();
			int power = calculatePower(drivingInfo);
			elevatorInfoList.get(i).setPower(power);
			powerList.add(elevatorInfoList.get(i));
		}
		
		Collections.sort(powerList, new Comparator<ElevatorInfo>() {
			@Override
			public int compare(final ElevatorInfo object1, final ElevatorInfo object2) {
				if(object2.getPower() > object1.getPower()){
					return 1;
				}else if(object1.getPower() == object2.getPower()){
					return object1.getName().compareTo(object2.getName());	  // 결함 발생
				}else{
					return -1;
				}
			}
		});
		
		return powerList;
	}
	
}