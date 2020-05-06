package a2019.findOnecardGameRule;

public class OnecardRun {
	
	public static void main( String[] args ) {
		
		// ���� ������ ��Ʈ2�� �����Ϸ��� loadData���� ���� ������ ��Ʈ1�� �ּ� ó���ϰ� ���� ������ ��Ʈ2�� �ּ� �����Ͽ� ����
		String[] inputData = loadData();
		Onecard onecard = new Onecard();
		
		printInput( inputData );
		
		// 1. ī�� ���ڿ��� ��ī�� �꿡 �´��� ���θ� �Ǻ��ϴ� ���
		boolean result = onecard.isValidOnecardRule( inputData );
		printResult( result );
	}
	
	private static String[] loadData() {
		
		//////////////////////////////////
		// ���� ������ ��Ʈ 1
		/////////////////////////////////
//		String[] inputData = {
//			"S4", "H4", "D4", "D9", "H9", "H4", "H2", "S2"	
//		};
		
		//////////////////////////////////
		// ���� ������ ��Ʈ 2
		/////////////////////////////////
		String[] inputData = {
			"C5", "H5", "D2", "D6", "D3", "S3"
		};
		
		return inputData;
	}
	
	private static void printInput( String[] inputData ) {
		System.out.println( "[�ʱ� �Է� ������]" );
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
		System.out.println( "\n[��ī�� �� ���� ����]" );
		System.out.println( result );
	}
}