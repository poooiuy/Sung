package com.lgcns.tct.garbage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Garbage {

	/**
	 * ���� ���� ���ŵ� ��Ȱ��ǰ�� ���� �˻� ���
	 *
	 * @param 	inputData   	String			�Էµ�����(��Ȱ��ǰ�� �Ϲݾ����� ������ ��� �ִ� ����)
	 * @return 					List			���� ���� ���ŵ� ��Ȱ��ǰ (P:�ö�ƽ, B:���, S:��Ƽ����, W:����)
	 */
	public List<Character> getNameList(String inputData) {
		List<Character> nameList = null;
		//////////////////////// ������� ���� (1) ---------------->		
		nameList = new ArrayList<Character>();
		HashMap<Character, Integer> nameMap = new HashMap<Character, Integer>();
		for(int i = 0; i < inputData.length(); i+=2){
			String str = inputData.substring(i, i+2);
			char[] strArr = str.toCharArray();
			int cnt = Integer.parseInt(String.valueOf(strArr[0]));
			char name = strArr[1];
			if(name != 'G'){
				int value = 0;
				if(nameMap.containsKey(name)){
					value = nameMap.get(name) + cnt;
				}else{
					value = cnt;
				}
				nameMap.put(name, value);	
			}
		}
		int maxCnt = 0;
		for(char key : nameMap.keySet()){
			int cnt = nameMap.get(key);
			if(maxCnt < cnt){
				nameList.clear();
				nameList.add(key);
				maxCnt = cnt;
			}else if(maxCnt == cnt){
				nameList.add(key);
				maxCnt = cnt;
			}
		}
		
		
		///////////////////////////// <-------------- ������� ���� (1)
		return nameList;
	}

	/**
	 * ��Ȱ��ǰ�� ����� ��� ���
	 *
	 * @param 	inputData   	String			�Էµ�����(��Ȱ��ǰ�� �Ϲݾ����� ������ ��� �ִ� ����)
	 * @return 					int				��Ȱ��ǰ�� �����
	 */
	public int getRatio(String inputData) {
		int ratio = 0;
		//////////////////////// ������� ���� (2) ---------------->
		double garbageCnt = 0;
		double recyclingCnt = 0;	
		for(int i = 0; i < inputData.length(); i+=2){
			String str = inputData.substring(i, i+2);
			char[] strArr = str.toCharArray();
			int cnt = Integer.parseInt(String.valueOf(strArr[0]));
			char name = strArr[1];
			
			if(name == 'G'){
				garbageCnt += cnt;
			}else{
				recyclingCnt += cnt;
			}
		}
		ratio = (int)(recyclingCnt / (recyclingCnt + garbageCnt) * 100);		
		///////////////////////////// <-------------- ������� ���� (2)
		return ratio;
	}

}