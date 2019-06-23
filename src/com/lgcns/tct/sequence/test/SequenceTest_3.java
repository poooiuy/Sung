package com.lgcns.tct.sequence.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class SequenceTest_3 {
	
	List<List<String>> inputData = Arrays.asList(
			Arrays.asList(
					"3421", "5671", "6598", "1234", "7756", "6789", "123", "345"
			),
			Arrays.asList(
					"6598", "12", "5678", "3256", "6658", "6789", "1156", "678"
			),
			Arrays.asList(
					"2569", "6598", "7589", "2365", "4567", "2345", "655", "789"
			)
	);
	
	List<List<String>> compareSequenceList = Arrays.asList(
			Arrays.asList(
					"123", "345", "1234", "6789"
			),
			Arrays.asList(
					"12", "678", "5678", "6789"
			),
			Arrays.asList(
					"789", "2345", "4567"
			)
	);
	
	List<List<String>> compareSequenceList2 = Arrays.asList(
			Arrays.asList(
					"123", "345", "1234", "6789"
			),
			Arrays.asList(
					"12", "678", "5678", "6789"
			),
			Arrays.asList(
					"789", "2345", "4567"
			)
	);
	
	List<Integer> compareMaxNum = Arrays.asList(
			6789123, 678912, 7894567
	);
	
	
	@Test
	public void TEST1__연속수_목록_검색__연속수_목록_검색_기능__10(){
		Sequence sequence = new Sequence();
		for(int i=0; i<inputData.size(); i++) {
			List<String> sequenceList = sequence.getSequenceList(inputData.get(i));
			if(sequenceList.size() == compareSequenceList.get(i).size()){
				Collections.sort(sequenceList);
				Collections.sort(compareSequenceList.get(i));
				for(int j = 0; j < compareSequenceList.get(i).size(); j++){
					assertEquals(compareSequenceList.get(i).get(j), sequenceList.get(j));	
				}
			}else{
				assertEquals(true, false);
			}
			
		}
	}
	
	@Test
	public void TEST2__가장_큰_수_생성__가장_큰_수_생성_기능__10(){
		Sequence sequence = new Sequence();
		for(int i=0; i<compareSequenceList2.size(); i++) {
			int maxNum = sequence.getMaxNum(compareSequenceList2.get(i));
			assertEquals(compareMaxNum.get(i).intValue(), maxNum);
		}
	}
}
