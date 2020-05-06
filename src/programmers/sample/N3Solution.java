/*
���� ����
���� ��ų�̶� � ��ų�� ���� ���� ���� ����� �ϴ� ��ų�� ���մϴ�.

���� ��� ���� ��ų ������ ����ũ �� ����Ʈ�� ��Ʈ �� ����϶�, ����� ������ ���� ����Ʈ�� ��Ʈ�� ����� �ϰ�, ����Ʈ�� ��Ʈ�� ������ ���� ����ũ�� ����� �մϴ�.

�� ������ ���� �ٸ� ��ų(���� ��)�� ������ ������� ��� �� �ֽ��ϴ�. ���� ����ũ �� ���� �� ����Ʈ�� ��Ʈ �� ����� ���� ��ųƮ���� ����������, ��� �� ����ũ�� ����Ʈ�� ��Ʈ �� ����ũ �� ���� �� ����� ���� ��ųƮ���� �Ұ����մϴ�.

���� ��ų ���� skill�� �������� ���� ��ųƮ��1�� ���� �迭 skill_trees�� �Ű������� �־��� ��, ������ ��ųƮ�� ������ return �ϴ� solution �Լ��� �ۼ����ּ���.

���� ����
��ų�� ���ĺ� �빮�ڷ� ǥ���ϸ�, ��� ���ڿ��� ���ĺ� �빮�ڷθ� �̷���� �ֽ��ϴ�.
��ų ������ ��ųƮ���� ���ڿ��� ǥ���մϴ�.
���� ���, C �� B �� D ��� CBD�� ǥ���մϴ�
���� ��ų ���� skill�� ���̴� 1 �̻� 26 �����̸�, ��ų�� �ߺ��� �־����� �ʽ��ϴ�.
skill_trees�� ���� 1 �̻� 20 ������ �迭�Դϴ�.
skill_trees�� ���Ҵ� ��ų�� ��Ÿ���� ���ڿ��Դϴ�.
skill_trees�� ���Ҵ� ���̰� 2 �̻� 26 ������ ���ڿ��̸�, ��ų�� �ߺ��� �־����� �ʽ��ϴ�.
����� ��
skill	skill_trees	return
"CBD"	["BACDE", "CBADF", "AECB", "BDA"]	2
����� �� ����
BACDE: B ��ų�� ���� ���� C ��ų�� ���� ����� �մϴ�. �Ұ����� ��ųƮ���ϴ�.
CBADF: ������ ��ųƮ���Դϴ�.
AECB: ������ ��ųƮ���Դϴ�.
BDA: B ��ų�� ���� ���� C ��ų�� ���� ����� �մϴ�. �Ұ����� ��ųƮ���Դϴ�.
*/

package programmers.sample;

import java.util.Arrays;

public class N3Solution {
	public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        String[] keyArr = skill.split("");
        for(int i=0; i<skill_trees.length; i++){
            String a = skill_trees[i];
            String[] arr = a.split("");
            String temp ="";
            for(int j=0; j<arr.length; j++){
                if(Arrays.stream(keyArr).anyMatch(arr[j]::equals)){
                    temp += arr[j];
                }
            }
            System.out.println(temp);
            if(skill.contains(temp) && check(skill, temp)){
                answer += 1;
            }
        }
            
        return answer;
    }
    
    private boolean check(String origin, String test){
        boolean result = true;
        String temp = origin.substring(0, test.length());
        if(temp.equals(test)){
            result = true;
        }else{
            result = false;
        }
        
        /*
        
        if(test.length() == 1){
            return result;
        } else {
            String[] arr = origin.split("");
            String temp = "";
            for(int i=0; i<test.length(); i++){
                temp += arr[i];
                if(!test.equals(temp)){
                    result =  false;
                    break;
                }
                
            }
        }     
        System.out.println(result);
        
        */
        
        return result;
    }
}