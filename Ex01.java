public class Ex01 {

    public static void main(String[] args) {

        // Tạo đối tượng bằng constructor mặc định
        Rectangle rectangle1 = new Rectangle();

        System.out.println("=== HÌNH CHỮ NHẬT 1 ===");
        rectangle1.display();

        // Tạo đối tượng bằng constructor có tham số
        Rectangle rectangle2 = new Rectangle(5, 3);

        System.out.println("\n=== HÌNH CHỮ NHẬT 2 ===");
        rectangle2.display();
    }
}