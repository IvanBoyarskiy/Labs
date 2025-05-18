public class Task2 {

    public static class MyStringBuilder1 {
        private char[] value;
        private int count;

        public MyStringBuilder1(String s) {
            value = s.toCharArray();
            count = value.length;
        }

        public MyStringBuilder1 append(MyStringBuilder1 s) {
            char[] newValue = new char[count + s.count];
            System.arraycopy(value, 0, newValue, 0, count);
            System.arraycopy(s.value, 0, newValue, count, s.count);
            value = newValue;
            count += s.count;
            return this;
        }

        public MyStringBuilder1 append(int i) {
            String intStr = Integer.toString(i);
            char[] intChars = intStr.toCharArray();
            char[] newValue = new char[count + intChars.length];
            System.arraycopy(value, 0, newValue, 0, count);
            System.arraycopy(intChars, 0, newValue, count, intChars.length);
            value = newValue;
            count += intChars.length;
            return this;
        }

        public int length() {
            return count;
        }

        public char charAt(int index) {
            if (index < 0 || index >= count) throw new IndexOutOfBoundsException();
            return value[index];
        }

        public MyStringBuilder1 toLowerCase() {
            char[] lower = new char[count];
            for (int i = 0; i < count; i++) {
                char c = value[i];
                if (c >= 'A' && c <= 'Z') {
                    lower[i] = (char) (c + ('a' - 'A'));
                } else {
                    lower[i] = c;
                }
            }
            return new MyStringBuilder1(new String(lower));
        }

        public MyStringBuilder1 substring(int begin, int end) {
            if (begin < 0 || end > count || begin > end) throw new IndexOutOfBoundsException();
            char[] sub = new char[end - begin];
            System.arraycopy(value, begin, sub, 0, end - begin);
            return new MyStringBuilder1(new String(sub));
        }

        public String toString() {
            return new String(value, 0, count);
        }
    }


    public static void main(String[] args){
        MyStringBuilder1 sb1 = new MyStringBuilder1("Hello");
        MyStringBuilder1 sb2 = new MyStringBuilder1("World");

        sb1.append(sb2);
        System.out.println("append(sb2): " + sb1); // HelloWorld

        sb1.append(123);
        System.out.println("append(123): " + sb1); // HelloWorld123

        System.out.println("length: " + sb1.length()); // 13

        System.out.println("charAt(1): " + sb1.charAt(1)); // e

        System.out.println("toLowerCase: " + sb1.toLowerCase()); // helloworld123

        System.out.println("substring(5,10): " + sb1.substring(5, 10)); // World

        System.out.println("toString: " + sb1.toString()); // HelloWorld123
    }
}
