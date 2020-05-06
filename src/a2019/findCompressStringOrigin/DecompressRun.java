package a2019.findCompressStringOrigin;

public class DecompressRun {
	
	public static void main( String[] args ) {
		
		// 제공 데이터 세트2를 실행하려면 loadData에서 제공 데이터 1을 주석 처리하고 제공 데이터 2를 주석 해제하여 실행
		String inputData = loadData();
		
		Decompress decompress = new Decompress();
		
		printInput( inputData );
		
		// 1. 입력된 문자열의 압축 해제하기
		String result = decompress.decompress( inputData );
		printResult( result );
	}
	
	private static String loadData() {
		
		//////////////////////////////////
		// 제공 데이터 1
		/////////////////////////////////
//		String inputData = "a3b4c5";
		
		//////////////////////////////////
		// 제공 데이터 2
		/////////////////////////////////
		String inputData = "ab4cd3";
		
		return inputData;
	}
	
	private static void printInput( String inputData ) {
		System.out.println( "[초기 입력 데이터] " + inputData );
	}
	
	private static void printResult( String result ) {
		System.out.println( "[압축 해제 결과] " + result );
	}
}