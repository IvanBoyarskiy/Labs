public class Task3 {
    public static class MyStringBuilder2 {
        private char[] value;
        private int count;

        public MyStringBuilder2() {
            value = new char[16];
            count = 0;
        }

        public MyStringBuilder2(char[] chars) {
            value = new char[chars.length];
            System.arraycopy(chars, 0, value, 0, chars.length);
            count = chars.length;
        }

        public MyStringBuilder2(String s) {
            value = s.toCharArray();
            count = value.length;
        }

        public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
            if (offset < 0 || offset > count) throw new IndexOutOfBoundsException();
            char[] insertValue = s.value;
            int insertLen = s.count;
            ensureCapacity(count + insertLen);
            // Сдвигаем хвост вправо
            System.arraycopy(value, offset, value, offset + insertLen, count - offset);
            // Копируем вставляемое значение
            System.arraycopy(insertValue, 0, value, offset, insertLen);
            count += insertLen;
            return this;
        }

        public MyStringBuilder2 reverse() {
            for (int i = 0, j = count - 1; i < j; i++, j--) {
                char tmp = value[i];
                value[i] = value[j];
                value[j] = tmp;
            }
            return this;
        }

        public MyStringBuilder2 substring(int begin) {
            if (begin < 0 || begin > count) throw new IndexOutOfBoundsException();
            char[] sub = new char[count - begin];
            System.arraycopy(value, begin, sub, 0, count - begin);
            return new MyStringBuilder2(sub);
        }

        public MyStringBuilder2 toUpperCase() {
            char[] upper = new char[count];
            for (int i = 0; i < count; i++) {
                char c = value[i];
                if (c >= 'a' && c <= 'z') {
                    upper[i] = (char) (c - ('a' - 'A'));
                } else {
                    upper[i] = c;
                }
            }
            return new MyStringBuilder2(upper);
        }

        public String toString() {
            return new String(value, 0, count);
        }

        private void ensureCapacity(int minimumCapacity) {
            if (minimumCapacity > value.length) {
                int newCapacity = Math.max(value.length * 2, minimumCapacity);
                char[] newValue = new char[newCapacity];
                System.arraycopy(value, 0, newValue, 0, count);
                value = newValue;
            }
        }
    }


    public static void main(String[] args){
        MyStringBuilder2 sb1 = new MyStringBuilder2("Hello");
        MyStringBuilder2 sb2 = new MyStringBuilder2(new char[]{' ', 'J', 'a', 'v', 'a'});
        MyStringBuilder2 sb3 = new MyStringBuilder2("!!!");

        System.out.println("sb1: " + sb1); // Hello
        System.out.println("sb2: " + sb2); //  Java

        sb1.insert(5, sb2);
        System.out.println("After insert: " + sb1); // Hello Java

        sb1.reverse();
        System.out.println("After reverse: " + sb1); // avaJ olleH

        MyStringBuilder2 sub = sb1.substring(3);
        System.out.println("substring(3): " + sub); // J olleH

        MyStringBuilder2 upper = sub.toUpperCase();
        System.out.println("toUpperCase: " + upper); // J OLLEH

        upper.insert(0, sb3);
        System.out.println("insert at beginning: " + upper); // !!!J OLLEH
    }
}
