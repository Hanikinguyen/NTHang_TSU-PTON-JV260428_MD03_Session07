import java.util.Scanner;

public class Student08 {
    private int id;
    private String name;
    private int age;
    private Gender gender;
    private String address;
    private String phoneNumber;

    public Student08() {
    }

    public Student08(int id, String name, int age, Gender gender,
                     String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void inputData(Scanner sc) {
        System.out.print("Nhập mã sinh viên: ");
        id = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập tên sinh viên: ");
        name = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());

        System.out.println("Chọn giới tính:");
        System.out.println("1. Nam");
        System.out.println("2. Nữ");
        System.out.println("3. Khác");
        System.out.print("Lựa chọn: ");

        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1:
                gender = Gender.MALE;
                break;
            case 2:
                gender = Gender.FEMALE;
                break;
            case 3:
                gender = Gender.OTHER;
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                gender = Gender.OTHER;
        }

        System.out.print("Nhập địa chỉ: ");
        address = sc.nextLine();

        System.out.print("Nhập số điện thoại: ");
        phoneNumber = sc.nextLine();
    }

    public void displayData() {
        System.out.println("------------------------------");
        System.out.println("Mã sinh viên: " + id);
        System.out.println("Tên sinh viên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Số điện thoại: " + phoneNumber);
    }
}