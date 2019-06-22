package com.lgcns.tct.stick;

public class Stick {
	
	
	/**
	 * N���� �ﰢ���� ����� ���� ���� ������ ���ϴ� ���
	 *
     * @param		inputData			int		�Էµ�����(�ﰢ�� ����)
     * @return							int		���� ����
	 */
	public int getNumberOfStickForTriangle(int inputData) {
		int numberOfStickForTriangle = 0;
		////////////////////////������� ���� (1) ---------------->
		
		numberOfStickForTriangle = 3+(inputData-1) * 2;
		
		
		///////////////////////////// <-------------- ������� ���� (1)
		return numberOfStickForTriangle;
	}
	
	
	/**
	 * N���� �Ƕ�̵带 ����� ���� ���� ������ ���ϴ� ���
	 *
     * @param		numberOfLayers			int		�Էµ�����(�Ƕ�̵� ����)
     * @return								int		���� ����
	 */
	public int getNumberOfStickForPyramid(int numberOfLayers) {
		int numberOfStickForPyramid = 0;
		////////////////////////������� ���� (2) ---------------->
		
		int tmpLayer = numberOfLayers;
		int sum = 0;
		
		for(;tmpLayer>0;tmpLayer--){
			sum = sum + (3+(((2*tmpLayer)-2)*2));
		}
		
		int sum1 = 0;
		while(numberOfLayers != 1){
			sum1 = sum1 + (numberOfLayers-1);
			numberOfLayers--;
		}
		
		numberOfStickForPyramid = sum - sum1;
		
		///////////////////////////// <-------------- ������� ���� (2)
		return numberOfStickForPyramid;
	}
	
}