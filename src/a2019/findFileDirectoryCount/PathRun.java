package a2019.findFileDirectoryCount;

import java.util.Arrays;
import java.util.List;

public class PathRun {
	
	public static void main( String[] args ) {
		
		// 제공 데이터 세트2를 실행하려면 loadData에서 제공 데이터 1을 주석 처리하고 제공 데이터 2를 주석 해제하여 실행
		List<String> inputData = loadData();
		
		Path path = new Path();
		
		printInput( inputData );
		
		// 1. 파일의 개수 계산
		int numOfFiles = path.getNumberOfFiles( inputData );
		printNumberOfFiles( numOfFiles );
		
		// 2. 디렉토리의 개수 계산
		int numOfDir = path.getNumberOfDirectories( inputData );
		printNumberOfDirectories( numOfDir );
	}
	
	private static List<String> loadData() {
		
		//////////////////////////////////
		// 제공 데이터 1
		/////////////////////////////////
//		List<String> inputData = Arrays.asList(
//				"A/B/C/A.TXT",
//				"A/CC/D/",
//				"A/DD/E.TXT",
//				"A/CC/README",
//				"A/DD/LL/"
//		);
		
		//////////////////////////////////
		// 제공 데이터 2
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
		System.out.println( "[초기 입력 데이터]" );
		for ( String path : inputData ) {
			System.out.println( path );
		}
		printLine();
	}
	
	private static void printNumberOfFiles( int numOfFiles ) {
		System.out.println( "[파일의 개수] " + numOfFiles + "개" );
		printLine();
	}
	
	private static void printNumberOfDirectories( int numOfDir ) {
		System.out.println( "[디렉토리의 개수] " + numOfDir + "개" );
		printLine();
	}
	
	private static void printLine() {
		System.out.println( "------------------------------" );
	}
}