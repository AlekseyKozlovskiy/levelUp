package lvlUp7.first;

public class Factorial {
    public static long factorial (int number) {
        long tmp = 1;
        for (int i = 1; i <= number ; i++) {
            tmp  *= i;
        }
        return tmp;
    }

}
