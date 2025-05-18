import java.math.BigInteger;

public class Task2 {
    public static void main(String[] args){

        System.out.printf("%-4s %-30s%n", "p", "2^p - 1");
        System.out.println("---------------------------------------------");
        for (int p = 2; p <= 100; p++) {
            if (isPrime(p)) {
                BigInteger mersenne = BigInteger.valueOf(2).pow(p).subtract(BigInteger.ONE);
                if (mersenne.isProbablePrime(20)) { // 20 - высокая вероятность
                    System.out.printf("%-4d %-30s%n", p, mersenne);
                }
            }
        }

    }
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }
}
