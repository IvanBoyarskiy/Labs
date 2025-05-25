public class Task2 {

    public static class MyString2 {
        private char[] chars;

        // Конструктор: копирует переданный массив
        public MyString2(char[] chars) {
            if (chars != null) {

                this.chars = new char[chars.length];
                System.arraycopy(chars, 0, this.chars, 0, chars.length);
            }
        }


        public MyString2 substring(int begin) {
            if (begin < 0 || begin > chars.length)
                throw new IndexOutOfBoundsException("begin: " + begin + ", length: " + chars.length);
            char[] sub = new char[chars.length - begin];
            System.arraycopy(chars, begin, sub, 0, sub.length);
            return new MyString2(sub);
        }

        public MyString2 toUpperCase() {
            char[] upper = new char[chars.length];
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if (c >= 'a' && c <= 'z') {
                    upper[i] = (char) (c - ('a' - 'A'));
                } else {
                    upper[i] = c;
                }
            }
            return new MyString2(upper);
        }

        public char[] toChars() {
            char[] copy = new char[chars.length];
            System.arraycopy(chars, 0, copy, 0, chars.length);
            return copy;
        }

        // valueOf: статический метод для boolean
        public static MyString2 valueOf(boolean b) {
            return b ? new MyString2(new char[]{'t','r','u','e'})
                    : new MyString2(new char[]{'f','a','l','s','e'});
        }

        @Override
        public String toString() {
            return new String(chars);
        }
    }


    public static void main(String[] args){
        MyString2 s = new MyString2(new char[] {'J', 'a', 'v', 'a'});

        MyString2 sub = s.substring(1);
        System.out.println("substring(1): " + sub); //  "ava"

        MyString2 upper = s.toUpperCase();
        System.out.println("toUpperCase: " + upper); //  "JAVA"

        char[] chars = s.toChars();
        System.out.print("toChars: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        MyString2 trueStr = MyString2.valueOf(true);
        MyString2 falseStr = MyString2.valueOf(false);
        System.out.println("valueOf(true): " + trueStr);   // "true"
        System.out.println("valueOf(false): " + falseStr); // "false"
    }
}
