/*
���� ����
�յڸ� ����� �Ȱ��� ���ڿ��� �Ӹ����(palindrome)�̶�� �մϴ�.
���ڿ� s�� �־��� ��, s�� �κй��ڿ�(Substring)�� ���� �� �Ӹ������ ���̸� return �ϴ� solution �Լ��� �ϼ��� �ּ���.

�������, ���ڿ� s�� abcdcba�̸� 7�� return�ϰ� abacde�̸� 3�� return�մϴ�.

���ѻ���
���ڿ� s�� ���� : 2,500 ������ �ڿ���
���ڿ� s�� ���ĺ� �ҹ��ڷθ� ����
����� ��
s	answer
abcdcba	7
abacde	3
����� �� ����
����� �� #1
4��°�ڸ� 'd'�� �������� ���ڿ� s ��ü�� �Ӹ������ �ǹǷ� 7�� return�մϴ�.

����� �� #2
2��°�ڸ� 'b'�� �������� aba�� �Ӹ������ �ǹǷ� 3�� return�մϴ�.
*/


package programmers.sample;

public class N4Solution {
	
	public int solution(String s) {
		int answer = 0;

		for (int i = 0; i < s.length(); i++) {
			for (int j = 1; j <= s.length(); j++) {
				try {
					String a = s.substring(i, j);
					if (a.length() <= answer)
						continue;
					// System.out.println(a);
					if ((a.equals(new StringBuffer(a).reverse().toString())) && (a.length() > answer)) {
						answer = a.length();
					}
				} catch (Exception e) {
					// System.out.println(i+":"+j);
					continue;
				}

			}

		}
		return answer;
	}
}
