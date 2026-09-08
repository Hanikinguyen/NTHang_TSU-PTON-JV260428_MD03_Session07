import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Danh sách lưu các Category
        ArrayList<Category> categories = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== QUẢN LÝ DANH MỤC =====");
            System.out.println("1. Thêm mới danh mục");
            System.out.println("2. Hiển thị danh sách danh mục");
            System.out.println("3. Cập nhật danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("5. Tìm kiếm danh mục theo tên");
            System.out.println("6. Thoát");
            System.out.print("Nhập lựa chọn: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                // 1. Thêm danh mục
                case 1:
                    System.out.print("Nhập ID: ");
                    String id = sc.nextLine();

                    System.out.print("Nhập tên danh mục: ");
                    String name = sc.nextLine();

                    System.out.print("Nhập mô tả: ");
                    String description = sc.nextLine();

                    Category category = new Category(id, name, description);

                    categories.add(category);

                    System.out.println("Thêm danh mục thành công!");
                    break;

                // 2. Hiển thị danh sách
                case 2:
                    if (categories.isEmpty()) {
                        System.out.println("Danh sách danh mục đang trống!");
                    } else {
                        System.out.println("\n===== DANH SÁCH DANH MỤC =====");

                        for (Category c : categories) {
                            c.display();
                        }
                    }
                    break;

                // 3. Cập nhật danh mục
                case 3:
                    System.out.print("Nhập ID danh mục cần cập nhật: ");
                    String updateId = sc.nextLine();

                    boolean foundUpdate = false;

                    for (Category c : categories) {
                        if (c.getId().equals(updateId)) {

                            System.out.print("Nhập tên mới: ");
                            String newName = sc.nextLine();

                            System.out.print("Nhập mô tả mới: ");
                            String newDescription = sc.nextLine();

                            c.setName(newName);
                            c.setDescription(newDescription);

                            System.out.println("Cập nhật danh mục thành công!");

                            foundUpdate = true;
                            break;
                        }
                    }

                    if (!foundUpdate) {
                        System.out.println("Không tìm thấy danh mục có ID: " + updateId);
                    }

                    break;

                // 4. Xóa danh mục
                case 4:
                    System.out.print("Nhập ID danh mục cần xóa: ");
                    String deleteId = sc.nextLine();

                    boolean foundDelete = false;

                    for (int i = 0; i < categories.size(); i++) {

                        if (categories.get(i).getId().equals(deleteId)) {

                            categories.remove(i);

                            System.out.println("Xóa danh mục thành công!");

                            foundDelete = true;
                            break;
                        }
                    }

                    if (!foundDelete) {
                        System.out.println("Không tìm thấy danh mục có ID: " + deleteId);
                    }

                    break;

                // 5. Tìm kiếm theo tên
                case 5:
                    System.out.print("Nhập tên danh mục cần tìm: ");
                    String searchName = sc.nextLine();

                    boolean foundSearch = false;

                    for (Category c : categories) {

                        if (c.getName().toLowerCase()
                                .contains(searchName.toLowerCase())) {

                            c.display();
                            foundSearch = true;
                        }
                    }

                    if (!foundSearch) {
                        System.out.println("Không tìm thấy danh mục phù hợp!");
                    }

                    break;

                // 6. Thoát
                case 6:
                    System.out.println("Đã thoát chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 6);

        sc.close();
    }
}
