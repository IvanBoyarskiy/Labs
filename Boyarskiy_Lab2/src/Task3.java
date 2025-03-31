import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

class StopWatch{

    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatch(){
        startTime = LocalTime.now();
    }
    public void start(){
        startTime = LocalTime.now();
    }
    public void stop(){
        endTime = LocalTime.now();
    }
    public long getElapsedTime(){
        return ChronoUnit.MILLIS.between(startTime, endTime);
    }
    public LocalTime get_startTime(){
        return startTime;
    }
    public LocalTime get_endTime(){
        return endTime;
    }

}

class workWithArray {

    private int[] array = new int[100000];

    public workWithArray(){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
    }
    public void print(){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("]");
    }
    public void selectionSort() {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        workWithArray array = new workWithArray();
        StopWatch timer = new StopWatch();
        timer.start();
        array.selectionSort();
        array.print();
        timer.stop();
        System.out.println("\n\nВремя выполнения - " + timer.getElapsedTime());
    }
}
