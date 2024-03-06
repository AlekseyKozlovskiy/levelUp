package secondPartOfHomeWork;

public class Product {
    private String name;
    private double price;
    private double availableCount;

    public Product(String name, double price, double availableCount) {
        this.name = name;
        this.price = price;
        this.availableCount = availableCount;
    }

    String asPrettyString() {
        return "Name: " + name + ", available count: " + availableCount;
    }

    double fullPrice(double count, int discount) {
        double priceWithoutDiscount = price * count;
        return priceWithoutDiscount * ((100d - discount) / 100d);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
