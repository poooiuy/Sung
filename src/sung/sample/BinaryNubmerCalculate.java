package sung.sample;

import java.math.BigInteger;

public class BinaryNubmerCalculate {

	public static void main(String[] args) {
		
		String a = "1011101";
		String b = "10011111";
		
		BigInteger aa = new BigInteger(a, 2);
		BigInteger bb = new BigInteger(b, 2);
		
		int sum = aa.intValue() + bb.intValue();
		
		System.out.println(Integer.toBinaryString(sum));
	}
	
}