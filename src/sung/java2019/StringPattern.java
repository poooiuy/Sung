/*
 * ���ڿ��� �Է¹޾� ������ ������ �ִ��� ����
 * �����Ǵ� ����
 * 	- ���� 1�ڸ� ���ڿ��� 3ȸ ���� �ߺ�
 * 	- ���� 2�ڸ� �̻� ���ڿ��� 2ȸ�̻� �����ߺ�
 * 		- abab (����)
 * 		- abcab (�����ƴ�)
*/
package sung.java2019;

public class StringPattern {
	
	static String input = "feeeafgrgrdfasefgrgggrae";
	
	public static void main(String[] args) {
		
		// 1�ڸ� �ߺ����� Ȯ��
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
		
		//	2�ڸ� �̻� �ߺ����� Ȯ��
		int length = input.length();
		for(int i=0; i<(length/2); i++) {
			
		}
		
	}

}
