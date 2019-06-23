package com.lgcns.tct.statistic.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class StatisticTest_1 {
	
	int[][] inputData = {
			{
				654789, 547891, 587425, 595124, 647854, 624578, 547897
			},
			{	
				592456, 621457, 554789, 624578, 587894, 624570, 669787 
			},
			{
				652478, 587498, 574126, 621456, 634578, 524789, 698745
			}
	};
	
	int[][] inputData2 = {
			{
				654789, 547891, 587425, 595124, 647854, 624578, 547897
			},
			{	
				592456, 621457, 554789, 624578, 587894, 624570, 669787 
			},
			{
				652478, 587498, 574126, 621456, 634578, 524789, 698745
			}
	};
	
	List<Integer> compareMaxYear = Arrays.asList(
			2010, 2016, 2016
	);
	
	List<Integer> compareMaxDecreaseYear = Arrays.asList(
			2011, 2012, 2015
	);
	
	
	@Test
	public void TEST1__�����_����_����_����_����_�˻�__�����_����_����_����_����_�˻�_���__5(){
		Statistic statistics = new Statistic();
		for(int i=0; i<inputData.length; i++) {
			int maxYear = statistics.getMaxYear(inputData[i]);
			assertEquals(maxYear, compareMaxYear.get(i).intValue());
		}		
	}
	
	@Test
	public void TEST2__�����_����_����_ũ��_������_����_�˻�__�����_����_����_ũ��_������_����_�˻�_���__10(){
		Statistic statistics = new Statistic();
		for(int i=0; i<inputData2.length; i++) {
			int maxDecreaseYear = statistics.getMaxDecreaseYear(inputData2[i]);
			assertEquals(maxDecreaseYear, compareMaxDecreaseYear.get(i).intValue());
		}		
	}
}
