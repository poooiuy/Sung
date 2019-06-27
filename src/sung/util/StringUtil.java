package sung.util;

public class StringUtil {
	
	//	문자열 뒤집기
	public static String reverseString(String s){
        return (new StringBuffer(s)).reverse().toString();
    }
	
	
	public static void main(String[] args) {
		
		System.out.println(reverseString("abcdefg"));
		
	}

	
	


}
