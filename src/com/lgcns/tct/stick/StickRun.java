package com.lgcns.tct.stick;



public class StickRun {

	public static int numberOfLayers;
	
    public static void main(String[] args) {    	
		// ���� ������ ��Ʈ2�� �����Ϸ��� loadData���� ���� ������ ��Ʈ1�� �ּ� ó���ϰ� ���� ������ ��Ʈ2�� �ּ� �����Ͽ� ����
    	int inputData = loadData();
    	Stick stick = new Stick();
    	
    	// N���� �ﰢ���� ����� ���� ���� ������ ���ϴ� ���
    	int numberOfStickForTriangle = stick.getNumberOfStickForTriangle(inputData);
    	printNumberOfStickForTriangle(inputData, numberOfStickForTriangle);
    	
    	// N���� �Ƕ�̵带 ����� ���� ���� ������ ���ϴ� ���
    	int numberOfStickForPyramid = stick.getNumberOfStickForPyramid(numberOfLayers);
    	printNumberOfStickForPyramid(numberOfLayers, numberOfStickForPyramid);
    }

    private static int loadData() {
    	
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 1
		/////////////////////////////////
    	
    	int inputData = 6;
    	numberOfLayers = 4;
    	
		//////////////////////////////////
		// ���� ������ ��Ʈ 2
		/////////////////////////////////    	

//    	int inputData = 8;
//    	numberOfLayers = 7;

    	
    	return inputData;
	}    
    
    private static void printNumberOfStickForTriangle(int inputData, int numberOfStickForTriangle) {   
    	System.out.print("["+inputData+"���� �ﰢ���� ����� ���� ���� ����]: ");
    	if(numberOfStickForTriangle == 0){
    		System.out.println("������� �����ϴ�.");
    	}else{    		
    		System.out.println(numberOfStickForTriangle);
    	}
    	printLine();    	
    } 
    
    private static void printNumberOfStickForPyramid(int numberOfLayers, int numberOfStickForPyramid) {   
    	System.out.print("["+numberOfLayers+"���� �Ƕ�̵带 ����� ���� ���� ����]: ");
    	if(numberOfStickForPyramid == 0){
    		System.out.println("������� �����ϴ�.");
    	}else{    		
    		System.out.println(numberOfStickForPyramid);
    	}
    	printLine();  	
    }  

	private static void printLine(){
		System.out.println("--------------------------------------------------------------------");
	}  
}

