package com.lgcns.tct.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Search {
	
	
	/**
	 * ��ȿ�� �˻��� ����� �����ϴ� ���
	 *
     * @param		inputData		List		�Էµ�����(�˻��� ���)
     * @return						List		��ȿ�� �˻���
	 */
	public List<String> getValidWordList(List<String> inputData) {
		List<String> validWordList = null;
		validWordList = new ArrayList<String>();
		////////////////////////������� ���� (1) ---------------->
		
		for(String a: inputData){
			boolean chk = true;
			for(int i=0; i<a.length();i++){
				char t = a.charAt(i);
				
				if(Character.isDigit(t)){
					chk = false;
					break;
				}
			}
			if(chk){
				validWordList.add(a);
			}
		}
		
		///////////////////////////// <-------------- ������� ���� (1)
		return validWordList;
	}
	
	
	/**
	 * �ǽð� �˻��� ���� 1���� ����ϴ� ���
	 *
     * @param		validWordList		List		��ȿ�� �˻���
     * @return							String		�ǽð� �˻��� ���� 1��
	 */
	public String getSearchWord(List<String> validWordList) {
		String searchWord = "";
		////////////////////////������� ���� (2) ---------------->
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String str: validWordList){
			String key = str.toUpperCase();
			if(map.containsKey(key)){
				int cnt = map.get(key);
				map.put(key,  ++cnt);
					
			}
			else{
				map.put(key,1);
			}
		}
		
		int max = 0;
		for(String keyStr : map.keySet()){
			int cnt = map.get(keyStr);
			if(cnt > max){
				max = cnt;
				searchWord = keyStr;
			}
		}
		
		
		
		
		///////////////////////////// <-------------- ������� ���� (2)
		return searchWord;
	}	
}















