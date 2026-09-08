import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Danh sách sản phẩm
        ArrayList<Product> products = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n********** QUẢN LÝ SẢN PHẨM **********");
            System.out.println("1. Thêm mới sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Thoát");
            System.out.println("***************************************");

            System.out.print("Lựa chọn của bạn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                // 1. Thêm sản phẩm
                case 1:
                    System.out.print("Nhập ID sản phẩm: ");
                    String id = sc.nextLine();

                    System.out.print("Nhập tên sản phẩm: ");
                    String name = sc.nextLine();

                    System.out.print("Nhập giá sản phẩm: ");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    Product product = new Product(id, name, price);

                    products.add(product);

                    System.out.println("Thêm sản phẩm thành công!");
                    break;


                // 2. Hiển thị danh sách
                case 2:
                    if (products.isEmpty()) {
                        System.out.println("Danh sách sản phẩm đang trống!");
                    } else {
                        System.out.println("\n=== DANH SÁCH SẢN PHẨM ===");

                        for (Product p : products) {
                            p.display();
                        }
                    }
                    break;


                // 3. Cập nhật sản phẩm
                case 3:
                    System.out.print("Nhập ID sản phẩm cần cập nhật: ");
                    String updateId = sc.nextLine();

                    boolean foundUpdate = false;

                    for (Product p : products) {

                        if (p.getId().equals(updateId)) {

                            System.out.print("Nhập tên mới: ");
                            String newName = sc.nextLine();

                            System.out.print("Nhập giá mới: ");
                            double newPrice = sc.nextDouble();
                            sc.nextLine();

                            // Cập nhật bằng setter
                            p.setName(newName);
                            p.setPrice(newPrice);

                            System.out.println("Cập nhật sản phẩm thành công!");

                            foundUpdate = true;
                            break;
                        }
                    }

                    if (!foundUpdate) {
                        System.out.println("Không tìm thấy sản phẩm có ID: " + updateId);
                    }

                    break;


                // 4. Xóa sản phẩm
                case 4:
                    System.out.print("Nhập ID sản phẩm cần xóa: ");
                    String deleteId = sc.nextLine();

                    boolean foundDelete = false;

                    for (int i = 0; i < products.size(); i++) {

                        if (products.get(i).getId().equals(deleteId)) {

                            products.remove(i);

                            System.out.println("Xóa sản phẩm thành công!");

                            foundDelete = true;
                            break;
                        }
                    }

                    if (!foundDelete) {
                        System.out.println("Không tìm thấy sản phẩm có ID: " + deleteId);
                    }

                    break;


                // 5. Thoát
                case 5:
                    System.out.println("Đã thoát chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 5);

        sc.close();
    }
}
