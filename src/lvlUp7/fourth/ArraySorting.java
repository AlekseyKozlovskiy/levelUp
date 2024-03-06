package lvlUp7.fourth;

public class ArraySorting {
    public static int[] bubbleSort (int[] mass) {
        int[] newMass = mass;
        for (int i = 0; i < mass.length - 1; i++) {
            for (int j = 0; j < mass.length - 1; j++) {
                int element;
                if (newMass[j] > newMass[j + 1]) {
                    element = newMass[j];
                    newMass[j] = newMass[j + 1];
                    newMass[j + 1] = element;
                }
            }

        }
        return newMass;
    }
}
