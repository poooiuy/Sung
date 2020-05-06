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
		
		// 1. 셔틀을 타지 않고 출발지에서 도착지까지 최소 이동하는 시간(초)을 구하는 기능
		int time1 = travel.getTraveltimeWithoutShuttle( bicycle, start, destination );
		printResult1( time1 );
		
		// 2. 셔틀 탑승이 가능할 때, 출발지에서 도착지까지 최소 이동 시간(초)을 구하는 기능
		int time2 = travel.getTraveltime( bicycle, start, destination, departure );
		printResult2( time2 );
	}
	
	private static List<Object> loadData() {
		
		//////////////////////////////////
		// 제공 데이터 세트 1
		/////////////////////////////////
//		List<Object> inputData = Arrays.asList(
//				new String[] { "E2", "E5", "E7", "E10" },
//				"E2",
//				"E9"
//		);
//		departure = "12:00";
		
		//////////////////////////////////
		// 제공 데이터 세트 2
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
		System.out.println( "[입력값]" );
		System.out.print( "자전거 보관소 : " );
		for ( int inx = 0; inx < bicycle.length; inx++ ) {
			System.out.print( bicycle[inx] );
			if ( inx < bicycle.length - 1 ) {
				System.out.print( ", " );
			}
		}
		System.out.println();
		System.out.println( "출발지 : " + start );
		System.out.println( "도착지 : " + destination );
		System.out.println( "출발 시간 : " + departure );
	}
	
	private static void printResult1( int time ) {
		System.out.println( "\n[도보와 자전거 이용 최소 시간]" );
		System.out.println( time + "초" );
	}
	
	private static void printResult2( int time ) {
		System.out.println( "\n[최소시간]" );
		System.out.println( time + "초" );
	}
}