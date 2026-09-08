public class Rectangle {

    // Thuộc tính
    double length;
    double width;

    // Constructor mặc định
    public Rectangle() {
        length = 1;
        width = 1;
    }

    // Constructor có tham số
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Tính diện tích
    public double getArea() {
        return length * width;
    }

    // Tính chu vi
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Hiển thị thông tin
    public void display() {
        System.out.println("Chiều dài: " + length);
        System.out.println("Chiều rộng: " + width);
        System.out.println("Diện tích: " + getArea());
        System.out.println("Chu vi: " + getPerimeter());
    }
}