import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину - ");
        var length = sc.nextInt();
        var massive = getArray(length);
        for (int i = 0; i < length; i++){
            System.out.println(massive.get(i));
        }
        System.out.println("Индексы строк с наибольшим кол-вом ед. - " + findMaxRow(massive));
        System.out.println("Индексы столбцов с наибольшим кол-вом ед. - " + findMaxColumn(massive));

    }
    public static ArrayList<ArrayList<Integer>> getArray(int length){
        ArrayList<ArrayList<Integer>> mas = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < length; i++){
            ArrayList<Integer> mas1 = new ArrayList<>();
            for (int j = 0; j < length; j++){
                mas1.add(random.nextInt(2));
            }
            mas.add(mas1);
        }
        return mas;
    }

    public static ArrayList<Integer> findMaxColumn(ArrayList<ArrayList<Integer>> mas){
        ArrayList<Integer> maxColumn = new ArrayList<>();
        int lastMaxNumber = 0;
        int index = 0;
        for (ArrayList<Integer> i : mas){
            ArrayList<Integer> Column = new ArrayList<>();
            for (ArrayList<Integer> row : mas){
                Column.add(row.get(index));
            }
            if (checkCount(Column) == lastMaxNumber) {
                maxColumn.add(index);
            }
            else if (checkCount(Column) > lastMaxNumber) {
                maxColumn.clear();
                maxColumn.add(index);
                lastMaxNumber = checkCount(Column);
            }
            index += 1;
        }
        return maxColumn;
    }

    public static ArrayList<Integer> findMaxRow(ArrayList<ArrayList<Integer>> mas) {
        ArrayList<Integer> maxRow = new ArrayList<>();
        int lastMaxNumber = 0;
        int index = 0;
        for (ArrayList<Integer> row : mas){

            if (checkCount(row) == lastMaxNumber) {
                maxRow.add(index);
            }
            else if (checkCount(row) > lastMaxNumber) {
                maxRow.clear();
                maxRow.add(index);
                lastMaxNumber = checkCount(row);
            }
            index += 1;
        }
        return maxRow;
    }

    public static int checkCount(ArrayList<Integer> array){
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }
}