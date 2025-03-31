class Rectangle {

    private double width;
    private double height;

    public Rectangle() {
        width = -1;
        height = -1;
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimetre(){
        return 2 * (width + height);
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Rectangle figure1 = new Rectangle();
        Rectangle figure2 = new Rectangle(3.5, 35.9);
        System.out.print("Ширина фигуры 1: " + figure1.getWidth() + "\nВысота фигуры 1: " + figure1.getHeight()
                + "\nПлощадь фигуры 1: " + figure1.getArea() + "\nПериметр фигуры 1: " + figure1.getPerimetre() + "\n");
        System.out.print("\n");
        System.out.print("Ширина фигуры 2: " + figure2.getWidth() + "\nВысота фигуры 2: " + figure2.getHeight()
                + "\nПлощадь фигуры 2: " + figure2.getArea() + "\nПериметр фигуры 2: " + figure2.getPerimetre() + "\n");

    }
}