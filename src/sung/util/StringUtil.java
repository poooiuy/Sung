package sung.util;

public class StringUtil {
	
	//	���ڿ� ������
	public static String reverseString(String s){
        return (new StringBuffer(s)).reverse().toString();
    }
	
	
	public static void main(String[] args) {
		
		System.out.println(reverseString("abcdefg"));
		
	}

	
	


}
