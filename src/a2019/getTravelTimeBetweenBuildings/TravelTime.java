package a2019.getTravelTimeBetweenBuildings;


public class TravelTime {
	
	/**
	 * ��Ʋ�� Ÿ�� �ʰ� ��������� ���������� �ּ� �̵��ϴ� �ð�(��)�� ���ϴ� ���
	 * 
	 * @param 		bicycleStation		������ �����Ұ� �ִ� �ǹ� ���
	 * @param 		start				�����
	 * @param 		destination			������
	 * @return		int					��Ʋ�� Ÿ�� �ʰ� �ּ� �̵� �ð�
	 */
	public int getTraveltimeWithoutShuttle( String[] bicycleStation, String start, String destination ) {
		
		int traveltime = 0;
		
		////////////////////////������� �ڵ� (1) ---------------->
		
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
		
		///////////////////////////// <-------------- ������� �ڵ� (1)
		
		return traveltime;
	}

	/**
	 * ��Ʋ ž���� ������ ��, ��������� ���������� �ּ� �̵� �ð�(��)�� ���ϴ� ���
	 * 
	 * @param 		bicycleStation		������ �����Ұ� �ִ� �ǹ� ���
	 * @param 		start				�����
	 * @param 		destination			������
	 * @param 		departure			��� �ð� (HH:MM ����)
	 * @return		int					�ּ� �̵� �ð�
	 */
	public int getTraveltime( String[] bicycleStation, String start, String destination, String departure) {
		
		int traveltime = 0;
		
		////////////////////////������� �ڵ� (2) ---------------->
		
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
		
		
		
		///////////////////////////// <-------------- ������� �ڵ� (2)
		
		return traveltime;
	}
}