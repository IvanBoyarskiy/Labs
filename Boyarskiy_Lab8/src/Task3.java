import java.util.ArrayList;
import java.util.Date;

import static java.lang.Math.sqrt;

public class Task3 {

    public static class Triangle extends Task1.GeometricObject {
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

    public static class Circle extends Task1.GeometricObject {
        private double radius;

        public Circle() {
            this.radius = 1.0;
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle(double radius, String color, boolean filled) {
            super(color, filled);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        public double getDiameter() {
            return 2 * radius;
        }

        public void printCircle() {
            System.out.println("Circle: radius = " + radius);
        }

        @Override
        public String toString() {
            return "Круг: Радиус = " + radius;
        }
    }

    public static void main(String[] args){
        ArrayList<Object> list = new ArrayList<>();

        list.add(new Triangle(3.2, 3.2, 3.2));
        list.add(new Date());
        list.add("Hello, world!");
        list.add(new Circle(7.5));

        for (Object obj : list) {
            System.out.println(obj.toString());
        }
    }
}
