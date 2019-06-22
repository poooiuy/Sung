package com.lgcns.tct.operation;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class OperationTest_1 {
	
	List<String> inputData = Arrays.asList(
			"Q8T47S3D1LA", "184BS3DQ9SD", "Z4AD9K6W5D2"
	);
	
	List<List<String>> compareStrList = Arrays.asList(
			Arrays.asList("QTSDLA", "84731"),
			Arrays.asList("BSDQSD", "18439"),
			Arrays.asList("ZADKWD", "49652")
	);
	
	List<List<String>> compareStrList2 = Arrays.asList(
			Arrays.asList("QTSDLA", "84731"),
			Arrays.asList("BSDQSD", "18439"),
			Arrays.asList("ZADKWD", "49652")
	);
	
	List<String> compareNewStr = Arrays.asList(
			"Q8T4S7D3L1A", "B1S8D4Q3S9D", "Z4A9D6K5W2D"
	);
	
	@Test
	public void TEST1__문자열과_숫자열로_입력_문자열_분리__문자열과_숫자열로_입력_문자열을_분리한_결과__5(){
		Operation operation = new Operation();
		for(int i=0; i<inputData.size(); i++) {
			List<String> strList = operation.getStrList(inputData.get(i));
			if(strList.size() == compareStrList.get(i).size()){
				for(int j = 0; j < compareStrList.get(i).size(); j++){
					assertEquals(compareStrList.get(i).get(j), strList.get(j));
				}
			}else{
				assertEquals(true, false);
			}
		}
	}
	
	@Test
	public void TEST2__문자열과_숫자열_결합__문자열과_숫자열을_결합한_결과__5(){
		Operation operation = new Operation();
		for(int i=0; i<compareStrList2.size(); i++) {
			String newStr = operation.getNewStr(compareStrList2.get(i));
			assertEquals(compareNewStr.get(i), newStr);
		}
	}
	
	
}
