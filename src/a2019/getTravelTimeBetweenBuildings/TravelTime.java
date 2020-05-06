package a2019.getTravelTimeBetweenBuildings;


public class TravelTime {
	
	/**
	 * 셔틀을 타지 않고 출발지에서 도착지까지 최소 이동하는 시간(초)을 구하는 기능
	 * 
	 * @param 		bicycleStation		자전거 보관소가 있는 건물 목록
	 * @param 		start				출발지
	 * @param 		destination			도착지
	 * @return		int					셔틀을 타지 않고 최소 이동 시간
	 */
	public int getTraveltimeWithoutShuttle( String[] bicycleStation, String start, String destination ) {
		
		int traveltime = 0;
		
		////////////////////////여기부터 코딩 (1) ---------------->
		
		int startLoc = Integer.parseInt(start.substring(1));
		int endLoc = Integer.parseInt(destination.substring(1));
		traveltime = 240*Math.abs(endLoc - startLoc);
		
		//System.out.println("startLoc=E" + startLoc + " endLoc=E" + endLoc + " walkTime=" + traveltime);
		
		int bicStartLoc = startLoc;
		int startTime = Integer.MAX_VALUE;
		
		for(int i=0; i < bicycleStation.length; i++) {
			int bicLoc = Integer.parseInt(bicycleStation[i].substring(1)); 
			int tempTime = 240*Math.abs(bicLoc - startLoc);
			if( startTime > tempTime) {
				startTime = tempTime;
				bicStartLoc = bicLoc;
			}
		}
		
		//System.out.println("startTime=" + startTime + " bicStartLoc=E" + bicStartLoc);
		
		for(int i=0; i < bicycleStation.length; i++) {
			int bicLoc = Integer.parseInt(bicycleStation[i].substring(1)); 
			if( bicLoc != startLoc) {
				int bicTime = 70*Math.abs(bicLoc - bicStartLoc) + 240*Math.abs(endLoc - bicLoc) + startTime;
				if( traveltime > bicTime) {
					traveltime = bicTime;
				}
			}
		}
		
		///////////////////////////// <-------------- 여기까지 코딩 (1)
		
		return traveltime;
	}

	/**
	 * 셔틀 탑승이 가능할 때, 출발지에서 도착지까지 최소 이동 시간(초)을 구하는 기능
	 * 
	 * @param 		bicycleStation		자전거 보관소가 있는 건물 목록
	 * @param 		start				출발지
	 * @param 		destination			도착지
	 * @param 		departure			출발 시각 (HH:MM 형태)
	 * @return		int					최소 이동 시간
	 */
	public int getTraveltime( String[] bicycleStation, String start, String destination, String departure) {
		
		int traveltime = 0;
		
		////////////////////////여기부터 코딩 (2) ---------------->
		
		String[] token = departure.split(":");
		int currentHour = Integer.parseInt(token[0]);
		int currentMin = Integer.parseInt(token[1]);
		
		int startLoc = Integer.parseInt(start.substring(1));
		int endLoc = Integer.parseInt(destination.substring(1));
		traveltime = 240*Math.abs(endLoc - startLoc);

		//System.out.println("startLoc=E" + startLoc + " endLoc=E" + endLoc + " walkTime=" + traveltime );
		
		int toBusTime = 240*Math.min(Math.abs(1 - startLoc), Math.abs(12 - startLoc));
		int fromBusTime = 240*Math.min(Math.abs(1 - endLoc), Math.abs(12 - endLoc));
		
		int waitTime = 60*(10-(currentMin + (int)(toBusTime/60))%10);
		
		int busTime = 220 + toBusTime + fromBusTime + waitTime;

		//System.out.println("waitTime=" + waitTime + " toBusTime=" + toBusTime + " fromBusTime=" + fromBusTime + " busTime=" + busTime);
		
		traveltime = Math.min(busTime, traveltime);
		
		int bicStartLoc = startLoc;
		int startTime = Integer.MAX_VALUE;
		
		for(int i=0; i < bicycleStation.length; i++) {
			int bicLoc = Integer.parseInt(bicycleStation[i].substring(1)); 
			int tempTime = 240*Math.abs(bicLoc - startLoc);
			if( startTime > tempTime) {
				startTime = tempTime;
				bicStartLoc = bicLoc;
			}
		}
		
		//System.out.println("startTime=" + startTime + " bicStartLoc=E" + bicStartLoc);
		
		for(int i=0; i < bicycleStation.length; i++) {
			int bicLoc = Integer.parseInt(bicycleStation[i].substring(1)); 
			if( bicLoc != startLoc) {
				int bicTime = 70*Math.abs(bicLoc - bicStartLoc) + 240*Math.abs(endLoc - bicLoc) + startTime;
				if( traveltime > bicTime) {
					traveltime = bicTime;
				}
			}
		}		
		
		
		
		///////////////////////////// <-------------- 여기까지 코딩 (2)
		
		return traveltime;
	}
}