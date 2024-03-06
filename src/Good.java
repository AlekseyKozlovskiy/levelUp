public class Good {
    String name;
    double price;
    double availableCount;

    // public Good() { }

    Good(String name, double price, double availableCount) {
        this.name = name;
        this.price = price;
        this.availableCount = availableCount;
    }

    // asPrettyString()
    String asPrettyString() {
        // Name: ..., available count: ...
        // String prettyString = "Name: " + name + ", available count: " + availableCount;
        // return prettyString;
        return "Name: " + name + ", available count: " + availableCount;
    }

    double fullPrice(double count, int discount) {
        // (count * price) - (discount/100) * (count*price) => (count*price) * (100 - discount)/100
        double priceWithoutDiscount = price * count;
        return priceWithoutDiscount * ((100d - discount) / 100d);
    }
}
