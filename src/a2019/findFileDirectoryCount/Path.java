package a2019.findFileDirectoryCount;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Path {
	
	/**
	 * ������ ������ ����ϴ� ���
	 * 
	 * @param 		inputData		�Է� ������ (��� ���ڿ� ���)
	 * @return		int				������ ����
	 */
	public int getNumberOfFiles( List<String> inputData ) {
		
		int numOfFiles = 0;
		
		//////////////////////������� ���� (1) ---------------->	
		
		for (String filePath : inputData) {
			if (!filePath.endsWith("/")) {
				numOfFiles ++;
			}
		}
		
		///////////////////////////// <-------------- ������� ���� (1)
		
		return numOfFiles;
	}
	
	/**
	 * ���丮�� ������ ����ϴ� ���
	 * 
	 * @param 		inputData		�Է� ������ (��� ���ڿ� ���)
	 * @return		int				���丮�� ����
	 */
	public int getNumberOfDirectories( List<String> inputData ) {
		
		int numOfDir = 0;
		
		//////////////////////������� ���� (2) ---------------->	
		
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
		
		///////////////////////////// <-------------- ������� ���� (2)
		
		return numOfDir;
	}
	
	
	public static void debug(Object o) {
		//System.out.println(o);
	}
}