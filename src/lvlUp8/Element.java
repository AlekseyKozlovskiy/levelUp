package lvlUp8;

public class Element {

    int value;
    Element next;

    Element(int value) {
        this.value = value;
        this.next = null;       // можно эту строку не писать, так как по-умолчанию переменные типа Element равны null
    }

}
