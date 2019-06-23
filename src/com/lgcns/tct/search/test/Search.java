package com.lgcns.tct.search.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Search {
	
	
	/**
	 * 유효한 검색어 목록을 추출하는 기능
	 *
     * @param		inputData		List		입력데이터(검색어 목록)
     * @return						List		유효한 검색어
	 */
	public List<String> getValidWordList(List<String> inputData) {
		List<String> validWordList = null;
		validWordList = new ArrayList<String>();
		////////////////////////여기부터 구현 (1) ---------------->
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

		
		///////////////////////////// <-------------- 여기까지 구현 (1)
		return validWordList;
	}
	
	
	/**
	 * 실시간 검색어 순위 1위를 계산하는 기능
	 *
     * @param		validWordList		List		유효한 검색어
     * @return							String		실시간 검색어 순위 1위
	 */
	public String getSearchWord(List<String> validWordList) {
		String searchWord = "";
		Map<String, Integer> map = new HashMap<>();
		////////////////////////여기부터 구현 (2) ---------------->
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
		
		
		
		///////////////////////////// <-------------- 여기까지 구현 (2)
		return searchWord;
	}	
}















