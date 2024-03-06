package lvlUp7.fifth;

public class FilterService {
    static Object[] filterArray(Object[] object, BaseFilter baseFilter) {
        MyClass[] mass = new MyClass[object.length];
        int indexCount = 0;
        for (Object o : object) {
            MyClass tpm = (MyClass) o;
            if (tpm.isaBoolean() == baseFilter.filter(tpm)) {
                mass[indexCount] = tpm;
                indexCount++;
            }
        }
        return mass;
    }
}
