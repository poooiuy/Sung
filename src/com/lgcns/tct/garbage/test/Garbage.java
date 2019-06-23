package com.lgcns.tct.garbage.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Garbage {

	/**
	 * 가장 많이 수거된 재활용품의 종류 검색 기능
	 *
	 * @param 	inputData   	String			입력데이터(재활용품과 일반쓰레기 정보를 담고 있는 정보)
	 * @return 					List			가장 많이 수거된 재활용품 (P:플라스틱, B:비닐, S:스티로폼, W:종이)
	 */
	public List<Character> getNameList(String inputData) {
		List<Character> nameList = null;
		//////////////////////// 여기부터 구현 (1) ---------------->		
		nameList = new ArrayList<>();
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<inputData.length(); i+=2) {
			String tmp = inputData.substring(i, i+2);
			String a = tmp.substring(1,2);
			if(!a.equals("G")) {
				int b = Integer.parseInt(tmp.substring(0,1));
				if(map.containsKey(a)) {
					map.put(a, map.get(a)+ b);
				}else {
					map.put(a, b);
				}
			}
		}
		
		Set<String> keySet = map.keySet();
		int max = 0;
		List<String> item = new ArrayList<>();
		for(String key : keySet) {
			if(map.get(key) > max ) {
				max = map.get(key);
				item.clear();
				item.add(key);
			}else if(map.get(key) == max ){
				item.add(key);
			}
		}
		
		for(String str : item) {
			nameList.add(str.charAt(0));
		}
		
		///////////////////////////// <-------------- 여기까지 구현 (1)
		return nameList;
	}

	/**
	 * 재활용품의 백분율 계산 기능
	 *
	 * @param 	inputData   	String			입력데이터(재활용품과 일반쓰레기 정보를 담고 있는 정보)
	 * @return 					int				재활용품의 백분율
	 */
	public int getRatio(String inputData) {
		int ratio = 0;
		//////////////////////// 여기부터 구현 (2) ---------------->
		int reuse = 0;
		int normal = 0;
		
		for(int i=0; i<inputData.length(); i+=2) {
			String tmp = inputData.substring(i, i+2);
			String a = tmp.substring(1,2);
			int b = Integer.parseInt(tmp.substring(0,1));
			if(!a.equals("G")) {
				reuse = reuse + b;
			}else {
				normal = normal + b;
			}
		}
		
		ratio = (int) (reuse * 100 / (reuse + normal));
		
		///////////////////////////// <-------------- 여기까지 구현 (2)
		return ratio;
	}

}