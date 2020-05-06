package a2019.findOnecardGameRule;

public class Onecard {

	/**
	 * ī�� ���ڿ��� ��ī�� �꿡 �´��� ���θ� �Ǻ��ϴ� ���
	 * 
	 * @param 		inputData		�Էµ����� (���ڿ� �迭)
	 * @return		boolean			��ī�� �� ���� ���� (true/false)
	 */
	public boolean isValidOnecardRule( String[] inputData ) {
		
		boolean valid = true;
		
		////////////////////////������� �ڵ� (1) ---------------->
		String preCard = "";
		for(int i=0; i < inputData.length; i++) {
			if( i > 0 ) {
				if(preCard.charAt(0) != inputData[i].charAt(0) &&
				   preCard.charAt(1) != inputData[i].charAt(1)) {
					System.out.println("not a rule at index=" + i);
					return false;
				}
			}
			preCard = inputData[i];
		}
		
		///////////////////////////// <-------------- ������� �ڵ� (1)
		
		return valid;
	}
}