import java.math.BigInteger;

public class Task3 {
    public static void main(String[] args) {
        BigInteger start = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
        BigInteger five = BigInteger.valueOf(5);
        BigInteger six = BigInteger.valueOf(6);
        int count = 0;
        while (count < 10) {
            if (start.mod(five).equals(BigInteger.ZERO) || start.mod(six).equals(BigInteger.ZERO)) {
                System.out.println(start);
                count++;
            }
            start = start.add(BigInteger.ONE);
        }
    }
}
