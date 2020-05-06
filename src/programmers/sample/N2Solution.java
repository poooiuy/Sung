/*
���� ����
���̰� n�� �迭�� 1���� n���� ���ڰ� �ߺ� ���� �� ���� ��� �ִ����� Ȯ���Ϸ��� �մϴ�.
1���� n���� ���ڰ� �ߺ� ���� �� ���� ��� �ִ� ��� true��, �ƴ� ��� false�� ��ȯ�ϵ��� �Լ� solution�� �ϼ����ּ���.

���ѻ���
�迭�� ���̴� 10�� �����Դϴ�.
�迭�� ���Ҵ� 0 �̻� 10�� ������ �����Դϴ�.
����� ��
arr	result
[4, 1, 3, 2]	true
[4, 1, 3]	false
����� �� ����
����� �� #1
�Է��� [4, 1, 3, 2]�� �־��� ���, �迭�� ���̰� 4�̹Ƿ� �迭���� 1���� 4���� ���ڰ� ��� ��� �־�� �մϴ�. [4, 1, 3, 2]���� 1���� 4������ ���ڰ� ��� ��� �����Ƿ� true�� ��ȯ�ϸ� �˴ϴ�.

����� �� #2
[4, 1, 3]�� �־��� ���, �迭�� ���̰� 3�̹Ƿ� �迭���� 1���� 3���� ���ڰ� ��� ��� �־�� �մϴ�. [4, 1, 3]���� 2�� ���� 4�� �����Ƿ� false�� ��ȯ�ϸ� �˴ϴ�.
*/


package programmers.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class N2Solution {
	public boolean solution(int[] arr) {
		boolean answer = true;

		List<Integer> list = new ArrayList<Integer>(arr.length);
		for (int i : arr) {
			list.add(i);
		}
		Collections.sort(list);

		for (int i = 1; i <= list.size(); i++) {
			if (!list.contains(i)) {
				answer = false;
				break;
			}

		}
		return answer;
	}

}