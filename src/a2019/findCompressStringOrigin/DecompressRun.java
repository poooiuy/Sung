package a2019.findCompressStringOrigin;

public class DecompressRun {
	
	public static void main( String[] args ) {
		
		// ���� ������ ��Ʈ2�� �����Ϸ��� loadData���� ���� ������ 1�� �ּ� ó���ϰ� ���� ������ 2�� �ּ� �����Ͽ� ����
		String inputData = loadData();
		
		Decompress decompress = new Decompress();
		
		printInput( inputData );
		
		// 1. �Էµ� ���ڿ��� ���� �����ϱ�
		String result = decompress.decompress( inputData );
		printResult( result );
	}
	
	private static String loadData() {
		
		//////////////////////////////////
		// ���� ������ 1
		/////////////////////////////////
//		String inputData = "a3b4c5";
		
		//////////////////////////////////
		// ���� ������ 2
		/////////////////////////////////
		String inputData = "ab4cd3";
		
		return inputData;
	}
	
	private static void printInput( String inputData ) {
		System.out.println( "[�ʱ� �Է� ������] " + inputData );
	}
	
	private static void printResult( String result ) {
		System.out.println( "[���� ���� ���] " + result );
	}
}