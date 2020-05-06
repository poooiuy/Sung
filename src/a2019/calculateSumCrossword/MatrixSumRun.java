package a2019.calculateSumCrossword;

public class MatrixSumRun {
	
	public static void main( String[] args ) {
		
		// ���� ������ ��Ʈ2�� �����Ϸ��� loadData���� ���� ������ ��Ʈ1�� �ּ� ó���ϰ� ���� ������ ��Ʈ2�� �ּ� �����Ͽ� ����
		int[][] inputData = loadData();
		MatrixSum matrix = new MatrixSum();
		
		printInput( inputData );
		
		// 1. ����(��)�� ���� �߰��ϴ� ���
		int[][] summedData = matrix.getHorizontalSum( inputData );
		printHorizontalData( summedData );
		
		// 2. �߾� ���� �������� �¿� ��ȯ�� ��, ����(��)�� ���� �߰��ϴ� ���
		int[][] resultData = matrix.getVerticalSum( summedData );
		printVerticalData( resultData );
	}
	
	private static int[][] loadData() {
		
		//////////////////////////////////
		// ���� ������ ��Ʈ 1
		/////////////////////////////////
//		int[][] inputData = {
//				{ 10, 20, 30 },
//				{ 40, 50, 60 },
//				{ 70, 80, 90 }
//		};
		
		//////////////////////////////////
		// ���� ������ ��Ʈ 2
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
		System.out.println( "[�Է� 2���� �迭 ũ�� (��,��)]" );
		System.out.println( inputData.length + ", " + inputData[0].length );
		System.out.println();
		System.out.println( "[�ʱ� �Է� ������]" );
		for ( int[] row : inputData ) {
			for ( int data : row ) {
				System.out.print( data + "\t");
			}
			System.out.println();
		}
	}
	
	private static void printHorizontalData( int[][] summedData ) {
		System.out.println( "\n[����(��)�� ���� �߰� ���]" );
		for ( int[] row : summedData ) {
			for ( int data : row ) {
				System.out.print( data + "\t" );
			}
			System.out.println();
		}
	}
	
	private static void printVerticalData( int[][] resultData ) {
		System.out.println( "\n[�߾� ���� �������� �¿� ��ȯ�� ��, ����(��)�� �� �߰� ���]" );
		for ( int[] row : resultData ) {
			for ( int data : row ) {
				System.out.print( data + "\t" );
			}
			System.out.println();
		}
	}
}