public class Book {

    // Thuộc tính private để đảm bảo tính bao đóng
    private String title;
    private String author;
    private double price;

    // Getter cho title
    public String getTitle() {
        return title;
    }

    // Setter cho title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter cho author
    public String getAuthor() {
        return author;
    }

    // Setter cho author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter cho price
    public double getPrice() {
        return price;
    }

    // Setter cho price
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Giá sách không được âm!");
        }
    }
}
