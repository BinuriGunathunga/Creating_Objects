public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Area rectangle = new Area();
        double length = 5.0;
        double breadth = 10.0;
        rectangle.setDim(length, breadth);
        double area = rectangle.getArea();
        System.out.println("Area of rectangle with length " + length + " and breadth " + breadth + " is: " + area);
    }
}
