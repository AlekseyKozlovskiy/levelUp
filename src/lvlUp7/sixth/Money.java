package lvlUp7.sixth;

public class Money {
    int rubble;
    int penny;

    public Money(int rubble, int penny) {
        this.rubble = rubble;
        this.penny = penny;
    }

    public Money plus(Money money) {
        float sum = convertToFloat(this) + convertToFloat(money);
        return convertToMoney(sum);
    }
    public Money minus(Money money) {
        float minus = convertToFloat(this) - convertToFloat(money);
        return convertToMoney(minus);
    }

    public Money multiplication(Money money) {
        float minus = convertToFloat(this) * convertToFloat(money);
        return convertToMoney(minus);
    }

    public Money division(Money money) {
        float minus = convertToFloat(this) / convertToFloat(money);
        return convertToMoney(minus);
    }

    private float convertToFloat(Money money) {
        String string = money.rubble + "." + money.penny;
        return Float.parseFloat(string);
    }

    private Money convertToMoney(float f) {
        String s = String.valueOf(f).split("\\.")[1].substring(0, 2);
        return new Money((int) f, Integer.parseInt(s));
    }


    @Override
    public String toString() {
        return rubble + "," + penny;
    }
}
