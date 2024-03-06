package lvlUp8;

// Список на основе массива
//  - внутри списка лежит массив - данные хранятся в массиве
//  - список может расширяться
//  - метод add добавляет элемент в конец списка

// new DynamicList() -> [0, 0, 0, 0, 0], index = 0
// add(5) ->  elements[index(0)] = 5; index++; ->  [5,  0,  0, 0, 0], index = 1 (size)
// add(19) -> elements[index(1)] = 19; index++; -> [5, 19,  0, 0, 0], index = 2 (size)
// add(40) -> elements[index(2)] = 40; index++; -> [5, 19, 40, 0, 0], index = 3 (size)
// add(67) -> elements[index(3)] = 67; index++; -> [5, 19, 40, 67, 0], index = 4 (size)
// add(56) -> elements[index(4)] = 56; index++; -> [5, 19, 40, 67, 56], index = 5 (size)
// add(76) -> increase array length -> elements[index(5)] = 76; index++; -> [5, 19, 40, 67, 56, 76, 0, 0, 0, 0, 0], index = 6 (size)

import java.util.Arrays;

public class DynamicList implements IntList {

    private int[] elements;
    private int index;              // index - куда вставлять элемент в массив
                                    // index - количество элементов в списке

    public DynamicList() {
        this.elements = new int[10];
        this.index = 0;     // можно эту строку не писать, так как по-умолчанию переменные типа int равны 0
    }

    @Override
    public void add(int value) {
        checkToIncrease();
        elements[index++] = value;      // elements[index] = 40; index++;
    }

    @Override
    public void removeFirst() {
        elements = Arrays.copyOfRange(elements, 1, elements.length + 1);
        index--;
    }


    @Override
    public void display() {
        System.out.println(Arrays.toString(elements));
    }

    @Override
    public int get(int index) {
        return elements[index];
    }

    @Override
    public void addFirst(int value) {
        checkToIncrease();
        int[] newMass = new int[elements.length + 1];
        newMass[0] = value;
        System.arraycopy(elements, 0, newMass, 1, elements.length);
        elements = newMass;
        index++;
    }

    @Override
    public void removeLast() {
        elements[elements.length - 1] = 0;
        index--;
    }

    private void checkToIncrease(){
        if (index == elements.length) {
            int[] oldElements = elements;
            elements = new int[(int) (index * 1.5)]; // (int) (5 * 1,5) -> (int) 7.5 -> 7
            System.arraycopy(oldElements, 0, elements, 0, oldElements.length);
        }
    }

}
