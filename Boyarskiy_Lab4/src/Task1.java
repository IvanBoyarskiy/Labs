import java.util.Date;
import java.util.GregorianCalendar;

class MyDate {

    private int year;
    private int month;
    private int day;
    private GregorianCalendar date = new GregorianCalendar();

    public MyDate(){
        this.year = date.get(GregorianCalendar.YEAR);
        this.month = date.get(GregorianCalendar.MONTH) + 1;
        this.day = date.get(GregorianCalendar.DAY_OF_MONTH);
    }
    public MyDate(long millies) {
        setDate(millies);
    }
    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void setDate(long elapsedTime){
        date.setTimeInMillis(elapsedTime);
        this.year = date.get(GregorianCalendar.YEAR);
        this.month = date.get(GregorianCalendar.MONTH) + 1;
        this.day = date.get(GregorianCalendar.DAY_OF_MONTH);

    }
    public String toString(){
        String formatedDay = String.format("%02d", day);
        String formatedMonth = String.format("%02d", month);

        return formatedDay + "/" + formatedMonth + "/" + year;
    }
}

public class Task1 {
    public static void main(String[] args) {
        MyDate md = new MyDate();
        MyDate md2 = new MyDate(34355555133101L);
        System.out.println("Дата сейчас - " + md);
        System.out.println("Дата спустя миллисекунды - " + md2);
    }
}