package lvlUp7.third;

import java.util.Random;

public class Mass {
    private static int negativeCount = 0;
    private static int positiveCount = 0;
    private static int[] mass = new int[12];


    public static int[] fillMass() {
        while (negativeCount != 6 && positiveCount != 6) {
            for (int i = 0; i < mass.length; i++) {
                int rand = random();

                if (rand == 0) {
                    i -= 1;
                    continue;
                }
                if (rand < 0) {
                    if (!checkNegative(rand)) {
                        i -= 1;
                        continue;
                    }
                    negativeCount++;
                } else {
                    if (!checkPositive(rand)) {
                        i -= 1;
                        continue;
                    }
                    positiveCount++;
                }
                mass[i] = rand;
            }

        }
        return mass;
    }

    private static int random() {
        return new Random().nextInt(10 + 10) - 10;
    }

    private static boolean checkPositive(int number) {
        return positiveCount != 6;
    }

    private static boolean checkNegative(int number) {
        return negativeCount != 6;
    }
}
