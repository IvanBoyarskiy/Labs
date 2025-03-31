import java.util.Arrays;
import java.util.Scanner;

class MyInteger {
    private int value;

    public MyInteger(int value){
        this.value = value;
    }
    public int get_Value(){
        return value;
    }
    public boolean isEven(){
        if (value % 2 != 1){
            return true;
        }
        return false;
    }
    public boolean isOdd(){
        if (value % 2 == 1){
            return true;
        }
        return false;
    }
    public boolean isPrime(){
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isEven(int value){
        if (value % 2 != 1){
            return true;
        }
        return false;
    }
    public static boolean isOdd(int value){
        if (value % 2 == 1){
            return true;
        }
        return false;
    }
    public static boolean isPrime(int value){
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isEven(MyInteger value){
        if (value.get_Value() % 2 != 1){
            return true;
        }
        return false;
    }
    public static boolean isOdd(MyInteger value){
        if (value.get_Value() % 2 == 1){
            return true;
        }
        return false;
    }
    public static boolean isPrime(MyInteger value){
        for (int i = 2; i <= Math.sqrt(value.get_Value()); i++) {
            if (value.get_Value() % i == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean equals(int value){
        if (this.value == value){
            return true;
        }
        return false;
    }
    public boolean equals(MyInteger value){
        if (this.value == value.get_Value()){
            return true;
        }
        return false;
    }

    private static int toInt(char[] symbols){
        char[] array_of_char_numbers = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        int[] array_of_numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int length = symbols.length - 1;
        int result = 0;
        for (int i = 0; i < symbols.length; i++){
            for (int j = 0; j < array_of_char_numbers.length; j++){
                if(symbols[i] == array_of_char_numbers[j]){
                    result = result + array_of_numbers[j] * (int) Math.pow(10, length);
                    length -= 1;
                }
            }
        }
        return result;
    }
    public static int parseInt(char[] symbols){
        return toInt(symbols);
    }
    public static int parseInt(String str){
        return toInt(str.toCharArray());
    }
}


public class Task3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        MyInteger myIntegerEven = new MyInteger(1000);
        MyInteger myIntegerOdd = new MyInteger(1001);
        MyInteger myIntegerPrime = new MyInteger(13);

        System.out.println("Проверяемое число (Безаргументарный метод) - " + myIntegerEven.get_Value());
        printByFirstType(myIntegerEven);
        System.out.println();
        System.out.println("Проверяемое число (Безаргументарный метод) - " + myIntegerOdd.get_Value());
        printByFirstType(myIntegerOdd);
        System.out.println();
        System.out.println("Проверяемое число (Безаргументарный метод) - " + myIntegerPrime.get_Value());
        printByFirstType(myIntegerPrime);
        System.out.println();
        System.out.print("Проверяемое число (Статическое с числовым) - ");
        printBySecondType(sc.nextInt());
        System.out.println();
        MyInteger newMI = new MyInteger(1000);
        System.out.println("Проверяемое число (Статическое с MyInteger) - " + newMI.get_Value());
        printByThirdType(newMI);
        System.out.println();
        System.out.print("Введите число для дальнейшей проверки - ");
        int number = sc.nextInt();
        System.out.println("Проверка равенства MyInteger " + myIntegerEven.get_Value() + " и числа " + number);
        System.out.println(myIntegerEven.equals(number) ? "Числа равны" : "Числа не равны");
        System.out.println("Проверка равенства MyInteger " + myIntegerEven.get_Value() + " и MyInteger " + newMI.get_Value());
        System.out.println(myIntegerEven.equals(newMI) ? "Числа равны" : "Числа не равны");
        System.out.println();
        char[] char_to_num = new char[]{'1', '2', '3'};
        System.out.println("Перевод из char[] (" + Arrays.toString(char_to_num) + ") в числовое:");
        System.out.println(MyInteger.parseInt(char_to_num));
        String string_to_num = "1234";
        System.out.println("Перевод из String ('" + string_to_num + "') в числовое:");
        System.out.println(MyInteger.parseInt(string_to_num));

    }
    public static void printByFirstType(MyInteger bool){
        System.out.println(bool.isEven() ? "Число Четное" : "Число не является Четным");
        System.out.println(bool.isOdd() ? "Число Нечетное" : "Число не является Нечетным");
        System.out.println(bool.isPrime() ? "Число Простое" : "Число не является Простым");
    }
    public static void printBySecondType(int num){
        System.out.println(MyInteger.isEven(num) ? "Число Четное" : "Число не является Четным");
        System.out.println(MyInteger.isOdd(num) ? "Число Нечетное" : "Число не является Нечетным");
        System.out.println(MyInteger.isPrime(num) ? "Число Простое" : "Число не является Простым");
    }
    public static void printByThirdType(MyInteger MI){
        System.out.println(MyInteger.isEven(MI) ? "Число Четное" : "Число не является Четным");
        System.out.println(MyInteger.isOdd(MI) ? "Число Нечетное" : "Число не является Нечетным");
        System.out.println(MyInteger.isPrime(MI) ? "Число Простое" : "Число не является Простым");
    }
}
