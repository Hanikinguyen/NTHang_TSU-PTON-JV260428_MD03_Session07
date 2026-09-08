public class Ex02 {

    public static void main(String[] args) {

        // Khởi tạo đối tượng Book
        Book book = new Book();

        // Thiết lập thông tin cho sách bằng setter
        book.setTitle("Lập trình Java");
        book.setAuthor("Nguyễn Văn A");
        book.setPrice(150000);

        // Hiển thị thông tin bằng getter
        System.out.println("=== THÔNG TIN SÁCH ===");
        System.out.println("Tên sách: " + book.getTitle());
        System.out.println("Tác giả: " + book.getAuthor());
        System.out.println("Giá sách: " + book.getPrice());

        // Thử thay đổi giá sách
        System.out.println("\n=== THAY ĐỔI GIÁ SÁCH ===");

        book.setPrice(200000);

        System.out.println("Giá sách mới: " + book.getPrice());

        // Thử nhập giá âm
        System.out.println("\n=== KIỂM TRA GIÁ ÂM ===");

        book.setPrice(-50000);

        System.out.println("Giá sách hiện tại: " + book.getPrice());
    }
}