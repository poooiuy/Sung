package com.lgcns.tct.operation.test;

import java.util.ArrayList;
import java.util.List;

public class Operation {
	/**
	 * ���ڿ� �и� ���
	 * 
     * @param		inputData			String		�Էµ�����(���ڿ�)
     * @return							List		[0]: ���ڷ� ������ ���ڿ�, [1]: ���ڷ� ������ ���ڿ�
	 */
	public List<String> getStrList(String inputData){
		List<String> strList = null;
		//////////////////////������� ���� (1) ---------------->
		String num = "";
		String str = "";
		for(int i=0; i<inputData.length(); i++) {
			
			try {
				num = num + Integer.parseInt(inputData.charAt(i)+"");
			}catch(Exception e) {
				str = str + inputData.charAt(i);
			}
			
		}
		
		strList = new ArrayList<>();
		strList.add(str);
		strList.add(num);
		

		

		///////////////////////////// <-------------- ������� ���� (1)
		return strList;
	}
	
	/**
	 * ���ο� ���ڿ��� �����ϴ� ���
	 * 
     * @param		strList			List		[0]: ���ڷ� ������ ���ڿ�, [1]: ���ڷ� ������ ���ڿ�
     * @return						String		���ο� ���ڿ�
	 */
	public String getNewStr(List<String> strList){
		String newStr = "";
		//////////////////////������� ���� (2) ---------------->
		for(int i=0; i < strList.get(0).length(); i++) {
			newStr = newStr + strList.get(0).charAt(i);
			if(i < strList.get(0).length()-1) {
				newStr = newStr + strList.get(1).charAt(i);
			}
		}
			
		
		///////////////////////////// <-------------- ������� ���� (2)
		return newStr;
	}

}
