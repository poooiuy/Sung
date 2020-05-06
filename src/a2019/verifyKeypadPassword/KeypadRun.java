package a2019.verifyKeypadPassword;

public class KeypadRun {
	
	public static void main( String[] args ) {
		
		// ���� ������ ��Ʈ2�� �����Ϸ��� loadData���� ���� ������ ��Ʈ1�� �ּ� ó���ϰ� ���� ������ ��Ʈ2�� �ּ� �����Ͽ� ����
		String[] inputData = loadData();
		Keypad keypad = new Keypad();
		
		printTitle1();
		
		// 1. ���׼��� 2���� "��", "��"�� ��ȿ�� ���� ��Ģ�� �˻��ϴ� ���
		for ( int inx = 0; inx < 3; inx++ ) {
			boolean result = keypad.checkSimpleValidate( inputData[inx] );
			printResult( inputData[inx], result );
		}
		
		printTitle2();
		
		// 2. ���׼��� 2���� "��", "��"�� ��ȿ�� ���� ��Ģ�� �˻��ϴ� ���
		for ( int inx = 3; inx < 6; inx++ ) {
			boolean result = keypad.checkComplexValidate( inputData[inx] );
			printResult( inputData[inx], result );
		}
	}
	
	private static String[] loadData() {
		
		//////////////////////////////////
		// ���� ������ ��Ʈ 1
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
		// ���� ������ ��Ʈ 2
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
		System.out.println( "[��,�� ��ȿ�� ���� ���]" );
	}
	
	private static void printTitle2() {
		System.out.println( "------------------------------" );
		System.out.println( "[��,�� ��ȿ�� ���� ���]" );
	}
	
	private static void printResult( String input, boolean result ) {
		System.out.println( "�Է� ������ : " + input );
		System.out.println( "��ȿ�� ���� ��� : " + result );
		System.out.println();
	}
}
