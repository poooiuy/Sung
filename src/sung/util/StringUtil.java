package sung.util;

public class StringUtil {
	
	//	���ڿ� ������
	public static String reverseString(String s){
        return (new StringBuffer(s)).reverse().toString();
    }
	
	
	//	���° ���� ���ϱ�
	public void getNumericValue(String param) {
		for(int i=0; i < param.length(); i++) {
			int n1 = Character.getNumericValue(param.charAt(i));
		}
	}
	
	
	
	//	���ڿ��� �ߺ����� ����
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
