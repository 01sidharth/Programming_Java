import java.math.BigInteger;

public class BigIntFactorial {
	public static BigInteger factorial(int num) {
		BigInteger fact=BigInteger.ONE;
		for(int i=num;i>=1;i--)
		{
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
		
	}
public static void main(String[] args) {
	System.out.println(factorial(100));
}
}
