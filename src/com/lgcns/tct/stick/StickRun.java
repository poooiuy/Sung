package com.lgcns.tct.stick;



public class StickRun {

	public static int numberOfLayers;
	
    public static void main(String[] args) {    	
		// 제공 데이터 세트2를 실행하려면 loadData에서 제공 데이터 세트1을 주석 처리하고 제공 데이터 세트2를 주석 해제하여 실행
    	int inputData = loadData();
    	Stick stick = new Stick();
    	
    	// N개의 삼각형을 만들기 위한 막대 개수를 구하는 기능
    	int numberOfStickForTriangle = stick.getNumberOfStickForTriangle(inputData);
    	printNumberOfStickForTriangle(inputData, numberOfStickForTriangle);
    	
    	// N층의 피라미드를 만들기 위한 막대 개수를 구하는 기능
    	int numberOfStickForPyramid = stick.getNumberOfStickForPyramid(numberOfLayers);
    	printNumberOfStickForPyramid(numberOfLayers, numberOfStickForPyramid);
    }

    private static int loadData() {
    	
    	
		//////////////////////////////////
		// 제공 데이터 세트 1
		/////////////////////////////////
    	
    	int inputData = 6;
    	numberOfLayers = 4;
    	
		//////////////////////////////////
		// 제공 데이터 세트 2
		/////////////////////////////////    	

//    	int inputData = 8;
//    	numberOfLayers = 7;

    	
    	return inputData;
	}    
    
    private static void printNumberOfStickForTriangle(int inputData, int numberOfStickForTriangle) {   
    	System.out.print("["+inputData+"개의 삼각형을 만들기 위한 막대 개수]: ");
    	if(numberOfStickForTriangle == 0){
    		System.out.println("결과값이 없습니다.");
    	}else{    		
    		System.out.println(numberOfStickForTriangle);
    	}
    	printLine();    	
    } 
    
    private static void printNumberOfStickForPyramid(int numberOfLayers, int numberOfStickForPyramid) {   
    	System.out.print("["+numberOfLayers+"층의 피라미드를 만들기 위한 막대 개수]: ");
    	if(numberOfStickForPyramid == 0){
    		System.out.println("결과값이 없습니다.");
    	}else{    		
    		System.out.println(numberOfStickForPyramid);
    	}
    	printLine();  	
    }  

	private static void printLine(){
		System.out.println("--------------------------------------------------------------------");
	}  
}

