package a2019.findOnecardGameRule;

public class Onecard {

	/**
	 * 카드 문자열이 원카드 룰에 맞는지 여부를 판별하는 기능
	 * 
	 * @param 		inputData		입력데이터 (문자열 배열)
	 * @return		boolean			원카드 룰 적합 여부 (true/false)
	 */
	public boolean isValidOnecardRule( String[] inputData ) {
		
		boolean valid = true;
		
		////////////////////////여기부터 코딩 (1) ---------------->
		String preCard = "";
		for(int i=0; i < inputData.length; i++) {
			if( i > 0 ) {
				if(preCard.charAt(0) != inputData[i].charAt(0) &&
				   preCard.charAt(1) != inputData[i].charAt(1)) {
					System.out.println("not a rule at index=" + i);
					return false;
				}
			}
			preCard = inputData[i];
		}
		
		///////////////////////////// <-------------- 여기까지 코딩 (1)
		
		return valid;
	}
}