import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Tạo danh sách sinh viên
        ArrayList<Student> students = new ArrayList<>();

        // Thêm sẵn các đối tượng Student
        students.add(new Student("Nguyen Van An", 20, "Java01", 8.5));
        students.add(new Student("Tran Thi Binh", 21, "Java01", 7.2));
        students.add(new Student("Le Van Cuong", 20, "Java02", 9.0));
        students.add(new Student("Pham Thi Dung", 22, "Java02", 6.5));
        students.add(new Student("Hoang Van Nam", 21, "Java01", 5.8));
        students.add(new Student("Nguyen Thi Hoa", 20, "Java02", 8.0));

        // Nhập điểm min
        System.out.print("Nhập điểm min: ");
        double min = sc.nextDouble();

        // Nhập điểm max
        System.out.print("Nhập điểm max: ");
        double max = sc.nextDouble();

        System.out.println("\n=== DANH SÁCH SINH VIÊN ===");

        boolean found = false;

        // Tìm sinh viên có điểm trong khoảng min -> max
        for (Student student : students) {

            if (student.getAvgScore() >= min
                    && student.getAvgScore() <= max) {

                student.display();
                found = true;
            }
        }

        // Không tìm thấy sinh viên
        if (!found) {
            System.out.println(
                    "Không có sinh viên nào có điểm trong khoảng "
                            + min + " đến " + max
            );
        }

        sc.close();
    }
}
