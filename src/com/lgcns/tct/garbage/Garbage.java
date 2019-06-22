package com.lgcns.tct.garbage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
		///////////////////////////// <-------------- 여기까지 구현 (2)
		return ratio;
	}

}