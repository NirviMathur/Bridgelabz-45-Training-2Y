import java.util.*
;
class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayCircleDetails() {
        System.out.println("Radius of Circle: " + radius);
        System.out.println("Area of Circle: " + calculateArea());
        System.out.println("Circumference of Circle: " + calculateCircumference());
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(7.0); 
        c1.displayCircleDetails();
    }
}
