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
	public void TEST1__출생아_수가_가장_많은_연도_검색__출생아_수가_가장_많은_연도_검색_기능__5(){
		Statistic statistics = new Statistic();
		for(int i=0; i<inputData.length; i++) {
			int maxYear = statistics.getMaxYear(inputData[i]);
			assertEquals(maxYear, compareMaxYear.get(i).intValue());
		}		
	}
	
	@Test
	public void TEST2__출생아_수가_가장_크게_감소한_연도_검색__출생아_수가_가장_크게_감소한_연도_검색_기능__10(){
		Statistic statistics = new Statistic();
		for(int i=0; i<inputData2.length; i++) {
			int maxDecreaseYear = statistics.getMaxDecreaseYear(inputData2[i]);
			assertEquals(maxDecreaseYear, compareMaxDecreaseYear.get(i).intValue());
		}		
	}
}
