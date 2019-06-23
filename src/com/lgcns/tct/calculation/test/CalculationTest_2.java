package com.lgcns.tct.calculation.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CalculationTest_2 {
	
	List<String> inputData = Arrays.asList(
			"92118451", "2384184", "72195234"
	);
	
	
	List<List<String>> compareSortedNumbers = Arrays.asList(
			Arrays.asList(
					"921", "451", "118"
			),
			Arrays.asList(
					"384", "212", "184"
			),
			Arrays.asList(
					"721", "234", "195"
			)
	);
	
	List<List<String>> compareSortedNumbers2 = Arrays.asList(
			Arrays.asList(
					"921", "451", "118"
			),
			Arrays.asList(
					"384", "212", "184"
			),
			Arrays.asList(
					"721", "234", "195"
			)
	);
	
	List<Integer> compareCalculation = Arrays.asList(
			480, 670, 40
	);
	
	@Test
	public void TEST1__��_����_�����_ū_������_����__��_����_�����_ū_������_������_���__7(){
		Calculation calculation = new Calculation();
		for(int i=0; i<inputData.size(); i++) {
			List<String> sortedNumbers = calculation.sortNumbers(inputData.get(i));
			if(compareSortedNumbers.get(i).size() == sortedNumbers.size()){
				for(int j = 0; j < compareSortedNumbers.get(i).size(); j++){
					assertEquals(compareSortedNumbers.get(i).get(j), sortedNumbers.get(j));
				}
			}else{
				assertEquals(true, false);
				
			}
		}
	}
	
	@Test
	public void TEST2__��_����_�̿��Ͽ�_���ο�_��_����__��_����_�̿��Ͽ�_���ο�_����_������_���__8(){
		Calculation calculation = new Calculation();
		for(int i=0; i<compareSortedNumbers2.size(); i++) {
			int generatedNumber = calculation.generateNumber(compareSortedNumbers2.get(i));
			assertEquals(compareCalculation.get(i).intValue(), generatedNumber);
		}
	}
	
}
