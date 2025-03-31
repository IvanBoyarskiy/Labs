import java.util.Scanner;

class Location {
    public int row;
    public int column;
    public double maxValue;

    public Location(){
        row = 0;
        column = 0;
        maxValue = 0;
    }

    private static Location findLocateLargest(double[][] a){
        Location location = new Location();
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++) {
                if (a[i][j] > location.maxValue){
                    location.maxValue = a[i][j];
                    location.row = i;
                    location.column = j;
                }
            }
        }
        return location;
    }

    public static Location locateLargest(double[][] a){
        return findLocateLargest(a);
    }
    public String toString(){
        return "Наибольший элемент массива, равный " + maxValue + ", находится в позиции (" + row + ";" + column + ")";
    }
}

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int rows = sc.nextInt();
        System.out.print("Введите количество столбцов: ");
        int columns = sc.nextInt();
        double[][] array = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            System.out.println("Введите элементы строки " + (i) + ": ");
            for (int j = 0; j < columns; j++) {
                array[i][j] = sc.nextDouble();
            }
        }
        Location location = Location.locateLargest(array);
        System.out.println(location);
    }
}