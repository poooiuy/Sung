package a2019.verifyKeypadPassword;

public class Keypad {

	/**
	 * ���׼��� 2���� "��", "��"�� ��ȿ�� ���� ��Ģ�� �˻��ϴ� ���
	 * 
	 * @param inputData
	 *            ��ȿ���� ������ Ű�е� ��ȣ
	 * @return boolean "��", "��" ��ȿ�� ���� ���
	 */
	public boolean checkSimpleValidate(String inputData) {

		boolean valid = true;

		//////////////////////// ������� �ڵ� (1) ---------------->
		if (inputData == null || inputData.length() < 6 || inputData.length() > 15) {
			System.out.println("length error.");
			return false;
		}
		for (int i = 0; i < inputData.length(); i++) {
			if (inputData.charAt(i) < '0' || inputData.charAt(i) > '9') {
				System.out.println("not number error.");
				return false;
			}
		}

		String[] prohibit = { "123", "456", "789", "321", "654", "987", "147", "258", "369", "741", "852", "963", "159",
				"951", "357", "753", "025", "520" };

		for (int j = 0; j < prohibit.length; j++) {
			if (inputData.indexOf(prohibit[j]) >= 0) {
				System.out.println("prohibit error. ==> " + prohibit[j]);
				return false;
			}
		}
		///////////////////////////// <-------------- ������� �ڵ� (1)

		return valid;
	}

	/**
	 * ���׼��� 2���� "��", "��"�� ��ȿ�� ���� ��Ģ�� �˻��ϴ� ���
	 * 
	 * @param inputData
	 *            ��ȿ���� ������ Ű�е� ��ȣ
	 * @return boolean "��", "��" ��ȿ�� ���� ���
	 */
	public boolean checkComplexValidate(String inputData) {

		boolean valid = true;

		//////////////////////// ������� �ڵ� (2) ---------------->
		for(int i = 0; i < inputData.length(); i++) {
			if( i >= 2) {
				if(inputData.charAt(i) == inputData.charAt(i-1) &&
				   inputData.charAt(i) == inputData.charAt(i-2)) {
					System.out.println("same three char error.");
					return false;
				}
			}
		}
		
		for(int i = 0; i <= inputData.length(); i++) {
			if( i >= 4) {
				if(inputData.substring(i-2, i).equals(inputData.substring(i-4,i-2)) ) {
					System.out.println("same pattern error.");
					return false;
				}
			}
			if( i >= 6) {
				if(inputData.substring(i-3, i).equals(inputData.substring(i-6,i-3)) ) {
					System.out.println("same pattern error.");
					return false;
				}
			}	
			if( i >= 8) {
				if(inputData.substring(i-4, i).equals(inputData.substring(i-8,i-4)) ) {
					System.out.println("same pattern error.");
					return false;
				}
			}	
			if( i >= 10) {
				if(inputData.substring(i-5, i).equals(inputData.substring(i-10,i-5)) ) {
					System.out.println("same pattern error.");
					return false;
				}
			}	
			if( i >= 12) {
				if(inputData.substring(i-6, i).equals(inputData.substring(i-12,i-6)) ) {
					System.out.println("same pattern error.");
					return false;
				}
			}				
		}		
		
		///////////////////////////// <-------------- ������� �ڵ� (2)

		return valid;
	}
}