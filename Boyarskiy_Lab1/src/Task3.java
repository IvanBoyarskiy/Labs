import java.time.*;

class Date {
    private long time;

    public Date(long time) {
        this.time = time;
    }

    public void printData() {
        Instant instant = Instant.ofEpochSecond(time);
        ZonedDateTime zonedTime = ZonedDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println("Прошло секунд: " +time + "\nДата и время: " + zonedTime + "\n");
    }
}

public class Task3 {
    public static void main(String[] args) {
        Date time1 = new Date(10000);
        Date time2 = new Date(100000);
        Date time3 = new Date(1000000);
        Date time4 = new Date(10000000);
        Date time5 = new Date(100000000);
        Date time6 = new Date(1000000000);
        Date time7 = new Date(10000000000l);
        Date time8 = new Date(100000000000l);

        time1.printData();
        time2.printData();
        time3.printData();
        time4.printData();
        time5.printData();
        time6.printData();
        time7.printData();
        time8.printData();
    }
}
