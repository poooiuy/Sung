package a2019.analysisEffort;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class Effort {

	private static final DateFormat df = new SimpleDateFormat("HH:mm");

	/**
	 * 휴일 업무 시간을 구하는 기능
	 * 
	 * @param monthWorkInfo
	 *            월의 근무 정보
	 * @return int 휴일 업무시간(분)
	 */
	public int getOffDayWork(List<List<String>> monthWorkInfo) {

		int offDayWork = 0;

		////////////////////// 여기부터 구현 (1) ---------------->
		for (List<String> dayWorks : monthWorkInfo) {
			boolean isWorkingDay = dayWorks.get(1).equals("Y");
			if (!isWorkingDay) {
				offDayWork += calDailyWork(dayWorks);
			}
		}

		///////////////////////////// <-------------- 여기까지 구현 (1)

		return offDayWork;
	}
	
	/**
	 * 일자별 근무시간을 산출한다. 
	 * @param dayWorks
	 * @return
	 */
	private int calDailyWork(List<String> dayWorks) {
		long from = 0;
		String fromStr = "";
		int dayWorkingMin = 0;
		for (int i = 2; i < dayWorks.size(); i++) {
			String time = dayWorks.get(i);
			if (i % 2 == 0) {
				fromStr = time;
				from = toTime(time);
			} else {
				long to = toTime(time);
				dayWorkingMin += (int)((to - from) / 1000 / 60);
				debug (String.format("%s - %s : %d", time,fromStr, (to - from) / 1000 / 60));
			}
		}
		return dayWorkingMin;
	}

	private static long toTime(String time) {
		try {
			return df.parse(time).getTime();
		} catch (ParseException e) {
			return 0;
		}
	}
	
	

	/**
	 * 해당 월의 인정 M/M을 구하는 기능
	 * 
	 * @param monthWorkInfo
	 *            월의 근무 정보
	 * @return double 인정 M/M(소수점 3번째 자리에서 반올림)
	 */
	public double getManMonth(List<List<String>> monthWorkInfo) {

		double manMonth = 0.0;

		////////////////////// 여기부터 구현 (2) ---------------->
		int workingDay = 0;
		double monthWorks = 0.0;
		for (List<String> dayWorks : monthWorkInfo) {
			
			if (dayWorks.get(1).equals("Y")) {
				workingDay ++;
			} else {
				continue;
			}
			
			int dayTimes = calDailyWork(dayWorks);
			double dayMM = 0;
			
			if (dayTimes < 4 * 60) {

			} else if (dayTimes < 8 *60) {
				dayMM = 0.5;
			} else {
				dayMM = 1.0;
			}
			
			
			debug ( String.format(" %2s %s %.1f %4d", dayWorks.get(0), dayWorks.get(1), dayMM , dayTimes));
			
			monthWorks += dayMM;
		}
		
		debug ( String.format(" %.1f %d %.2f", monthWorks, workingDay, monthWorks / workingDay));
		manMonth = monthWorks / workingDay;
		
		manMonth = Math.round(manMonth * 100.0) / 100.0; 
		
		///////////////////////////// <-------------- 여기까지 구현 (2)

		return manMonth;
	}

	private static void debug(Object o) {
		//System.out.println(o);
	}
}