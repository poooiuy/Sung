package a2019.findCompressStringOrigin;

public class Decompress {

	/**
	 * 입력된 문자열의 압축을 해제하는 기능
	 * 
	 * @param inputData
	 *            입력데이터 (문자열)
	 * @return String 입력된 문자열의 압축을 해제한 결과 문자열
	 */
	public String decompress(String inputData) {

		String result = "";

		////////////////////// 여기부터 구현 (1) ---------------->

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

		///////////////////////////// <-------------- 여기까지 구현 (1)

		return result;
	}
}