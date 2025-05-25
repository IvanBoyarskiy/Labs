import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void sort(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
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
        sort(array);

        System.out.println("Числа в порядке возрастания: " + array);
    }
}
