package com.lgcns.tct.category;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Category {
	/**
	 * ���� ī�װ��� �˻��ϴ� ���
	 *
     * @param		inputData		String[][]		�Էµ�����(ī�װ� ����)
     * @param		categories		List			�Էµ�����(inputCategories[0]: ī�װ�1, inputCategories[1]: ī�װ�2)
     * @return						String 			���� ī�װ�
	 */
	public String getTopCategory(String[][] inputData, List<String> categories) {
		String topCategory = "";
		////////////////////////������� ���� (1) ---------------->
		Map<String, List<String>> tMap = makeMap(inputData);		
		
		List<String> hierarchy_1 = new ArrayList<String>();
		List<String> hierarchy_2 = new ArrayList<String>();
		
		for(int i=0; i<categories.size();i++){
			for (String key : tMap.keySet()) {
				List<String> values = tMap.get(key);
				if (values.contains(categories.get(i))) {					
				    if(i == 0)
					  hierarchy_1.add(key);
				    else
				      hierarchy_2.add(key);
	
					String parent = getParent(tMap, key);
					while (!parent.isEmpty()) {
						if(i==0)
						  hierarchy_1.add(0, parent);
						else
						  hierarchy_2.add(0, parent);	
						parent = getParent(tMap, parent);
					}
				}
		    }
		}	
		
		for(String tParent:hierarchy_2){
			for(int j=0;j<hierarchy_1.size();j++){
				String oParent = hierarchy_1.get(j);
				if ( oParent.equals(tParent) ) {
					topCategory = hierarchy_1.get(j);
					break;
				}
			}
		}	
		
		
		///////////////////////////// <-------------- ������� ���� (1)
		return topCategory;
	}
	

	
	/**
	 * ���� ī�װ��� ������ ����ϴ� ���
	 *
     * @param		inputData		String[][]		�Էµ�����(ī�װ� ����)
     * @param		categoryStr		String			�Էµ�����(ī�װ�)
     * @return						int 			���� ī�װ��� ����
	 */
	public int getNumberOfSubcategories(String[][] inputData, String categoryStr) {
		int numberOfSubcategories = 0;
		////////////////////////������� ���� (2) ---------------->
		Map<String, List<String>> tMap = makeMap(inputData);
		System.out.println(tMap);
		Queue<String> cnt = new LinkedList<>();

		String parent = getParent(tMap, categoryStr);
		List<String> values = tMap.get(parent);
							
		for (String v1 : values) {
			cnt.offer(v1);
		}

		while (!cnt.isEmpty()) {
			String res = cnt.poll();
			numberOfSubcategories++;

			if (tMap.containsKey(res)) {
				values = tMap.get(res);

				for (String v1 : values) {
					cnt.offer(v1);
				}
			}
		}

		///////////////////////////// <-------------- ������� ���� (2)
		return numberOfSubcategories;
	}
	
	public String getParent(Map<String, List<String>> tMap, String child){
		String parent = "";
		
		for(String key:tMap.keySet()){
			List<String> values = tMap.get(key);
			if ( values.contains(child) ) {
				parent = key;
				break;
			}
		}
		
		return parent;
	}
	
	
	public List<String> getChlids(Map<String, List<String>> tMap, String parent){
		List<String> childs = new ArrayList<String>();
		
		if ( tMap.containsKey(parent) ) {
			childs = tMap.get(parent);
		}
		
		return childs;
	}
	
	
	private Map<String, List<String>> makeMap(String [][]inputData){
		Map<String, List<String>> tMap = new LinkedHashMap<String, List<String>>();
		
		for(int i=0;i<inputData.length;i++){
			String parent = inputData[i][0];
			String child = inputData[i][1];
			
			if ( tMap.containsKey(parent) ) {
				List<String> childs = tMap.get(parent);
				childs.add(child);
				
				tMap.put(parent, childs);
			} else {
				List<String> childs = new ArrayList<String>();
				childs.add(child);
				
				tMap.put(parent, childs);
				
			}
		}
		return tMap;
	}
	
}
