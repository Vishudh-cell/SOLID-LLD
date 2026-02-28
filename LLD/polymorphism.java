class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 and 3: " + calc.add(2, 3));
        System.out.println("Sum of 1, 2 and 3: " + calc.add(1, 2, 3));
        System.out.println("Sum of 2.5 and 3.5: " + calc.add(2.5, 3.5));
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);
        System.out.println("Area of Circle with radius 5: " + s1.area());
        System.out.println("Area of Rectangle with length 4 and width 6: " + s2.area());
    }
}

class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}