public class ShoppingList {
    private Good[] goods;
    private int goodInsertIndex;
    private int goodsCount;
    private double totalPrice;

    public ShoppingList() {
        this.goods = new Good[10];
        this.goodInsertIndex = 0;
        this.goodsCount = 0;
        this.totalPrice = 0.0d;
    }

    // Сигнатура метода: название метода + агрументы метода (их порядок и типы)

    // addToList(double, Good)
    // public void addToList(double count, Good good) { }
    public void addToList(Good[] goods) {
        for (int i = 0; i < goods.length; i++) {
            this.goods[goodInsertIndex] = goods[i];
            goodInsertIndex++;
            goodsCount++;

            totalPrice = totalPrice + goods[i].fullPrice(1, 0);
        }
    }

    // addToList(Good, double)
    public void addToList(Good good, double count) {
        // [null, null, ..., null]
        goods[goodInsertIndex] = good;
        goodInsertIndex++;
        goodsCount++;

        totalPrice = totalPrice + good.fullPrice(count, 0);
    }

    public void printShoppingList() {
        System.out.println("Total price: " + totalPrice);
        System.out.println("Shopping list: ");

        for (int i = 0; i < goodsCount; i++) {
            System.out.println(goods[i].asPrettyString());
        }

    }
}
