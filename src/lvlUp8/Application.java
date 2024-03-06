package lvlUp8;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        // Список
        //  - добавление элемента в список - add
        //  - удаление элемента из начала списка - removeFirst
        //  - возможность взаимозаменять эти две реализации (DynamicList vs OneLinkedList)

        IntList intList = (IntList) new OneLinkedList();

        intList.add(6);
        intList.add(9);
        intList.add(10);

        intList.add(3);
        // 6, 9, 10, 3
        intList.display();
        intList.removeFirst();
        intList.addFirst(444);
        System.out.println(intList.get(1));
        intList.removeLast();
        intList.display();

        intList.add(7);
        intList.add(33);
        intList.add(65);
        intList.add(34);
        intList.add(73);
        intList.add(91);

//        intList.display();

        intList.add(94);
        intList.add(60);
        intList.add(34);

//        intList.display();


//        List<int[]> listOfArrays;
//        List<Integer>[] arrayOfLists;
//        List<List<Integer>> listOfLists;

    }


    // public static void printAny(... list) { }

//    public static void print(DynamicList list) {
//        System.out.println(list.toString());
//    }
//
//    public static void print(OneLinkedList list) {
//        System.out.println(list.toString());
//    }

}
