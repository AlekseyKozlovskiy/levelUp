package lvlUp8;

// Однонаправленный связный список
//  - Нет отдельной переменной, в которой хранятся элементы
//  - Есть голова списка - элемент, который является начальным (первым)
//  - Каждый элемент списка хранит ссылку (указатель) на следующий в списке элемент
//  - Последний элемент списка - тот, у которого указатель на следующий элемент отсутствует (ссылка на следующий равна null)
public class OneLinkedList implements IntList {

    private Element head;
    private int size;

    @Override
    public void add(int value) {
        Element el = new Element(value);
        if (head == null) { // Список пустой
            head = el;
        } else {
            // Дойти до конца списка (найти элемент с полей next равным null)
            Element current = head;

            while (current.next != null) {
                current = current.next;
            }

            // current = last element
            current.next = el;
        }
        size++; // size = size + 1;
    }

    @Override
    public void removeFirst() {
        head = head.next;
        size--;
    }

    @Override
    public void display() {
        Element current = head;
        int index = 1;

        // 5
        //  6
        //   98
        //    6

        while (current != null) {
            System.out.println(current.value);

            for (int i = 0; i < index; i++) {
                System.out.print(" ");
            }

            index++;
            current = current.next;
        }

        System.out.println();
    }

    @Override
    public int get(int index) {
        Element current = head;
        int indexCount = 1;
        Element el = head;
        while (current != null) {
            if (indexCount == index) {
                el = current;
            }
            current = current.next;
            indexCount++;
        }
        return el.value;
    }

    @Override
    public void addFirst(int value) {
        Element el = new Element(value);
        el.next = head;
        head = el;
        size++;

    }

    @Override
    public void removeLast() {
        Element current = head;
        int indexCount = 1;
        while (current != null) {
            if (indexCount == size - 1) {
                current.next = null;
                size--;
            }
            current = current.next;
            indexCount++;

        }
    }
}
