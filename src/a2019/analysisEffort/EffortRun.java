package a2019.analysisEffort;


import java.util.Arrays;
import java.util.List;

public class EffortRun {
	
	public static void main( String[] args ) {
		
		// 제공 데이터 세트2를 실행하려면 loadData에서 제공 데이터 1을 주석 처리하고 제공 데이터 2를 주석 해제하여 실행
		List<List<String>> monthWorkInfo = loadData();
		
		Effort effort = new Effort();
		
		// 1. 휴일 업무 시간 구하기
		int offDayWork = effort.getOffDayWork( monthWorkInfo );
		printOffDayWork( offDayWork );
		
		// 2. 해당 월의 인정 M/M 구하기
		double manMonth = effort.getManMonth( monthWorkInfo );
		printManMonth( manMonth );
	}
	
	private static List<List<String>> loadData() {
		
		//////////////////////////////////
		// 제공 데이터 1
		/////////////////////////////////
//		List<List<String>> monthWorkInfo = Arrays.asList(
//				Arrays.asList( "1", "Y", "09:00", "11:00", "11:30", "14:01" ),
//				Arrays.asList( "2", "Y", "08:30", "11:30", "13:00", "16:00", "17:00", "20:00" ),
//				Arrays.asList( "3", "Y", "07:25", "18:00" ),
//				Arrays.asList( "4", "N", "09:29", "11:30", "12:29", "19:30" ),
//				Arrays.asList( "5", "N" ),
//				Arrays.asList( "6", "Y", "09:00", "12:00", "13:00", "18:00" ),
//				Arrays.asList( "7", "Y", "09:00", "12:00", "13:00", "18:00" ),
//				Arrays.asList( "8", "Y", "09:00", "12:00", "13:00", "18:00" ),
//				Arrays.asList( "9", "Y", "09:00", "12:00", "13:00", "15:00" ),
//				Arrays.asList( "10", "Y" ),
//				Arrays.asList( "11", "N" ),
//				Arrays.asList( "12", "N" ),
//				Arrays.asList( "13", "N" ),
//				Arrays.asList( "14", "N" ),
//				Arrays.asList( "15", "N" ),
//				Arrays.asList( "16", "Y" ),
//				Arrays.asList( "17", "Y" ),
//				Arrays.asList( "18", "N" ),
//				Arrays.asList( "19", "N" ),
//				Arrays.asList( "20", "Y", "14:00", "18:00" ),
//				Arrays.asList( "21", "Y", "14:00", "18:00" ),
//				Arrays.asList( "22", "Y", "09:00", "12:00", "13:00", "15:00" ),
//				Arrays.asList( "23", "Y", "09:00", "12:00", "13:00", "18:00" ),
//				Arrays.asList( "24", "Y", "09:00", "12:00", "13:00", "18:00" ),
//				Arrays.asList( "25", "N" ),
//				Arrays.asList( "26", "N" ),
//				Arrays.asList( "27", "Y", "09:00", "12:00", "13:00", "18:00" ),
//				Arrays.asList( "28", "Y", "09:00", "12:00", "13:00", "18:00" ),
//				Arrays.asList( "29", "Y", "09:00", "12:00", "13:00", "18:00" )
//		);
		
		//////////////////////////////////
		// 제공 데이터 2
		/////////////////////////////////
		List<List<String>> monthWorkInfo = Arrays.asList(
				Arrays.asList( "1", "Y", "09:00", "12:00", "13:00", "18:00" ),
				Arrays.asList( "2", "Y", "09:00", "12:00", "13:00", "18:00" ),
				Arrays.asList( "3", "Y", "09:00", "12:00", "13:00", "18:00" ),
				Arrays.asList( "4", "N" ),
				Arrays.asList( "5", "N" ),
				Arrays.asList( "6", "Y", "09:00", "12:00", "13:00", "18:00" ),
				Arrays.asList( "7", "Y", "09:00", "12:00", "13:00", "18:00" ),
				Arrays.asList( "8", "N" ),
				Arrays.asList( "9", "Y", "09:00", "12:00", "13:00", "18:00" ),
				Arrays.asList( "10", "Y", "09:00", "12:00", "13:00", "18:00" ),
				Arrays.asList( "11", "N" ),
				Arrays.asList( "12", "N" ),
				Arrays.asList( "13", "Y", "09:00", "12:00", "13:00", "18:00" ),
				Arrays.asList( "14", "N" ),
				Arrays.asList( "15", "Y", "09:00", "12:00", "13:00", "18:00" ),
				Arrays.asList( "16", "N" ),
				Arrays.asList( "17", "Y", "09:00", "12:00", "13:00", "18:00" ),
				Arrays.asList( "18", "N" ),
				Arrays.asList( "19", "N" ),
				Arrays.asList( "20", "Y", "09:30", "17:30" ),
				Arrays.asList( "21", "Y", "09:30", "17:30" ),
				Arrays.asList( "22", "Y", "09:30", "17:30" ),
				Arrays.asList( "23", "Y", "09:30", "17:30" ),
				Arrays.asList( "24", "Y", "09:30", "17:30" ),
				Arrays.asList( "25", "N", "09:00", "11:00" ),
				Arrays.asList( "26", "N", "09:00", "12:00" ),
				Arrays.asList( "27", "Y", "09:00", "12:00", "13:00", "18:00" ),
				Arrays.asList( "28", "Y", "09:00", "12:00", "13:00", "18:00" ),
				Arrays.asList( "29", "Y", "09:00", "12:00", "13:00", "18:00" )
		);
		
		return monthWorkInfo;
	}
	
	private static void printOffDayWork( int offDayWork ) {
		System.out.println( "[휴일 근로시간]" );
		System.out.println( offDayWork + "분" );
		System.out.println( "--------------------" );
	}
	
	private static void printManMonth( double manMonth ) {
		System.out.println( "[인정 M/M]" );
		System.out.println( manMonth );
	}
}