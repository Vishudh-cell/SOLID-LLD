class Rectangle {
    int length;
    int width;
    private static int count = 0;

    Rectangle(Rectangle r) {
        this.length = r.length;
        this.width = r.width;
        count++;
    }

    static int getCount() {
        return count;
    }

    Rectangle() {

    }
}

public class constructors {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.width = 5;
        Rectangle r2 = new Rectangle(r1);
        Rectangle r3 = new Rectangle(r2);
        System.out.println("Rectangle 1: length = " + r1.length + ", width = " + r1.width);
        System.out.println("Rectangle 2: length = " + r2.length + ", width = " + r2.width);
        System.out.println("Rectangle 3: length = " + r3.length + ", width = " + r3.width);
        System.out.println("Number of rectangles created: " + Rectangle.getCount());
    }
}