public class Application {
    public static void main(String[] args) {

        Phone samsung = new Phone(1875450, "Model X", 105.22);
        Phone iphone = new Phone(154464, "Model Y", 97.2);
        Phone huawei = new Phone(1754564, "Model H", 115.0);

        System.out.println(samsung);
        System.out.println(iphone);
        System.out.println(huawei);

        samsung.receiveCall("Alex", 8921123456L);
        iphone.receiveCall("Oleg", 234234234L);

        String[] numbers = {"987654321", "6543214654", "354564545"};
        huawei.sendMessages(numbers);

//        Good headphones = new Good("Sony", 2998.99, 56);
////        headphones.name = "Sony";
////        headphones.availableCount = 56;
//        Good mouse = new Good("Logitech", 1688.5, 10);
//
//        System.out.println(headphones.name + ", count: " + headphones.availableCount);
//        System.out.println(mouse.name + ", count: " + mouse.availableCount);
//
//        System.out.println();
//
//        String ps = headphones.asPrettyString();
//        System.out.println(ps);
//        System.out.println(mouse.asPrettyString());
//
//
//        System.out.println(headphones.fullPrice(3, 25));
//        System.out.println(headphones.fullPrice(5, 30));
//
//
//        System.out.println();
//        ShoppingList list = new ShoppingList();
//
//        list.addToList(headphones, 2);
//        list.addToList(mouse, 10);
//
//
//        Good monitor = new Good("ASUS XMonitor", 23547.54, 2);
//        Good keyboard = new Good("Logitech Keyboard Y", 8887.99, 10);
//
//        // int[] limits = new int[] { 56, 345, 34, 34 };    -> [56, 345, 34, 34]
//        Good[] selectedGoods = new Good[] { monitor, keyboard }; // [monitor, keyboard]
//        list.addToList(selectedGoods);
//
//        list.printShoppingList();


    }

}
