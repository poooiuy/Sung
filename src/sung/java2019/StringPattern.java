/*
 * 문자열을 입력받아 동일한 패턴이 있는지 검증
 * 오류판단 기준
 * 	- 같은 1자리 문자열이 3회 연속 중복
 * 	- 같은 2자리 이상 문자열이 2회이상 연속중복
 * 		- abab (오류)
 * 		- abcab (오류아님)
*/
package sung.java2019;

public class StringPattern {
	
	static String input = "feeeafgrgrdfasefgrgggrae";
	
	public static void main(String[] args) {
		
		// 1자리 중복여부 확인
		String[] strArr = input.split("");
		
		String target = "";
		int count = 0;
		for(String a : strArr) {
			if(target.equals(a)){
				count += 1;
			}else {
				target = a;
				count = 1;
			}
			if(count == 3) {
				System.out.println("1 String repeated : " + a);
				break;
			}
		}
		
		//	2자리 이상 중복여부 확인
		int length = input.length();
		for(int i=0; i<(length/2); i++) {
			
		}
		
	}

}
