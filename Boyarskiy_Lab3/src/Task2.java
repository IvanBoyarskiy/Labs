class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(){
        long millies = System.currentTimeMillis();
        setTime(millies);
    }
    public MyTime(long millies){
        setTime(millies);
    }
    public MyTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int get_hour(){
        return this.hour;
    }
    public int get_minute(){
        return this.minute;
    }
    public int get_second(){
        return this.second;
    }
    public void setTime(long elapsedTime){
        int second = (int) (elapsedTime / 1000);
        this.second = second % 60;
        int minute = second / 60;
        this.minute = minute % 60;
        int hour = minute / 60;
        this.hour = hour % 24;
    }

    public String toString(){
        String formatedHour = String.format("%02d", hour);
        String formatedMinute = String.format("%02d", minute);
        String formatedSecond = String.format("%02d", second);

        return formatedHour + ":" + formatedMinute + ":" + formatedSecond;
    }


}

public class Task2 {
    public static void main(String[] args){
        MyTime mt1 = new MyTime();
        MyTime mt2 = new MyTime(555550000);
        MyTime mt3 = new MyTime(10, 19, 10);
        System.out.println(mt1);
        System.out.println(mt2);
        System.out.println(mt3);
    }
}
