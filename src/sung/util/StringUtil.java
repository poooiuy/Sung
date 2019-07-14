package sung.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
	
	//	중복횟수 구하기
    public static void checkDuplicate() {
    	 
        String text = "a r b k c d se f g a d f s s f d s ft gh f ws w f v x s g h d h j j k f sd j e wed a d f";
 
        List<String> list = Arrays.asList(text.split(" "));
 
        Set<String> uniqueWords = new HashSet<String>(list);
        for (String word : uniqueWords) {
            System.out.println(word + ": " + Collections.frequency(list, word));
        }
    }
	
	
	
	public static void main(String[] args) {
		
//		System.out.println(reverseString("abcdefg"));
		
		checkDuplicate();
		
	}

	
	


}
