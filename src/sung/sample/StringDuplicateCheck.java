package sung.sample;

/*
 * 입력받은 문자열 중 2자리 이상 연속되는 문자가 있는지 판단한다.
 * 	- 있으면 true / 없으면 false
 * 중복되는 문자열 사이에 다른 문자열이 있는경우 정상으로 판단한다.
 * 	- 예시
 * 		ZEFABABGH 	false
 * 		ZEFABCABGH	true
*/

import java.util.ArrayList;
import java.util.List;

public class StringDuplicateCheck {
	
	static String text = "ZEFABABGH";
	
	public static void main(String[] args) {
		
		char[] arr = text.toCharArray();
		
	
		for(int i=2; i<=(text.length()/2); i++) {
			if(check(text, i)) {
				System.out.println("Repeated");
				break;
			}
		}
		
	}
	
	private static boolean check(String text, int num) {
		
		boolean result = false;

		for(int i=0; i<num; i++){
			
			List<String> list = new ArrayList<>();
			
			for(int j=i+0; j<=text.length()-num; j+=num) {
				list.add(text.substring(j, j+num));
			}
			String a="";
			String b="";
			
			for(int k=0; k<list.size(); k++) {
				if(k==0) {
					a = list.get(k);
				}else {
					b = list.get(k);
					System.out.println(a + ":" + b);
					if(a.equals(b)) {
						result = true;
					}
					a = b;
				}
			}
			System.out.println("----------------");
			list.clear();
			
		}
		
		return result;
	}

}