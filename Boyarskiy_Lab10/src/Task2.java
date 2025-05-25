import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> unionList = new ArrayList<>(list1);
        for (Integer number : list2) {
            unionList.add(number);
        }
        return unionList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.print("Введите пять целых чисел для списка1: ");
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            list1.add(number);
        }

        System.out.print("Введите пять целых чисел для списка2: ");
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            list2.add(number);
        }

        ArrayList<Integer> unionList = union(list1, list2);

        System.out.print("Объединенный список равен: ");
        for (int i = 0; i < unionList.size(); i++) {
            System.out.print(unionList.get(i));
            if (i < unionList.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
