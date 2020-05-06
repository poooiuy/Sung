package a2019.verifyKeypadPassword;

public class KeypadRun {
	
	public static void main( String[] args ) {
		
		// 제공 데이터 세트2를 실행하려면 loadData에서 제공 데이터 세트1을 주석 처리하고 제공 데이터 세트2를 주석 해제하여 실행
		String[] inputData = loadData();
		Keypad keypad = new Keypad();
		
		printTitle1();
		
		// 1. 문항설명 2번의 "가", "나"의 유효성 검증 규칙을 검사하는 기능
		for ( int inx = 0; inx < 3; inx++ ) {
			boolean result = keypad.checkSimpleValidate( inputData[inx] );
			printResult( inputData[inx], result );
		}
		
		printTitle2();
		
		// 2. 문항설명 2번의 "다", "라"의 유효성 검증 규칙을 검사하는 기능
		for ( int inx = 3; inx < 6; inx++ ) {
			boolean result = keypad.checkComplexValidate( inputData[inx] );
			printResult( inputData[inx], result );
		}
	}
	
	private static String[] loadData() {
		
		//////////////////////////////////
		// 제공 데이터 세트 1
		/////////////////////////////////
//		String[] inputData = {
//			"1234567890*",
//			"12345",
//			"135135135",
//			"2688812",
//			"6482917350",
//			"262610912"
//		};
		
		//////////////////////////////////
		// 제공 데이터 세트 2
		/////////////////////////////////
		String[] inputData = {
			"59341864",
			"1234567890123456",
			"2753312",
			"2613213212",
			"12459865",
			"137988137988"
		};
		
		return inputData;
	}
	
	private static void printTitle1() {
		System.out.println( "------------------------------" );
		System.out.println( "[가,나 유효성 검증 결과]" );
	}
	
	private static void printTitle2() {
		System.out.println( "------------------------------" );
		System.out.println( "[다,라 유효성 검증 결과]" );
	}
	
	private static void printResult( String input, boolean result ) {
		System.out.println( "입력 데이터 : " + input );
		System.out.println( "유효성 검증 결과 : " + result );
		System.out.println();
	}
}
