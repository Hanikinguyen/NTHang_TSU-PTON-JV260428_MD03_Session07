public class Fraction {

    private int numerator;
    private int denominator;

    // Constructor
    public Fraction(int numerator, int denominator) {

        if (denominator == 0) {
            throw new IllegalArgumentException("Mẫu số không được bằng 0!");
        }

        this.numerator = numerator;
        this.denominator = denominator;

        simplify();
    }

    // Getter
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // Setter
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

    public void setDenominator(int denominator) {

        if (denominator == 0) {
            throw new IllegalArgumentException("Mẫu số không được bằng 0!");
        }

        this.denominator = denominator;
        simplify();
    }

    // Cộng hai phân số
    public Fraction add(Fraction other) {

        int newNumerator =
                this.numerator * other.denominator
                        + other.numerator * this.denominator;

        int newDenominator =
                this.denominator * other.denominator;

        return new Fraction(newNumerator, newDenominator);
    }

    // Trừ hai phân số
    public Fraction subtract(Fraction other) {

        int newNumerator =
                this.numerator * other.denominator
                        - other.numerator * this.denominator;

        int newDenominator =
                this.denominator * other.denominator;

        return new Fraction(newNumerator, newDenominator);
    }

    // Nhân hai phân số
    public Fraction multiply(Fraction other) {

        int newNumerator =
                this.numerator * other.numerator;

        int newDenominator =
                this.denominator * other.denominator;

        return new Fraction(newNumerator, newDenominator);
    }

    // Chia hai phân số
    public Fraction divide(Fraction other) {

        if (other.numerator == 0) {
            throw new ArithmeticException("Không thể chia cho phân số 0!");
        }

        int newNumerator =
                this.numerator * other.denominator;

        int newDenominator =
                this.denominator * other.numerator;

        return new Fraction(newNumerator, newDenominator);
    }

    // Tìm ước chung lớn nhất
    private int gcd(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // Rút gọn phân số
    public void simplify() {

        int gcd = gcd(numerator, denominator);

        numerator = numerator / gcd;
        denominator = denominator / gcd;

        // Đưa dấu âm lên tử số
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // Chuyển phân số thành String
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}