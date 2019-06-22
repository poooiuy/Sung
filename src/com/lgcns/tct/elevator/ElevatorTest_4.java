package com.lgcns.tct.elevator;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ElevatorTest_4 {
	
	String[] inputData = {
			"B1,4,5,9,8,7,5,6,B3",
			"5,B3,B2,4,8,7,6,B2,1",
			"B4,6,9,8,4,B1,2,B3,6",			
	};
	
	
	
	List<List<ElevatorInfo>> elevatorInfoList = Arrays.asList(
			Arrays.asList(
					new ElevatorInfo("E1", "1,B4,6,8,9,7,B5,7,5,6,7,B3,B1,5,4"),
					new ElevatorInfo("E2", "6,8,9,7,2,B1,4,5,6,8,7,4,B2,3,4,5,7"),
					new ElevatorInfo("E3", "B1,5,7,6,5,2,B1,4,8,9,7,5,1"),
					new ElevatorInfo("E4", "3,B2,4,5,8,9,4,B1,2,3,6,5,4")	
			),
			Arrays.asList(
					new ElevatorInfo("E1", "B1,4,6,8,9,7,5,7,5,6,7,B3,1,B5,B4"),
					new ElevatorInfo("E2", "6,8,9,7,B2,B1,4,5,6,8,7,4,B2,3,4,5,7"),
					new ElevatorInfo("E3", "1,5,7,6,5,B2,B1,4,8,9,7,5,B1"),
					new ElevatorInfo("E4", "B3,B2,4,5,8,9,4,B1,2,3,6,5,4")
			),
			Arrays.asList(
					new ElevatorInfo("E1", "B1,B4,6,8,9,7,B5,7,B5,6,7,B3,B1,5,4"),
					new ElevatorInfo("E2", "6,8,9,7,B2,B1,4,B5,6,8,7,4,B2,B3,B4,5,7"),
					new ElevatorInfo("E3", "B1,B4,6,8,9,7,B5,7,B5,6,7,B3,B1,5,4"),
					new ElevatorInfo("E4", "B3,B2,4,5,8,9,4,B1,B2,3,6,5,4")
			)
	);
	
	int[] comparePower = {
			150, 188, 263
	};
	
	List<List<ElevatorInfo>> comparePowerList = Arrays.asList(
			Arrays.asList(
					new ElevatorInfo("E1", 433), new ElevatorInfo("E2", 261), new ElevatorInfo("E3", 219), new ElevatorInfo("E4", 219) 	
			),
			Arrays.asList(
					new ElevatorInfo("E2", 275), new ElevatorInfo("E1", 253), new ElevatorInfo("E3", 229), new ElevatorInfo("E4", 208) 
			),
			Arrays.asList(
					new ElevatorInfo("E1", 554), new ElevatorInfo("E3", 554), new ElevatorInfo("E2", 415), new ElevatorInfo("E4", 222)
			)
	);
	
	@Test
	public void TEST1__사용_전력량_계산__사용_전력량_계산_기능__7(){
		Elevator elevator = new Elevator();
		for(int i=0; i<inputData.length; i++) {
			int power = elevator.calculatePower(inputData[i]);
			assertEquals(comparePower[i], power);
		}
	}
		
	@Test
	public void TEST2__엘리베이터_사용_전력량으로_정렬__엘리베이터_사용_전력량으로_정렬_기능__8(){
		Elevator elevator = new Elevator();
		for(int i=0; i<elevatorInfoList.size(); i++) {
			List<ElevatorInfo> powerList = elevator.sortDescending(elevatorInfoList.get(i));
			if(powerList.size() == comparePowerList.get(i).size()){
				for(int j = 0 ; j < comparePowerList.size(); j++){
	    			assertEquals(comparePowerList.get(i).get(j).getName(), powerList.get(j).getName());
	    			assertEquals(comparePowerList.get(i).get(j).getPower(), powerList.get(j).getPower());
	    		}	
			}else{
				assertEquals(true, false);
			}
			
		}
	}
	
}
