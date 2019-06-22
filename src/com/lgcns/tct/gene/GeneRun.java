package com.lgcns.tct.gene;


public class GeneRun {	
	
	public static int[][] similarityMatrix;
	
    public static void main(String[] args) {    	
		// 제공 데이터 세트2를 실행하려면 loadData에서 제공 데이터 세트1을 주석 처리하고 제공 데이터 세트2를 주석 해제하여 실행
    	String inputData = loadData();
    	printInput(inputData);
    	Gene gene = new Gene();
    	
    	// 단순비교 방식의 유사도 측정 기능
    	int similarity = gene.measureSimpleComparison(inputData);
    	printSimpleComparison(similarity);
    	
    	// 행렬비교 방식의 유사도 측정 기능
    	int maxSimilarity = gene.measureSortComparison(inputData, similarityMatrix);
    	printSortComparison(maxSimilarity);   	
    }

    private static String loadData() {
    	similarityMatrix = new int[][]{
    			{5, -1, -2, -1, -3},
    			{-1, 6, -3, -2, -4},
    			{-2, -3, 7, -1, -2},
    			{-1, -2, -1, 8, -1},
    			{-3, -4, -2, -1, 0}
    	};
    	
		//////////////////////////////////
		// 제공 데이터 세트 1
		/////////////////////////////////    	
    	
    	String inputData = "AGTCATG,GTTAG";
    	
    	
		//////////////////////////////////
		// 제공 데이터 세트 2
		/////////////////////////////////
    	
    	//String inputData = "ATTCGG,GTAT";
    	
    	return inputData;
	}
    
    private static void printInput(String inputData){
        printLineInitial();
        System.out.println("유전자 문자열: "+inputData);
        printLine();
    }
    
    private static void printSimpleComparison(int similarity) {   
    	System.out.println("[단순비교 방식의 유사도 측정]");
    	System.out.print("유사도: ");
    	if(similarity == 0){
    		System.out.println("결과값이 없습니다.");
    	}else{    		
    		System.out.println(similarity);
    	}
    	printLine();         	
    } 
    
    private static void printSortComparison(int maxSimilarity) {   
    	System.out.println("[행렬비교 방식의 유사도 측정]");
    	System.out.print("유사도: ");
    	if(maxSimilarity == 0){
    		System.out.println("결과값이 없습니다.");
    	}else{    		
    		System.out.println(maxSimilarity);
    	}
    	printLine();         	
    } 
    
    private static void printLineInitial(){
    	System.out.println("[초기 입력 데이터]");
    }
    
	private static void printLine(){
		System.out.println("--------------------------------------------------------------------");
	}  
}

