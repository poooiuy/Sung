package a2019.findCompressStringOrigin;

public class Decompress {

	/**
	 * �Էµ� ���ڿ��� ������ �����ϴ� ���
	 * 
	 * @param inputData
	 *            �Էµ����� (���ڿ�)
	 * @return String �Էµ� ���ڿ��� ������ ������ ��� ���ڿ�
	 */
	public String decompress(String inputData) {

		String result = "";

		////////////////////// ������� ���� (1) ---------------->

		char last = '\n';

		for (char c : inputData.toCharArray()) {
			if (c >= '2' && c <= '9') {
				for (int i = 1; i < Integer.parseInt(Character.toString(c)); i++) {
					result += last;
				}

			} else if (c != '\n') {
				result += c;
			}
			last = c;
		}

		///////////////////////////// <-------------- ������� ���� (1)

		return result;
	}
}