import java.math.BigInteger;

public class Task3 {
    public static void main(String[] args){
        BigInteger longMaxValue = new BigInteger(Long.MAX_VALUE + "");
        int count = 0;
        BigInteger number = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);

        while (count < 10) {
            BigInteger square = number.multiply(number);
            if (square.compareTo(longMaxValue) > 0) {
                System.out.println(square);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }

}
