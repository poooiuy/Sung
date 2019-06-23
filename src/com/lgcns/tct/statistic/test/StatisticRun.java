package com.lgcns.tct.statistic.test;

public class StatisticRun {

	
    public static void main(String[] args) {    	
		// 제공 데이터 세트2를 실행하려면 loadData에서 제공 데이터 세트1을 주석 처리하고 제공 데이터 세트2를 주석 해제하여 실행
    	int[] inputData=loadData();  
		printInput(inputData);	
    	Statistic statistics = new Statistic();
    	
    	// 출생아수가 가장 많은 연도 검색 기능
    	int maxYear = statistics.getMaxYear(inputData);
    	printMaxYear(maxYear);
    	
    	// 출생아 수가 가장 크게 감소한 연도 검색 기능
    	int maxDecreaseYear = statistics.getMaxDecreaseYear(inputData);
    	printMaxDecreaseYear(maxDecreaseYear);
    	    	 
    }

    private static int[] loadData() {
    	
		//////////////////////////////////
		// 제공 데이터 세트 1
		/////////////////////////////////
    	
//    	int[] inputData = { //[0]:2010년, [1]:2011년, [2]:2012년, [3]:2013년, [4]:2014년, [5]:2015년, [6]:2016년   
//    		470200, 471300, 484600, 436500, 435400, 438400, 406200	
//    	};
    	
    	
    	
		//////////////////////////////////
		// 제공 데이터 세트 2
		/////////////////////////////////    	
    	int[] inputData = { //[0]:2010년, [1]:2011년, [2]:2012년, [3]:2013년, [4]:2014년, [5]:2015년, [6]:2016년
        		654789, 659821, 557892, 324897, 578965, 621457, 521456	
    	};
    	
    	
    	return inputData;
	}    
    
    private static void printInput(int[] inputData){
    	printLineInitial();    
    	System.out.println("\t2010\t2011\t2012\t2013\t2014\t2015\t2016");
    	System.out.print("출생아수\t");
    	for(int num : inputData){
    		System.out.print(num+"\t");	
    	}
    	System.out.println();
    	printLine();
    }
    
    private static void printMaxYear(int maxYear) {       	
    	System.out.print("[출생아 수가 가장 많은 연도]: ");       	    	
    	if(maxYear == 0){
    		System.out.println("결과값이 없습니다.");
    	}else{
    		System.out.println(maxYear);
    	}
    	printLine();    	
    }    
    
    private static void printMaxDecreaseYear(int maxDecreaseYear) {       	
    	System.out.print("[출생아 수가 가장 크게 감소한 연도]: ");       	    	
    	if(maxDecreaseYear == 0){
    		System.out.println("결과값이 없습니다.");
    	}else{
    		System.out.println(maxDecreaseYear);
    	}
    	printLine();    	
    }

    private static void printLine(){
		System.out.println("------------------------------------------------------------");
	}	
	
	private static void printLineInitial(){
    	System.out.println("[초기 입력 데이터]");
    }
}

