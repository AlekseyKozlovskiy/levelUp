package lvlUp7.second;

public class Main {

    public static void main(String[] args) {
        Point l1 = new Point(0, 2);
        Point r1 = new Point(2, 0);
        Point l2 = new Point(5, 5);
        Point r2 = new Point(15, 15);

        Rectangle first = new Rectangle(l1, r1);
        Rectangle second = new Rectangle(l2, r2);

        if (first.isOverLapping(second)) {
            System.out
                    .println("Yes");
        } else {
            System.out
                    .println("No");
        }
    }
}

