import java.util.Scanner;

public class Ex08 {

    static Student08[] students = new Student08[100];
    static int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n========== QUẢN LÝ SINH VIÊN ==========");
            System.out.println("1. Hiển thị danh sách tất cả sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Sửa thông tin sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    displayStudents();
                    break;

                case 2:
                    addStudent(sc);
                    break;

                case 3:
                    updateStudent(sc);
                    break;

                case 4:
                    deleteStudent(sc);
                    break;

                case 5:
                    System.out.println("Đã thoát chương trình!");
                    sc.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    // 1. Hiển thị danh sách sinh viên
    public static void displayStudents() {

        if (count == 0) {
            System.out.println("Danh sách sinh viên đang trống!");
            return;
        }

        System.out.println("\n===== DANH SÁCH SINH VIÊN =====");

        for (int i = 0; i < count; i++) {
            students[i].displayData();
        }
    }

    // 2. Thêm sinh viên
    public static void addStudent(Scanner sc) {

        if (count >= students.length) {
            System.out.println("Danh sách đã đầy!");
            return;
        }

        Student08 student = new Student08();

        student.inputData(sc);

        // Kiểm tra mã sinh viên trùng
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == student.getId()) {
                System.out.println("Mã sinh viên đã tồn tại!");
                return;
            }
        }

        students[count] = student;
        count++;

        System.out.println("Thêm sinh viên thành công!");
    }

    // 3. Sửa thông tin sinh viên
    public static void updateStudent(Scanner sc) {

        System.out.print("Nhập mã sinh viên cần sửa: ");
        int id = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < count; i++) {

            if (students[i].getId() == id) {

                System.out.println("Nhập thông tin mới:");

                // Lưu lại mã cũ
                int oldId = students[i].getId();

                students[i].inputData(sc);

                // Không cho thay đổi mã sinh viên
                students[i].setId(oldId);

                System.out.println("Cập nhật thông tin thành công!");
                return;
            }
        }

        System.out.println("Không tìm thấy sinh viên có mã " + id);
    }

    // 4. Xóa sinh viên
    public static void deleteStudent(Scanner sc) {

        System.out.print("Nhập mã sinh viên cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < count; i++) {

            if (students[i].getId() == id) {

                // Dịch các phần tử phía sau lên
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }

                // Xóa phần tử cuối
                students[count - 1] = null;

                count--;

                System.out.println("Xóa sinh viên thành công!");
                return;
            }
        }

        System.out.println("Không tìm thấy sinh viên có mã " + id);
    }
}