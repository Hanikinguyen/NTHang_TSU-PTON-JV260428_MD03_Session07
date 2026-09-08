public class Ex07 {

    public static void main(String[] args) {

        // Tạo hai phân số
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);

        System.out.println("Phân số 1: " + f1);
        System.out.println("Phân số 2: " + f2);

        // Cộng
        Fraction sum = f1.add(f2);
        System.out.println("Cộng: " + sum);

        // Trừ
        Fraction difference = f1.subtract(f2);
        System.out.println("Trừ: " + difference);

        // Nhân
        Fraction product = f1.multiply(f2);
        System.out.println("Nhân: " + product);

        // Chia
        Fraction quotient = f1.divide(f2);
        System.out.println("Chia: " + quotient);
    }
}