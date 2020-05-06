package a2019.getTravelTimeBetweenBuildings;

import java.util.Arrays;
import java.util.List;

public class TravelTimeRun {
	
	private static String departure = "00:00";
	
	public static void main( String[] args ) {
		
		String[] bicycle = (String[]) loadData().get(0);
		String   start   = (String) loadData().get(1);
		String   destination = (String) loadData().get(2);
		TravelTime travel = new TravelTime();
		
		printInput( bicycle, start, destination, departure);
		
		// 1. ��Ʋ�� Ÿ�� �ʰ� ��������� ���������� �ּ� �̵��ϴ� �ð�(��)�� ���ϴ� ���
		int time1 = travel.getTraveltimeWithoutShuttle( bicycle, start, destination );
		printResult1( time1 );
		
		// 2. ��Ʋ ž���� ������ ��, ��������� ���������� �ּ� �̵� �ð�(��)�� ���ϴ� ���
		int time2 = travel.getTraveltime( bicycle, start, destination, departure );
		printResult2( time2 );
	}
	
	private static List<Object> loadData() {
		
		//////////////////////////////////
		// ���� ������ ��Ʈ 1
		/////////////////////////////////
//		List<Object> inputData = Arrays.asList(
//				new String[] { "E2", "E5", "E7", "E10" },
//				"E2",
//				"E9"
//		);
//		departure = "12:00";
		
		//////////////////////////////////
		// ���� ������ ��Ʈ 2
		/////////////////////////////////
		List<Object> inputData = Arrays.asList(
				new String[] { "E1", "E4", "E7", "E10", "E12" },
				"E11",
				"E2"
		);
		departure = "13:25";
		
		return inputData;
	}
	
	private static void printInput( String[] bicycle, String start, String destination, String departure ) {
		System.out.println( "[�Է°�]" );
		System.out.print( "������ ������ : " );
		for ( int inx = 0; inx < bicycle.length; inx++ ) {
			System.out.print( bicycle[inx] );
			if ( inx < bicycle.length - 1 ) {
				System.out.print( ", " );
			}
		}
		System.out.println();
		System.out.println( "����� : " + start );
		System.out.println( "������ : " + destination );
		System.out.println( "��� �ð� : " + departure );
	}
	
	private static void printResult1( int time ) {
		System.out.println( "\n[������ ������ �̿� �ּ� �ð�]" );
		System.out.println( time + "��" );
	}
	
	private static void printResult2( int time ) {
		System.out.println( "\n[�ּҽð�]" );
		System.out.println( time + "��" );
	}
}