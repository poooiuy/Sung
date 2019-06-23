package com.lgcns.tct.search.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		for(String str : inputData) {
			int index = 0;
			for(int i=0; i<str.length(); i++){
				String tmp = str.charAt(i)+"";
				try {
					Integer.parseInt(tmp);
					index = 1;
				}catch(Exception e) {
				}
			}
			if(index != 1) {
				validWordList.add(str);
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
		Map<String, Integer> map = new HashMap<>();
		////////////////////////������� ���� (2) ---------------->
		for(String str : validWordList) {
			str = str.toUpperCase();
			int count = 0;
			if(map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			}else {
				map.put(str, 1);
			}
		}
		
		Set<String> keySet = map.keySet();
		int max = 0;
		String top = "";
		for(String key : keySet) {
			if(top.equals("")) {
				max = map.get(key);
				top = key;
			}else {
				if(map.get(key) > max) {
					max = map.get(key);
					top = key;
				}
			}
			
		}

		searchWord = top;
		
		
		
		///////////////////////////// <-------------- ������� ���� (2)
		return searchWord;
	}	
}















