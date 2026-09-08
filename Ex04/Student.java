public class Student {

    // Thuộc tính
    private String name;
    private int age;
    private String className;
    private double avgScore;

    // Constructor
    public Student(String name, int age, String className, double avgScore) {
        this.name = name;
        this.age = age;
        this.className = className;
        this.avgScore = avgScore;
    }

    // Getter cho name
    public String getName() {
        return name;
    }

    // Setter cho name
    public void setName(String name) {
        this.name = name;
    }

    // Getter cho age
    public int getAge() {
        return age;
    }

    // Setter cho age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter cho className
    public String getClassName() {
        return className;
    }

    // Setter cho className
    public void setClassName(String className) {
        this.className = className;
    }

    // Getter cho avgScore
    public double getAvgScore() {
        return avgScore;
    }

    // Setter cho avgScore
    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    // Hiển thị thông tin sinh viên
    public void display() {
        System.out.println(
                "Tên: " + name
                        + " | Tuổi: " + age
                        + " | Lớp: " + className
                        + " | Điểm TB: " + avgScore
        );
    }
}
