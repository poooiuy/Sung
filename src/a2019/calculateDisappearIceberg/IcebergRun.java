package a2019.calculateDisappearIceberg;


public class IcebergRun {
	
	public static void main( String[] args ) {
		
		// 제공 데이터 세트2를 실행하려면 loadData에서 제공 데이터 1을 주석 처리하고 제공 데이터 2를 주석 해제하여 실행
		int[][] icebergMap = loadData();
		
		Iceberg ice = new Iceberg();
		
		printInput( icebergMap );
		
		// 1. 현재 지도에서 내부 물을 구분하기
		int[][] innerMap = ice.convertInnerWater( icebergMap );
		printInnerWaterMap( innerMap );
		
		// 2. 몇 년 후 빙산이 모두 사라지는지 구하기
		int collYear = ice.getCollapseYear( icebergMap );
		printCollapseYear( collYear );
	}
	
	private static int[][] loadData() {
		
		//////////////////////////////////
		// 제공 데이터 1
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
		// 제공 데이터 2
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
		System.out.println( "---------------- 초기 입력 데이터 ----------------" );
		System.out.println( "[지도]" );
		for ( int[] row : icebergMap ) {
			for ( int data : row ) {
				System.out.print( data + " ");
			}
			System.out.println();
		}
		printLine();
	}
	
	private static void printInnerWaterMap( int[][] innerMap ) {
		System.out.println( "########## 현재 지도에서 외부 물을 구분 ##########" );
		for ( int[] row : innerMap ) {
			for ( int data : row ) {
				System.out.print( data + " ");
			}
			System.out.println();
		}
		printLine();
	}
	
	private static void printCollapseYear( int collYear ) {
		System.out.println( "##### 몇 년 후 빙산이 모두 사라지는지 구하기 #####" );
		System.out.println( collYear );
		printLine();
	}
	
	private static void printLine() {
		System.out.println( "--------------------------------------------------" );
	}
}