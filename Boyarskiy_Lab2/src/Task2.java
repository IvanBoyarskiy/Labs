import java.util.GregorianCalendar;

public class Task2 {
    public static void main(String[] args) {
        GregorianCalendar date = new GregorianCalendar();
        System.out.println("Текущая дата: " + date.get(GregorianCalendar.DAY_OF_MONTH) + "/" +
                (date.get(GregorianCalendar.MONTH)+1) + "/" + date.get(GregorianCalendar.YEAR));

        date.setTimeInMillis(1234567898765L);
        System.out.println("Измененная дата: " + date.get(GregorianCalendar.DAY_OF_MONTH) + "/" +
                (date.get(GregorianCalendar.MONTH)+1) + "/" + date.get(GregorianCalendar.YEAR));
    }
}
