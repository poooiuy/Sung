package com.lgcns.tct.operation;

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
		strList = new ArrayList<String>();
		String str = "";
		String numStr = "";
		char[] ch = inputData.toCharArray();
		for(char c : ch){
			if(isNum(String.valueOf(c))){
				numStr += c;
			}else{
				str += c;	
			}
		}
		strList.add(str);
		strList.add(numStr);
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
		String str = strList.get(0);
		String numStr = strList.get(1);
		char[] strArr = str.toCharArray();
		char[] numStrArr = numStr.toCharArray();
		for(int i = 0 ; i < strArr.length; i++){
			if(i == strArr.length-1){
				newStr += strArr[i];
			}else{
				newStr += strArr[i]+""+numStrArr[i];	
			}
		}
		///////////////////////////// <-------------- ������� ���� (2)
		return newStr;
	}
	
	/**
	 * ���ڸ� Ȯ���ϴ� ���(�ַ�ǿ� ���, �������Ͽ� ����)
	 *
     * @param		s			String		���ڿ�
     * @return					boolean		���ڿ���
	 */
	public boolean isNum(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
    }
}
