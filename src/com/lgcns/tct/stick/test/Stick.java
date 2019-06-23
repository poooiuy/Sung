package com.lgcns.tct.stick.test;

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
		
		int num = numberOfLayers;
		int total = 0;
		int minus = 0;
		
		for (int i = num; i > 0; i--) {
			total = total + (3+(2*i-2)*2);
			if(i != num) {
				minus = minus + i;
			}
		}

		numberOfStickForPyramid = total - minus;
		///////////////////////////// <-------------- ������� ���� (2)
		return numberOfStickForPyramid;
	}
	
}