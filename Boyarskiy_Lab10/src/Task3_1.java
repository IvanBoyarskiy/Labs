import java.util.ArrayList;
import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество предметов: ");
        int numberOfItems = scanner.nextInt();

        int[] weights = new int[numberOfItems];
        System.out.print("Введите вес каждого предмета: ");
        for (int i = 0; i < numberOfItems; i++) {
            weights[i] = scanner.nextInt();
        }

        ArrayList<ArrayList<Integer>> containers = new ArrayList<>();
        containers.add(new ArrayList<>());
        int currentContainerIndex = 0;
        int currentContainerWeight = 0;

        for (int weight : weights) {
            if (currentContainerWeight + weight <= 10) {
                containers.get(currentContainerIndex).add(weight);
                currentContainerWeight += weight;
            } else {
                containers.add(new ArrayList<>());
                currentContainerIndex++;
                containers.get(currentContainerIndex).add(weight);
                currentContainerWeight = weight;
            }
        }

        for (int i = 0; i < containers.size(); i++) {
            System.out.print("Контейнер " + (i + 1) + " содержит предметы с весом ");
            for (int j = 0; j < containers.get(i).size(); j++) {
                System.out.print(containers.get(i).get(j));
                if (j < containers.get(i).size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
//Алгоритм сильно зависит от порядка, в котором предметы подаются на вход. Например, если тяжелые предметы идут первыми, они могут занять отдельные контейнеры, оставляя мало места для более мелких предметов, которые могли бы быть упакованы вместе