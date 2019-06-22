package com.lgcns.tct.parking;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class ParkingTest_2 {
	
	List<List<ParkingInfo>> inputData = Arrays.asList(
			Arrays.asList(
					new ParkingInfo("25��5687", 100),
	    			new ParkingInfo("69��7894", 100),
	    			new ParkingInfo("72��4567", 35),
	    			new ParkingInfo("88��1234", 32),
	    			new ParkingInfo("98��5698", 65),
	    			new ParkingInfo("72��1234", 70),
	    			new ParkingInfo("92��6543", 80)
			),
			Arrays.asList(
					new ParkingInfo("67��5687", 90),
	    			new ParkingInfo("81��7894", 100),
	    			new ParkingInfo("98��4567", 35),
	    			new ParkingInfo("99��1234", 40),
	    			new ParkingInfo("75��5698", 90),
	    			new ParkingInfo("64��1234", 60),
	    			new ParkingInfo("12��6543", 20)
			),
			Arrays.asList(
					new ParkingInfo("98��5687", 10),
	    			new ParkingInfo("91��7894", 10),
	    			new ParkingInfo("68��4567", 35),
	    			new ParkingInfo("65��1234", 30),
	    			new ParkingInfo("84��5698", 25),
	    			new ParkingInfo("72��1234", 60),
	    			new ParkingInfo("51��6543", 20)
			)
	);
	
	List<List<ParkingInfo>> inputData2 = Arrays.asList(
			Arrays.asList(
					new ParkingInfo("25��5687", 100),
	    			new ParkingInfo("69��7894", 100),
	    			new ParkingInfo("72��4567", 35),
	    			new ParkingInfo("88��1234", 32),
	    			new ParkingInfo("98��5698", 65),
	    			new ParkingInfo("72��1234", 70),
	    			new ParkingInfo("92��6543", 80)
			),
			Arrays.asList(
					new ParkingInfo("67��5687", 90),
	    			new ParkingInfo("81��7894", 100),
	    			new ParkingInfo("98��4567", 35),
	    			new ParkingInfo("99��1234", 40),
	    			new ParkingInfo("75��5698", 90),
	    			new ParkingInfo("64��1234", 60),
	    			new ParkingInfo("12��6543", 20)
			),
			Arrays.asList(
					new ParkingInfo("98��5687", 10),
	    			new ParkingInfo("91��7894", 10),
	    			new ParkingInfo("68��4567", 35),
	    			new ParkingInfo("65��1234", 30),
	    			new ParkingInfo("84��5698", 25),
	    			new ParkingInfo("72��1234", 60),
	    			new ParkingInfo("51��6543", 20)
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
	public void TEST1__������_�������_���__������_�������_���_���__5(){
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
	public void TEST2__�������_�հ�_���__�������_�հ�_���_���__5(){
		Parking parking = new Parking();
		for(int i=0; i<inputData2.size(); i++) {
			int parkingfee = parking.getParkingFee(inputData2.get(i));
			assertEquals(compareParkingfee.get(i).intValue(), parkingfee);	
		}
	}
	
}
