package a2019.verifyKeypadPassword;

public class Keypad {

	/**
	 * 문항설명 2번의 "가", "나"의 유효성 검증 규칙을 검사하는 기능
	 * 
	 * @param inputData
	 *            유효성을 검증할 키패드 암호
	 * @return boolean "가", "나" 유효성 검증 결과
	 */
	public boolean checkSimpleValidate(String inputData) {

		boolean valid = true;

		//////////////////////// 여기부터 코딩 (1) ---------------->
		if (inputData == null || inputData.length() < 6 || inputData.length() > 15) {
			System.out.println("length error.");
			return false;
		}
		for (int i = 0; i < inputData.length(); i++) {
			if (inputData.charAt(i) < '0' || inputData.charAt(i) > '9') {
				System.out.println("not number error.");
				return false;
			}
		}

		String[] prohibit = { "123", "456", "789", "321", "654", "987", "147", "258", "369", "741", "852", "963", "159",
				"951", "357", "753", "025", "520" };

		for (int j = 0; j < prohibit.length; j++) {
			if (inputData.indexOf(prohibit[j]) >= 0) {
				System.out.println("prohibit error. ==> " + prohibit[j]);
				return false;
			}
		}
		///////////////////////////// <-------------- 여기까지 코딩 (1)

		return valid;
	}

	/**
	 * 문항설명 2번의 "다", "라"의 유효성 검증 규칙을 검사하는 기능
	 * 
	 * @param inputData
	 *            유효성을 검증할 키패드 암호
	 * @return boolean "다", "라" 유효성 검증 결과
	 */
	public boolean checkComplexValidate(String inputData) {

		boolean valid = true;

		//////////////////////// 여기부터 코딩 (2) ---------------->
		for(int i = 0; i < inputData.length(); i++) {
			if( i >= 2) {
				if(inputData.charAt(i) == inputData.charAt(i-1) &&
				   inputData.charAt(i) == inputData.charAt(i-2)) {
					System.out.println("same three char error.");
					return false;
				}
			}
		}
		
		for(int i = 0; i <= inputData.length(); i++) {
			if( i >= 4) {
				if(inputData.substring(i-2, i).equals(inputData.substring(i-4,i-2)) ) {
					System.out.println("same pattern error.");
					return false;
				}
			}
			if( i >= 6) {
				if(inputData.substring(i-3, i).equals(inputData.substring(i-6,i-3)) ) {
					System.out.println("same pattern error.");
					return false;
				}
			}	
			if( i >= 8) {
				if(inputData.substring(i-4, i).equals(inputData.substring(i-8,i-4)) ) {
					System.out.println("same pattern error.");
					return false;
				}
			}	
			if( i >= 10) {
				if(inputData.substring(i-5, i).equals(inputData.substring(i-10,i-5)) ) {
					System.out.println("same pattern error.");
					return false;
				}
			}	
			if( i >= 12) {
				if(inputData.substring(i-6, i).equals(inputData.substring(i-12,i-6)) ) {
					System.out.println("same pattern error.");
					return false;
				}
			}				
		}		
		
		///////////////////////////// <-------------- 여기까지 코딩 (2)

		return valid;
	}
}