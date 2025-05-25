import java.util.ArrayList;
import java.util.Scanner;


public class Task1 {
    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Введите десять целых чисел: ");
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            list.add(number);
        }

        removeDuplicate(list);

        System.out.print("Несовпадающие целые числа равны: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}