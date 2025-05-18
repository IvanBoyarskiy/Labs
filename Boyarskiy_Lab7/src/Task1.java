import java.util.ArrayList;

public class Task1 {

    public class Split {
        public static String[] split(String s, String markers){
            ArrayList<String> splitted = new ArrayList<>();
            String part = "";
            char[] chars = s.toCharArray();
            char[] marker = markers.toCharArray();
            for (int i = 0; i < chars.length; i++){
                if (containsChar(marker, chars[i])) {
                    splitted.add(part);
                    part = "";
                    splitted.add(String.valueOf(chars[i]));
                }
                else {
                    part = part + chars[i];
                }
            }
            if (!part.isEmpty()){
                splitted.add(part);
            }
            return splitted.toArray(new String[0]);
        }

        public static boolean containsChar(char[] array, char ch) {
            String s = new String(array);
            return s.indexOf(ch) >= 0;
        }
    }


    public static void main(String[] args){

        String str = "AyH%NJ(!!AD";
        String markers = "%!";

        String[] splitted = Split.split(str, markers);
        for (String s : splitted) {
            System.out.print(s + ",");
        }

    }
}
