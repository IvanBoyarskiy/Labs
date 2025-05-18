import java.math.BigInteger;

public class Task2 {
    public static void main(String[] args){
        int count = 0;
        BigInteger number = new BigInteger("10").pow(49); // Начинаем с самого маленького 50-значного числа
        BigInteger two = new BigInteger("2");
        BigInteger three = new BigInteger("3");

        while (count < 10) {
            if (number.mod(two).equals(BigInteger.ZERO) || number.mod(three).equals(BigInteger.ZERO)) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }
}
