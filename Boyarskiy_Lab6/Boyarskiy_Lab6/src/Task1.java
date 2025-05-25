

public class Task1 {

    public static class MyString1 {
        private char[] chars;

        public MyString1(char[] chars) {
            if (chars != null) {
                this.chars = new char[chars.length];
                System.arraycopy(chars, 0, this.chars, 0, chars.length);
            }
        }

        public char charAt(int index) {
            if (index >= 0 && index < chars.length) {
                return chars[index];
            }
            return 0;
        }

        public int length() {
            int length = 0;
            try {
                while (true) {
                    char c = chars[length];
                    length++;
                }
            } catch (ArrayIndexOutOfBoundsException e) {}
            return length;
        }

        public MyString1 substring(int begin, int end) {
            if (begin < 0 || end > chars.length || begin > end) {
                throw new IndexOutOfBoundsException("begin: " + begin + ", end: " + end + ", length: " + chars.length);
            }
            char[] subChars = new char[end - begin];
            System.arraycopy(chars, begin, subChars, 0, end - begin);
            return new MyString1(subChars);
        }


        public MyString1 toLowerCase() {
            char[] lowerChars = new char[chars.length];
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if (c >= 'A' && c <= 'Z') {
                    lowerChars[i] = (char) (c + ('a' - 'A'));
                } else {
                    lowerChars[i] = c;
                }
            }
            return new MyString1(lowerChars);
        }

        public static MyString1 valueOf(int i) {
            // Используем стандартный Integer.toString и создаем MyString1
            String s = Integer.toString(i);
            return new MyString1(s.toCharArray());
        }

        public char[] toChars() {
            char[] copy = new char[chars.length];
            System.arraycopy(chars, 0, copy, 0, chars.length);
            return copy;
        }

        public boolean equals(MyString1 obj) {
            if (this == obj) return true;
            if (obj == null) return false;
            if (this.chars.length != obj.chars.length) return false;
            for (int i = 0; i < chars.length; i++) {
                if (this.chars[i] != obj.chars[i]) return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return new String(chars);
        }
    }


    public static void main(String[] args) {
        MyString1 s = new MyString1(new char[] {'H', 'e', 'L', 'L', 'o'});

        System.out.println("charAt(1): " + s.charAt(1)); // e
        System.out.println("length: " + s.length()); // 5
        MyString1 sub = s.substring(1, 4);
        System.out.println("substring(1,4): " + sub); // "eLL"
        MyString1 lower = s.toLowerCase();
        System.out.println("toLowerCase: " + lower); // "hello"
        MyString1 fromInt = MyString1.valueOf(12345);
        System.out.println("valueOf(12345): " + fromInt); // "12345"
        char[] chars = s.toChars();
        System.out.print("toChars: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();
        MyString1 s2 = new MyString1(new char[] {'H', 'e', 'L', 'L', 'o'});
        System.out.println("equals s and s2: " + s.equals(s2)); // true
        MyString1 s3 = new MyString1(new char[] {'h', 'e', 'l', 'l', 'o'});
        System.out.println("equals s and s3: " + s.equals(s3)); // false
    }
}
