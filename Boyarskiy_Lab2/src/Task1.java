import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random randInt = new Random(1000);
        for (int i = 0; i < 50; i++) {
            System.out.println(i + ") " + randInt.nextInt(1,100));
        }
    }
}