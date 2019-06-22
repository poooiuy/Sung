package com.lgcns.tct.pad;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PadTest_5 {
	
	List<String> inputData = Arrays.asList(
			"1U0U4F2D6L2R1A2O0B3L", "1F3R3D5L7Y7U0O5A", "7Q3D4T4D5L6U3U8H5R"
	);
	
	
	int[][][] inputNumberPad = {
		{
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		},
		{
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		},
		{
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20},
				{21, 22, 23, 24, 25}
		}
	};
	
	List<String> compareRotationStr = Arrays.asList(
			"1U2D6L2R3L", "3R3D5L7U", "3D4D5L6U3U5R"
	);
	
	List<String> compareRotationStr2 = Arrays.asList(
			"1U2D6L2R3L", "3R3D5L7U", "3D4D5L6U3U5R"
	);
	
	int[][][] compareNumberPad = {
		{
				{16, 13, 14, 15},
				{4, 1, 2, 3},
				{8, 5, 6, 7},
				{12, 9, 10, 11}
		},
		{
				{3, 4, 1, 2},
				{7, 8, 5, 6},
				{11, 12, 9, 10},
				{15, 16, 13, 14}
		},
		{
				{11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20},
				{21, 22, 23, 24, 25},
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10}
		}
	};
	
	@Test
	public void TEST1__이동문자열_추출__이동문자열을_추출한_결과__10(){
		Pad pad = new Pad();
		for(int i=0; i<inputData.size(); i++) {
			String rotationStr = pad.getRotationStr(inputData.get(i));
			assertEquals(rotationStr, compareRotationStr.get(i));
		}		
	}
	
	@Test
	public void TEST2__숫자패드_이동__숫자패드를_이동한_결과__15(){
		Pad pad = new Pad();
		for(int i=0; i<inputNumberPad.length; i++) {
			int[][] numberPad = pad.getNumberPad(inputNumberPad[i], compareRotationStr2.get(i));
			if(numberPad.length == compareNumberPad[i].length){
				int arrSize = compareNumberPad[i].length;
				for(int j = 0; j < arrSize; j++){
					for(int k = 0; k < arrSize; k++){
						assertEquals(numberPad[j][k], compareNumberPad[i][j][k]);
					}	
				}
			}else{
				assertEquals(true, false);
			}
		}		
	}
}
