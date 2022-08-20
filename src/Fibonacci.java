import java.math.BigInteger;

public class Fibonacci {
    public BigInteger fibonacci(int number){
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(1);

        for (int j=2; j <= number; j++){
            c = a.add(b);
            a = b;
            b = c;
        }
        return (b);
    }
}
