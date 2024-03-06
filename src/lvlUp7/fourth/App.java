package lvlUp7.fourth;

public class App {
    public static void main(String[] args) {
        int[] mass = {5, 1, 4, 6, 0, 2, 1, -9};
        for (int i : ArraySorting.bubbleSort(mass)) {
            System.out.print(i);
        }

    }
}
