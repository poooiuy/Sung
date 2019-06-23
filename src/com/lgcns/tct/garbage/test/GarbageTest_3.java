package com.lgcns.tct.garbage.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
public class GarbageTest_3 {
	
	List<String> inputData = Arrays.asList(
			"2G4P5S7G8B3P6B6W8W2P9G8S5B7P6S3G5P2B2S7W",
			"7W4G3P2S2G8B6P4G5P5B6B4S4W2W2P7G8S4B7P6S",
			"2G8B3P8B4W3W2P6G8S4B7P7G5P2B8S7W4G5P2S4S"
	);
	
	List<String> inputData2 = Arrays.asList(
			"2G4P5S7G8B3P6B6W8W2P9G8S5B7P6S3G5P2B2S7W",
			"7W4G3P2S2G8B6P4G5P5B6B4S4W2W2P7G8S4B7P6S",
			"2G8B3P8B4W3W2P6G8S4B7P7G5P2B8S7W4G5P2S4S"
	);
	
	List<List<Character>> compareNameList = Arrays.asList(
			Arrays.asList(
					'P', 'B', 'S', 'W'
			),
			Arrays.asList(
					'P', 'B'	
			),
			Arrays.asList(
					'P', 'B', 'S'	
			)
	);
	
	List<Integer> compareRatio = Arrays.asList(
			80, 82, 80
	);
	
	
	@Test
	public void TEST1__가장_많이_수거된_재활용품의_종류_검색__가장_많이_수거된_재활용품의_종류_검색_기능__10(){
		Garbage garbage = new Garbage();
		for(int i=0; i<inputData.size(); i++) {
			List<Character> nameList = garbage.getNameList(inputData.get(i));
			if(nameList.size() == compareNameList.get(i).size()){
				Collections.sort(nameList);
				Collections.sort(compareNameList.get(i));
				for(int j = 0; j < compareNameList.get(i).size(); j++){
					assertEquals(nameList.get(j), compareNameList.get(i).get(j));
				}
			}else{
				assertEquals(true, false);
			}
		}		
	}
	
	@Test
	public void TEST2__재활용품의_백분율_계산__재활용품의_백분율_계산_기능__10(){
		Garbage garbage = new Garbage();
		for(int i=0; i<inputData2.size(); i++) {
			int ratio = garbage.getRatio(inputData2.get(i));
			assertEquals(ratio, compareRatio.get(i).intValue());
		}		
	}

}
