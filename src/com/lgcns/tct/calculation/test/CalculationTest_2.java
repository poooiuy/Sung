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
	public void TEST1__세_수로_만들어_큰_순서로_정렬__세_수로_만들어_큰_순서로_정렬한_결과__7(){
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
	public void TEST2__세_수를_이용하여_새로운_수_생성__세_수를_이용하여_새로운_수를_생성한_결과__8(){
		Calculation calculation = new Calculation();
		for(int i=0; i<compareSortedNumbers2.size(); i++) {
			int generatedNumber = calculation.generateNumber(compareSortedNumbers2.get(i));
			assertEquals(compareCalculation.get(i).intValue(), generatedNumber);
		}
	}
	
}
