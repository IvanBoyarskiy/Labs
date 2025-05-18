import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task1 {

    public static class GeometricObject {

        private String color;
        private boolean filled;
        private Date dateCreated;

        public GeometricObject(){
            this.color = "red";
            this.filled = true;
            Date now = new Date();
            dateCreated = getDate(now);
        }
        public GeometricObject(String color, boolean filled){
            this.color = color;
            this.filled = filled;
            Date now = new Date();
            dateCreated = getDate(now);
        }
        public static Date getDate(Date date) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            return cal.getTime();
        }

        public String getColor(){
            return color;
        }
        public void setColor(String color){
            this.color = color;
        }
        public boolean isFilled(){
            return filled;
        }
        public void setFilled(boolean filled){
            this.filled = filled;
        }

        public Date getDateCreated() {
            return dateCreated;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    public static class Triangle extends GeometricObject{
        private double side1;
        private double side2;
        private double side3;

        public Triangle(){
            super();
            side1 = 1.0;
            side2 = 1.0;
            side3 = 1.0;
        }
        public Triangle(double side1, double side2, double side3){
            super();
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        public Triangle(double side1, double side2, double side3, String color, boolean filled){
            super(color, filled);
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        public double getSide1() {
            return side1;
        }
        public double getSide2() {
            return side2;
        }
        public double getSide3() {
            return side3;
        }
        public double getArea(){
            double s = (side1 + side2 + side3) / 2;
            return sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }
        public double getPerimeter(){
            return side1 + side2 + side3;
        }

        @Override
        public String toString() {
            return "Треугольник: сторона1 = " + side1 + " сторона2 = " + side2 +
                    " сторона3 = " + side3;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону 1");
        double side1 = sc.nextDouble();
        System.out.println("Введите сторону 2");
        double side2 = sc.nextDouble();
        System.out.println("Введите сторону 3");
        double side3 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Введите цвет");
        String color = sc.nextLine();
        System.out.println("Фигура закрашена? true/false");
        boolean filled = sc.nextBoolean();

        Triangle figure = new Triangle(side1, side2, side3, color, filled);
        System.out.println(figure.getDateCreated() + "\n" +
                figure.getColor() + "\n" +
                figure.isFilled());
        System.out.println(figure);
        System.out.println(figure.getArea());
        System.out.println(figure.getPerimeter());

    }
}
