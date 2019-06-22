package com.lgcns.tct.gene;

import static org.junit.Assert.assertEquals;



import org.junit.Test;


public class GeneTest_5 {
	
	
	String[] inputData = {
			 "AGGCTTC,TTAGGA", "CTAGAAT,GGA", "GTTCTAG,GTTTCA"
	};
	
	String[] inputData2 = {
			 "AGGCTTC,TTAGGA", "CTAGAAT,GGA", "GTTCTAG,GTTTCA"
	};
	
	int[][] similarityMatrix = {
			 {5, -1, -2, -1, -3},
	         {-1, 6, -3, -2, -4},
	         {-2, -3, 7, -1, -2},
	         {-1, -2, -1, 8, -1},
	         {-3, -4, -2, -1, 0}
	};
	
	int[] compareSimilarity = {
			3, 2, 4
	};
	
	int[] compareMaxSimilarity = {
			10, 1, 22
	};
	
	@Test
	public void TEST1__단순비교_방식의_유사도_측정__단순비교_방식의_유사도를_측정한_결과__15(){
		Gene gene = new Gene();
		for(int i=0; i<inputData.length; i++) {
			int similarity = gene.measureSimpleComparison(inputData[i]);
			assertEquals(compareSimilarity[i], similarity);
		}
	}
	
	@Test
	public void TEST2__행렬비교_방식의_유사도_측정__행렬비교_방식의_유사도를_측정한_결과__15(){
		Gene gene = new Gene();
		for(int i=0; i<inputData2.length; i++) {
			int maxSimilarity = gene.measureSortComparison(inputData2[i], similarityMatrix);
			assertEquals(compareMaxSimilarity[i], maxSimilarity);
		}
	}
	
	
}
