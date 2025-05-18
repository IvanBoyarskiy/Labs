import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {

    public class MaxFinder {

        public static Integer max(ArrayList<Integer> list) {
            if (list == null || list.size() == 0) {
                return null;
            }
            Integer maxValue = list.get(0);
            for (Integer num : list) {
                if (num > maxValue) {
                    maxValue = num;
                }
            }
            return maxValue;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Введите последовательность чисел (0 для окончания):");

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            numbers.add(num);
        }

        Integer maxValue = MaxFinder.max(numbers);

        if (maxValue == null) {
            System.out.println("Список пуст или не содержит элементов.");
        } else {
            System.out.println("Наибольшее значение: " + maxValue);
        }

        scanner.close();
    }
}
