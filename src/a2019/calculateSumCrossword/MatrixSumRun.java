package a2019.calculateSumCrossword;

public class MatrixSumRun {
	
	public static void main( String[] args ) {
		
		// 제공 데이터 세트2를 실행하려면 loadData에서 제공 데이터 세트1을 주석 처리하고 제공 데이터 세트2를 주석 해제하여 실행
		int[][] inputData = loadData();
		MatrixSum matrix = new MatrixSum();
		
		printInput( inputData );
		
		// 1. 가로(행)의 합을 추가하는 기능
		int[][] summedData = matrix.getHorizontalSum( inputData );
		printHorizontalData( summedData );
		
		// 2. 중앙 열을 기준으로 좌우 교환한 후, 세로(열)의 합을 추가하는 기능
		int[][] resultData = matrix.getVerticalSum( summedData );
		printVerticalData( resultData );
	}
	
	private static int[][] loadData() {
		
		//////////////////////////////////
		// 제공 데이터 세트 1
		/////////////////////////////////
//		int[][] inputData = {
//				{ 10, 20, 30 },
//				{ 40, 50, 60 },
//				{ 70, 80, 90 }
//		};
		
		//////////////////////////////////
		// 제공 데이터 세트 2
		/////////////////////////////////
		int[][] inputData = {
				{ 82, 69, 46, 20,  5, 74 },
				{ 98, 40, 21, 34, 29, 21 },
				{ 59, 99, 50, 39, 33, 76 },
				{ 14, 14,  7, 67, 24,  5 },
				{ 98,  9, 46, 21, 49, 50 },
				{ 24, 19, 37, 11, 35, 66 },
				{ 11, 30, 87,  5, 59, 78 },
				{ 28, 95, 29, 79, 35, 99 },
				{ 23, 21, 79, 74, 80, 41 },
				{ 84, 18, 36, 83, 27, 20 }
		};
		
		return inputData;
	}
	
	private static void printInput( int[][] inputData ) {
		System.out.println( "[입력 2차원 배열 크기 (행,열)]" );
		System.out.println( inputData.length + ", " + inputData[0].length );
		System.out.println();
		System.out.println( "[초기 입력 데이터]" );
		for ( int[] row : inputData ) {
			for ( int data : row ) {
				System.out.print( data + "\t");
			}
			System.out.println();
		}
	}
	
	private static void printHorizontalData( int[][] summedData ) {
		System.out.println( "\n[가로(행)의 합을 추가 결과]" );
		for ( int[] row : summedData ) {
			for ( int data : row ) {
				System.out.print( data + "\t" );
			}
			System.out.println();
		}
	}
	
	private static void printVerticalData( int[][] resultData ) {
		System.out.println( "\n[중앙 열을 기준으로 좌우 교환한 후, 세로(열)의 합 추가 결과]" );
		for ( int[] row : resultData ) {
			for ( int data : row ) {
				System.out.print( data + "\t" );
			}
			System.out.println();
		}
	}
}