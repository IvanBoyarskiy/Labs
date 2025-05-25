import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static int sum(ArrayList<Integer> mas){
        int sum = 0;
        for (int i : mas){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();

        System.out.println("Введите пять чисел:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Число " + (i + 1) + ") ");
            int number = scanner.nextInt();
            array.add(number);
        }
        var sum = sum(array);

        System.out.println("Сумма: " + sum);
    }
}
