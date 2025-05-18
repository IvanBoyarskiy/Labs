import java.math.BigInteger;

public class Task1 {
    public static void main(String[] args){
        BigInteger prime = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);

        for (int i = 0; i < 5; i++) {
            prime = prime.nextProbablePrime();
            System.out.println(prime);
            prime = prime.add(BigInteger.ONE);
        }
    }
}
