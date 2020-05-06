package a2019.findFileDirectoryCount;

import java.util.Arrays;
import java.util.List;

public class PathRun {
	
	public static void main( String[] args ) {
		
		// ���� ������ ��Ʈ2�� �����Ϸ��� loadData���� ���� ������ 1�� �ּ� ó���ϰ� ���� ������ 2�� �ּ� �����Ͽ� ����
		List<String> inputData = loadData();
		
		Path path = new Path();
		
		printInput( inputData );
		
		// 1. ������ ���� ���
		int numOfFiles = path.getNumberOfFiles( inputData );
		printNumberOfFiles( numOfFiles );
		
		// 2. ���丮�� ���� ���
		int numOfDir = path.getNumberOfDirectories( inputData );
		printNumberOfDirectories( numOfDir );
	}
	
	private static List<String> loadData() {
		
		//////////////////////////////////
		// ���� ������ 1
		/////////////////////////////////
//		List<String> inputData = Arrays.asList(
//				"A/B/C/A.TXT",
//				"A/CC/D/",
//				"A/DD/E.TXT",
//				"A/CC/README",
//				"A/DD/LL/"
//		);
		
		//////////////////////////////////
		// ���� ������ 2
		/////////////////////////////////
		List<String> inputData = Arrays.asList(
				"BB/HELP/DIC/",
				"BB/CC/D/",
				"BB/DD/T.PNG",
				"BB/CC/O.PNG",
				"BB/DD/BB/HELP",
				"BB/DD/BB/CC.EXE",
				"BB/BB/BB/"
		);
		
		return inputData;
	}
	
	private static void printInput( List<String> inputData ) {
		System.out.println( "[�ʱ� �Է� ������]" );
		for ( String path : inputData ) {
			System.out.println( path );
		}
		printLine();
	}
	
	private static void printNumberOfFiles( int numOfFiles ) {
		System.out.println( "[������ ����] " + numOfFiles + "��" );
		printLine();
	}
	
	private static void printNumberOfDirectories( int numOfDir ) {
		System.out.println( "[���丮�� ����] " + numOfDir + "��" );
		printLine();
	}
	
	private static void printLine() {
		System.out.println( "------------------------------" );
	}
}