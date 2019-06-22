package com.lgcns.tct.gene;


public class GeneRun {	
	
	public static int[][] similarityMatrix;
	
    public static void main(String[] args) {    	
		// ���� ������ ��Ʈ2�� �����Ϸ��� loadData���� ���� ������ ��Ʈ1�� �ּ� ó���ϰ� ���� ������ ��Ʈ2�� �ּ� �����Ͽ� ����
    	String inputData = loadData();
    	printInput(inputData);
    	Gene gene = new Gene();
    	
    	// �ܼ��� ����� ���絵 ���� ���
    	int similarity = gene.measureSimpleComparison(inputData);
    	printSimpleComparison(similarity);
    	
    	// ��ĺ� ����� ���絵 ���� ���
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
		// ���� ������ ��Ʈ 1
		/////////////////////////////////    	
    	
    	String inputData = "AGTCATG,GTTAG";
    	
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 2
		/////////////////////////////////
    	
    	//String inputData = "ATTCGG,GTAT";
    	
    	return inputData;
	}
    
    private static void printInput(String inputData){
        printLineInitial();
        System.out.println("������ ���ڿ�: "+inputData);
        printLine();
    }
    
    private static void printSimpleComparison(int similarity) {   
    	System.out.println("[�ܼ��� ����� ���絵 ����]");
    	System.out.print("���絵: ");
    	if(similarity == 0){
    		System.out.println("������� �����ϴ�.");
    	}else{    		
    		System.out.println(similarity);
    	}
    	printLine();         	
    } 
    
    private static void printSortComparison(int maxSimilarity) {   
    	System.out.println("[��ĺ� ����� ���絵 ����]");
    	System.out.print("���絵: ");
    	if(maxSimilarity == 0){
    		System.out.println("������� �����ϴ�.");
    	}else{    		
    		System.out.println(maxSimilarity);
    	}
    	printLine();         	
    } 
    
    private static void printLineInitial(){
    	System.out.println("[�ʱ� �Է� ������]");
    }
    
	private static void printLine(){
		System.out.println("--------------------------------------------------------------------");
	}  
}

