package secondPartOfHomeWork;

public class Order {
    private String name;
    private double price;
    private int count;

    public Order(Product product, int count) {
        this.name = product.getName();
        this.price = product.getPrice();
        this.count = count;
    }

    public double totalPrice() {
        return this.count * this.price;
    }

    public int getCount() {
        return count;
    }
}
