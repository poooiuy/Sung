package a2019.findFileDirectoryCount;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Path {
	
	/**
	 * 파일의 개수를 계산하는 기능
	 * 
	 * @param 		inputData		입력 데이터 (경로 문자열 목록)
	 * @return		int				파일의 개수
	 */
	public int getNumberOfFiles( List<String> inputData ) {
		
		int numOfFiles = 0;
		
		//////////////////////여기부터 구현 (1) ---------------->	
		
		for (String filePath : inputData) {
			if (!filePath.endsWith("/")) {
				numOfFiles ++;
			}
		}
		
		///////////////////////////// <-------------- 여기까지 구현 (1)
		
		return numOfFiles;
	}
	
	/**
	 * 디렉토리의 개수를 계산하는 기능
	 * 
	 * @param 		inputData		입력 데이터 (경로 문자열 목록)
	 * @return		int				디렉토리의 개수
	 */
	public int getNumberOfDirectories( List<String> inputData ) {
		
		int numOfDir = 0;
		
		//////////////////////여기부터 구현 (2) ---------------->	
		
		Set<String> dirSet = new HashSet<String>();
		
		
		for (String path : inputData) {
			
			debug(path);
			
			while (path.indexOf('/')>=0) {
				path = path.substring(0, path.lastIndexOf('/'));
				dirSet.add(path);
				debug (String.format ("\t %s",path));
			}
		}
		
		for(String s : dirSet) {
			debug (">" + s);
		}
		
		
		numOfDir = dirSet.size();
		
		///////////////////////////// <-------------- 여기까지 구현 (2)
		
		return numOfDir;
	}
	
	
	public static void debug(Object o) {
		//System.out.println(o);
	}
}