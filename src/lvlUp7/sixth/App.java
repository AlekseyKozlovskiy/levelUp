package lvlUp7.sixth;

public class App {

    public static void main(String[] args) {
        Money money = new Money(15, 22);
        Money plus = money.plus(new Money(16, 5));
        System.out.println(plus);

        Money minus = money.minus(new Money(1, 1));
        System.out.println(minus);

        Money multiplication = money.multiplication(new Money(1, 1));
        System.out.println(multiplication);

        Money division = money.division(new Money(1, 1));
        System.out.println(division);
    }
}
