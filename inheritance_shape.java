
import java.util.Scanner;




abstract class shape{
    abstract double calculateArea();
    void displayShape(){
        System.out.println("This is a shape.");
    }
}

interface drawable{
    void draw();
}

class circle extends shape implements drawable{
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea(){
        return (Math.PI*radius*radius);
    }

    public void draw(){
        System.out.println("Drawing a Circle.");
    }
}

class rectangle extends shape implements drawable{
    private double l;
    private double b;

    public rectangle(double l, double b) {
        this.l = l;
        this.b=b;
    }

    @Override
    double calculateArea() {
        return l*b;
    }

    public void draw(){
        System.out.println("Drawing a Rectangle.");
    }
}


public class inheritance_shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of Circle: ");
        double r = sc.nextDouble();
        System.out.print("Enter the length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter the breadth of rectangle: ");
        double b = sc.nextDouble();

        circle c = new circle(r);
        rectangle rec = new rectangle(l, b);

        System.out.println();

        c.displayShape();
        c.draw();
        System.out.println("Area of Circle: "+c.calculateArea());

        System.out.println();

        rec.displayShape();
        rec.draw();
        System.out.println("Area of Rectangle: "+rec.calculateArea());
        
        System.out.println();
    }
}
