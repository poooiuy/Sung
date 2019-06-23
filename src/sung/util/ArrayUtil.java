package sung.util;

import java.util.Arrays;
import java.util.List;

public class ArrayUtil {
	
	//	Array to List
	String[] strArr = new String[] {"1","2","3"};
	List<String> strList = Arrays.asList(strArr);
	
	
	public void copyArray() {
		String[] strArray = {"orange", "red", "green'"};
		String[] copiedArray = Arrays.stream(strArray).toArray(String[]::new);

	}
	

}
