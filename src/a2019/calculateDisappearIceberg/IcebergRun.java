package a2019.calculateDisappearIceberg;


public class IcebergRun {
	
	public static void main( String[] args ) {
		
		// ���� ������ ��Ʈ2�� �����Ϸ��� loadData���� ���� ������ 1�� �ּ� ó���ϰ� ���� ������ 2�� �ּ� �����Ͽ� ����
		int[][] icebergMap = loadData();
		
		Iceberg ice = new Iceberg();
		
		printInput( icebergMap );
		
		// 1. ���� �������� ���� ���� �����ϱ�
		int[][] innerMap = ice.convertInnerWater( icebergMap );
		printInnerWaterMap( innerMap );
		
		// 2. �� �� �� ������ ��� ��������� ���ϱ�
		int collYear = ice.getCollapseYear( icebergMap );
		printCollapseYear( collYear );
	}
	
	private static int[][] loadData() {
		
		//////////////////////////////////
		// ���� ������ 1
		/////////////////////////////////
//		int[][] icebergMap = new int[][] {
//			new int[] { 0, 0, 0, 0 },
//			new int[] { 0, 0, 4, 0 },
//			new int[] { 0, 4, 0, 4 },
//			new int[] { 0, 4, 0, 4 },
//			new int[] { 0, 4, 4, 4 },
//			new int[] { 0, 0, 0, 0 }
//		};
		
		//////////////////////////////////
		// ���� ������ 2
		/////////////////////////////////
		int[][] icebergMap = new int[][] {
			new int[] { 0, 0, 0, 0, 4, 4 },
			new int[] { 0, 0, 0, 4, 0, 4 },
			new int[] { 0, 4, 4, 0, 4, 4 },
			new int[] { 0, 4, 0, 0, 4, 0 },
			new int[] { 4, 4, 4, 4, 4, 0 },
			new int[] { 0, 4, 0, 0, 0, 0 }
		};
		
		return icebergMap;
	}
	
	private static void printInput( int[][] icebergMap ) {
		System.out.println( "---------------- �ʱ� �Է� ������ ----------------" );
		System.out.println( "[����]" );
		for ( int[] row : icebergMap ) {
			for ( int data : row ) {
				System.out.print( data + " ");
			}
			System.out.println();
		}
		printLine();
	}
	
	private static void printInnerWaterMap( int[][] innerMap ) {
		System.out.println( "########## ���� �������� �ܺ� ���� ���� ##########" );
		for ( int[] row : innerMap ) {
			for ( int data : row ) {
				System.out.print( data + " ");
			}
			System.out.println();
		}
		printLine();
	}
	
	private static void printCollapseYear( int collYear ) {
		System.out.println( "##### �� �� �� ������ ��� ��������� ���ϱ� #####" );
		System.out.println( collYear );
		printLine();
	}
	
	private static void printLine() {
		System.out.println( "--------------------------------------------------" );
	}
}