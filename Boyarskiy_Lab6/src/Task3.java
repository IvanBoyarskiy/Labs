public class Task3 {
    public static class MyCharacter {
        private final char value;

        public MyCharacter(char value) {
            this.value = value;
        }

        public char charValue() {
            return value;
        }

        public int compareTo(MyCharacter anotherCharacter) {
            return this.value - anotherCharacter.value;
        }

        public boolean equals(MyCharacter anotherCharacter) {
            if (anotherCharacter == null) return false;
            return this.value == anotherCharacter.value;
        }

        public boolean isDigit() {
            return isDigit(this.value);
        }

        public static boolean isDigit(char ch) {
            return ch >= '0' && ch <= '9';
        }

        public static boolean isLetter(char ch) {
            return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
        }

        public static boolean isLetterOrDigit(char ch) {
            return isLetter(ch) || isDigit(ch);
        }

        public static boolean isLowerCase(char ch) {
            return ch >= 'a' && ch <= 'z';
        }

        public static boolean isUpperCase(char ch) {
            return ch >= 'A' && ch <= 'Z';
        }

        public static char toUpperCase(char ch) {
            if (isLowerCase(ch)) {
                return (char) (ch - ('a' - 'A'));
            }
            return ch;
        }

        public static char toLowerCase(char ch) {
            if (isUpperCase(ch)) {
                return (char) (ch + ('a' - 'A'));
            }
            return ch;
        }
    }


    public static void main(String[] args){
        MyCharacter ch1 = new MyCharacter('a');
        MyCharacter ch2 = new MyCharacter('A');
        MyCharacter ch3 = new MyCharacter('1');

        System.out.println("ch1.charValue(): " + ch1.charValue()); // a

        System.out.println("ch1.compareTo(ch2): " + ch1.compareTo(ch2)); // >0

        System.out.println("ch1.equals(ch2): " + ch1.equals(ch2)); // false
        System.out.println("ch1.equals(new MyCharacter('a')): " + ch1.equals(new MyCharacter('a'))); // true

        System.out.println("ch3.isDigit(): " + ch3.isDigit()); // true

        System.out.println("MyCharacter.isDigit('5'): " + MyCharacter.isDigit('5')); // true

        System.out.println("MyCharacter.isLetter('Z'): " + MyCharacter.isLetter('Z')); // true
        System.out.println("MyCharacter.isLetter('3'): " + MyCharacter.isLetter('3')); // false

        System.out.println("MyCharacter.isLetterOrDigit('b'): " + MyCharacter.isLetterOrDigit('b')); // true
        System.out.println("MyCharacter.isLetterOrDigit('7'): " + MyCharacter.isLetterOrDigit('7')); // true
        System.out.println("MyCharacter.isLetterOrDigit('%'): " + MyCharacter.isLetterOrDigit('%')); // false

        System.out.println("MyCharacter.isLowerCase('a'): " + MyCharacter.isLowerCase('a')); // true
        System.out.println("MyCharacter.isLowerCase('A'): " + MyCharacter.isLowerCase('A')); // false

        System.out.println("MyCharacter.isUpperCase('A'): " + MyCharacter.isUpperCase('A')); // true
        System.out.println("MyCharacter.isUpperCase('a'): " + MyCharacter.isUpperCase('a')); // false

        System.out.println("MyCharacter.toUpperCase('b'): " + MyCharacter.toUpperCase('b')); // B
        System.out.println("MyCharacter.toUpperCase('B'): " + MyCharacter.toUpperCase('B')); // B

        System.out.println("MyCharacter.toLowerCase('G'): " + MyCharacter.toLowerCase('G')); // g
        System.out.println("MyCharacter.toLowerCase('g'): " + MyCharacter.toLowerCase('g')); // g
    }
}
