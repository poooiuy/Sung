package a2019.findOnecardGameRule;

public class OnecardRun {
	
	public static void main( String[] args ) {
		
		// 제공 데이터 세트2를 실행하려면 loadData에서 제공 데이터 세트1을 주석 처리하고 제공 데이터 세트2를 주석 해제하여 실행
		String[] inputData = loadData();
		Onecard onecard = new Onecard();
		
		printInput( inputData );
		
		// 1. 카드 문자열이 원카드 룰에 맞는지 여부를 판별하는 기능
		boolean result = onecard.isValidOnecardRule( inputData );
		printResult( result );
	}
	
	private static String[] loadData() {
		
		//////////////////////////////////
		// 제공 데이터 세트 1
		/////////////////////////////////
//		String[] inputData = {
//			"S4", "H4", "D4", "D9", "H9", "H4", "H2", "S2"	
//		};
		
		//////////////////////////////////
		// 제공 데이터 세트 2
		/////////////////////////////////
		String[] inputData = {
			"C5", "H5", "D2", "D6", "D3", "S3"
		};
		
		return inputData;
	}
	
	private static void printInput( String[] inputData ) {
		System.out.println( "[초기 입력 데이터]" );
		System.out.print( "[" );
		for ( int inx = 0; inx < inputData.length; inx++ ) {
			System.out.print( "\"" + inputData[inx] + "\"" );
			if ( inx < inputData.length - 1 ) {
				System.out.print( ", " );
			}
		}
		System.out.println( "]" );
	}
	
	private static void printResult( boolean result ) {
		System.out.println( "\n[원카드 룰 적합 여부]" );
		System.out.println( result );
	}
}