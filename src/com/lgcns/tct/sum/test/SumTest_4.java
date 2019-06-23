package com.lgcns.tct.sum.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SumTest_4 {
	
	int[][][] inputData =  {
			{
				{71, 12, 7, 45},
			    {33, 36, 43, 93},
			    {25, 42, 63, 84},
			    {12, 54, 74, 45}
			},
			{
				{66, 31, 12, 85, 56, 17},
			    {42, 77, 24, 61, 45, 36},
			    {65, 94, 61, 42, 36, 48},
			    {15, 64, 58, 47, 9, 58},
			    {2, 41, 45, 38, 57, 69},
			    {24, 37, 49, 37, 41, 72}
			},
			{
				{15, 46, 1, 22, 92, 46, 57, 22},
			    {32, 42, 53, 67, 73, 81, 95, 6},
			    {52, 95, 88, 74, 61, 52, 46, 33},
			    {33, 31, 31, 21, 31, 47, 59, 68},
			    {46, 52, 71, 24, 32, 38, 47, 79},
			    {55, 44, 37, 52, 79, 42, 21, 32},
			    {51, 32, 43, 64, 87, 8, 39, 24},
			    {32, 23, 36, 73, 67, 58, 49, 31}
			}
	};
	
	
	int[][][] compareSortedArray =  {
			{
				{1, 2, 3, 5},
			    {2, 3, 4, 5},
			    {2, 3, 4, 6},
			    {3, 4, 5, 7}
			},
			{
				{1, 2, 4, 5, 6, 7},
				{1, 2, 4, 5, 6, 7},
				{1, 2, 4, 6, 6, 8},
				{1, 2, 5, 7, 7, 9},
				{1, 2, 5, 7, 8, 9},
				{4, 5, 7, 8, 8, 9}
			},
			{
				{1, 1, 1, 1, 3, 5, 6, 7},
				{1, 2, 2, 2, 3, 5, 6, 7},
				{1, 2, 2, 2, 4, 5, 6, 8},
				{1, 2, 2, 3, 4, 6, 7, 9},
				{1, 2, 2, 3, 4, 7, 8, 9},
				{1, 2, 2, 3, 5, 7, 8, 9},
				{1, 2, 3, 4, 6, 7, 8, 9},
				{1, 2, 3, 4, 6, 7, 8, 9}
			}
	};
	
	int[][][] compareSortedArray2 =  {
			{
				{1, 2, 3, 5},
			    {2, 3, 4, 5},
			    {2, 3, 4, 6},
			    {3, 4, 5, 7}
			},
			{
				{1, 2, 4, 5, 6, 7},
				{1, 2, 4, 5, 6, 7},
				{1, 2, 4, 6, 6, 8},
				{1, 2, 5, 7, 7, 9},
				{1, 2, 5, 7, 8, 9},
				{4, 5, 7, 8, 8, 9}
			},
			{
				{1, 1, 1, 1, 3, 5, 6, 7},
				{1, 2, 2, 2, 3, 5, 6, 7},
				{1, 2, 2, 2, 4, 5, 6, 8},
				{1, 2, 2, 3, 4, 6, 7, 9},
				{1, 2, 2, 3, 4, 7, 8, 9},
				{1, 2, 2, 3, 5, 7, 8, 9},
				{1, 2, 3, 4, 6, 7, 8, 9},
				{1, 2, 3, 4, 6, 7, 8, 9}
			}
	};
	
	List<Integer> compareArrSum = Arrays.asList(
			31, 24, 26
	);
	
	@Test
	public void TEST1__배열_정렬__배열을_정렬한_결과__10(){
		Sum sum = new Sum();
		for(int i=0; i<inputData.length; i++) {
			int[][] sortedArray = sum.getSortedArray(inputData[i]);
			if(sortedArray.length== compareSortedArray[i].length){
				
				for(int j = 0; j < compareSortedArray[i].length; j++){
					for(int k = 0; k < compareSortedArray[i][j].length; k++){
						assertEquals(compareSortedArray[i][j][k], sortedArray[j][k]);		
					}
				}
				
			}else{
				assertEquals(true, false);	
			}
		}
	}
	
	@Test
	public void TEST2__배열합_계산__배열합을_계산한_결과__10(){
		Sum sum = new Sum();
		for(int i=0; i<compareSortedArray2.length; i++) {
			int arrSum = sum.getArrSum(compareSortedArray2[i]);
			assertEquals(compareArrSum.get(i).intValue(), arrSum);	
		}
	}
	
	
}
