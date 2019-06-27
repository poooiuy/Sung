package sung.util;

public class StringUtil {
	
	//	문자열 뒤집기
	public static String reverseString(String s){
        return (new StringBuffer(s)).reverse().toString();
    }
	
	
	//	몇번째 숫자 구하기
	public void getNumericValue(String param) {
		for(int i=0; i < param.length(); i++) {
			int n1 = Character.getNumericValue(param.charAt(i));
		}
	}
	
	
	
	//	문자열에 중복문자 제거
	public void isHasValue() {
		String tmp = "abfgadfaefd";
		String ret = "";
		for(int i=0; i<tmp.length();i++){
			char n = tmp.charAt(i);
			if(ret.indexOf(n)==-1){
				ret+=n;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(reverseString("abcdefg"));
		
	}

	
	


}
