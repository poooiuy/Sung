package com.lgcns.tct.garbage.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		
		///////////////////////////// <-------------- ������� ���� (2)
		return ratio;
	}

}