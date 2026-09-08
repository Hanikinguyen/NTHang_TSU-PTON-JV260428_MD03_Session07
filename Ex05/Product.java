public class Product {

    private String id;
    private String name;
    private double price;

    // Constructor
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getter và Setter cho id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter và Setter cho name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter và Setter cho price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Giá sản phẩm không được âm!");
        }
    }

    // Hiển thị thông tin sản phẩm
    public void display() {
        System.out.printf(
                "ID: %s | Tên: %s | Giá: %.2f%n",
                id, name, price
        );
    }
}
