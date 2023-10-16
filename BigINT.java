import java.math.BigInteger;

public class BigINT {
	public static void main(String[] args) {
		BigInteger a=new BigInteger("123");
				BigInteger b=BigInteger.TEN;
				//add
				BigInteger res1=a.add(b);
				System.out.println(res1);
				//sub
				BigInteger res2=a.subtract(b);
				System.out.println(res2);
				//divide
				BigInteger res3=a.divide(b);
				System.out.println(res3);
				//mod
				BigInteger res4=a.mod(b);
				System.out.println(res4);
				//mul
				BigInteger res5=a.multiply(b);
				System.out.println(res5);
	}

}
