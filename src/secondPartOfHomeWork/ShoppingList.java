package secondPartOfHomeWork;

public class ShoppingList {
    private Order[] orders;
    private int ordersInsertIndex;
    private int ordersCount;
    private double totalPrice;


    public ShoppingList() {
        this.orders = new Order[10];
        this.ordersInsertIndex = 0;
        this.ordersCount = 0;
    }

    public void addToList(Product product, int count) {
        Order order = new Order(product, count);
        orders[ordersInsertIndex] = order;
        ordersInsertIndex++;
        ordersCount++;
        totalPrice = totalPrice + order.totalPrice();
    }

    public void printShoppingList() {
        int productsCount = 0;
        for (int i = 0; i < ordersCount; i++) {
            productsCount = productsCount + orders[i].getCount();
        }
        System.out.println("Всего заказали товара: " + productsCount);
    }

    public void adjustPrice(int discount) {
        totalPrice =  totalPrice * ((100d - discount) / 100d);
    }


}
