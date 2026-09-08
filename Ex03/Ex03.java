import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Tạo 2 đối tượng Person
        Person person1 = new Person();
        Person person2 = new Person();

        // Nhập thông tin Person 1
        System.out.println("=== NHẬP THÔNG TIN NGƯỜI THỨ NHẤT ===");

        System.out.print("Nhập tên: ");
        String name1 = sc.nextLine();
        person1.setName(name1);

        System.out.print("Nhập tuổi: ");
        int age1 = sc.nextInt();
        person1.setAge(age1);

        sc.nextLine();

        // Nhập thông tin Person 2
        System.out.println("\n=== NHẬP THÔNG TIN NGƯỜI THỨ HAI ===");

        System.out.print("Nhập tên: ");
        String name2 = sc.nextLine();
        person2.setName(name2);

        System.out.print("Nhập tuổi: ");
        int age2 = sc.nextInt();
        person2.setAge(age2);

        // So sánh tuổi
        System.out.println("\n=== KẾT QUẢ ===");

        if (person1.getAge() > person2.getAge()) {
            System.out.println(person1.getName() + " lớn tuổi hơn.");
        } else if (person1.getAge() < person2.getAge()) {
            System.out.println(person2.getName() + " lớn tuổi hơn.");
        } else {
            System.out.println("Hai người bằng tuổi nhau.");
        }

        sc.close();
    }
}
