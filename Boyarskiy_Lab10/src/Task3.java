import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> charList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            charList.add(s.charAt(i));
        }
        return charList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String example = sc.nextLine();
        ArrayList<Character> result = toCharacterArray(example);
        System.out.println("Список символов: " + result);
    }
}

