package com.lgcns.tct.parking;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class ParkingTest_2 {
	
	List<List<ParkingInfo>> inputData = Arrays.asList(
			Arrays.asList(
					new ParkingInfo("25너5687", 100),
	    			new ParkingInfo("69구7894", 100),
	    			new ParkingInfo("72고4567", 35),
	    			new ParkingInfo("88가1234", 32),
	    			new ParkingInfo("98거5698", 65),
	    			new ParkingInfo("72아1234", 70),
	    			new ParkingInfo("92사6543", 80)
			),
			Arrays.asList(
					new ParkingInfo("67너5687", 90),
	    			new ParkingInfo("81구7894", 100),
	    			new ParkingInfo("98고4567", 35),
	    			new ParkingInfo("99가1234", 40),
	    			new ParkingInfo("75거5698", 90),
	    			new ParkingInfo("64아1234", 60),
	    			new ParkingInfo("12사6543", 20)
			),
			Arrays.asList(
					new ParkingInfo("98너5687", 10),
	    			new ParkingInfo("91구7894", 10),
	    			new ParkingInfo("68고4567", 35),
	    			new ParkingInfo("65가1234", 30),
	    			new ParkingInfo("84거5698", 25),
	    			new ParkingInfo("72아1234", 60),
	    			new ParkingInfo("51사6543", 20)
			)
	);
	
	List<List<ParkingInfo>> inputData2 = Arrays.asList(
			Arrays.asList(
					new ParkingInfo("25너5687", 100),
	    			new ParkingInfo("69구7894", 100),
	    			new ParkingInfo("72고4567", 35),
	    			new ParkingInfo("88가1234", 32),
	    			new ParkingInfo("98거5698", 65),
	    			new ParkingInfo("72아1234", 70),
	    			new ParkingInfo("92사6543", 80)
			),
			Arrays.asList(
					new ParkingInfo("67너5687", 90),
	    			new ParkingInfo("81구7894", 100),
	    			new ParkingInfo("98고4567", 35),
	    			new ParkingInfo("99가1234", 40),
	    			new ParkingInfo("75거5698", 90),
	    			new ParkingInfo("64아1234", 60),
	    			new ParkingInfo("12사6543", 20)
			),
			Arrays.asList(
					new ParkingInfo("98너5687", 10),
	    			new ParkingInfo("91구7894", 10),
	    			new ParkingInfo("68고4567", 35),
	    			new ParkingInfo("65가1234", 30),
	    			new ParkingInfo("84거5698", 25),
	    			new ParkingInfo("72아1234", 60),
	    			new ParkingInfo("51사6543", 20)
			)
	);
	

	HashMap<Integer, Integer> numberOfCars1;
	{
		numberOfCars1 = new HashMap<Integer, Integer>();
		numberOfCars1.put(0, 2);
		numberOfCars1.put(1, 2);
		numberOfCars1.put(2, 2);
		numberOfCars1.put(3, 1);
		
	};
	
	HashMap<Integer, Integer> numberOfCars2;
	{
		numberOfCars2 = new HashMap<Integer, Integer>();
		numberOfCars2.put(0, 3);
		numberOfCars2.put(1, 1);
		numberOfCars2.put(2, 1);
		numberOfCars2.put(3, 2);
		
	};
	
	HashMap<Integer, Integer> numberOfCars3;
	{
		numberOfCars3 = new HashMap<Integer, Integer>();
		numberOfCars3.put(0, 3);
		numberOfCars3.put(1, 1);
		numberOfCars3.put(2, 2);
		numberOfCars3.put(3, 1);
		
	};
	
	List<HashMap<Integer, Integer>> compareNumberOfCars = Arrays.asList(
			numberOfCars1, numberOfCars2, numberOfCars3
	);
	
	List<Integer> compareParkingfee = Arrays.asList(
			11000, 11000, 3000
	);
	
	
	@Test
	public void TEST1__차종별_주차대수_계산__차종별_주차대수_계산_기능__5(){
		Parking parking = new Parking();
		for(int i=0; i<inputData.size(); i++) {
			HashMap<Integer, Integer> numberOfCars = parking.getNumberOfCars(inputData.get(i));
			if(numberOfCars.size() == compareNumberOfCars.get(i).size()){
				for(int key : compareNumberOfCars.get(i).keySet()){
					assertEquals(compareNumberOfCars.get(i).get(key), numberOfCars.get(key));	
				}	
			}else{
				assertEquals(true, false);
			}
				
		}
	}
	
	@Test
	public void TEST2__주차요금_합계_계산__주차요금_합계_계산_기능__5(){
		Parking parking = new Parking();
		for(int i=0; i<inputData2.size(); i++) {
			int parkingfee = parking.getParkingFee(inputData2.get(i));
			assertEquals(compareParkingfee.get(i).intValue(), parkingfee);	
		}
	}
	
}
