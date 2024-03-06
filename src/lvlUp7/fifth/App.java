package lvlUp7.fifth;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        MyClass[] arr = new MyClass[5];
        arr[0] = new MyClass(true);
        arr[1] = new MyClass(false);
        arr[2] = new MyClass(true);
        arr[3] = new MyClass(false);
        arr[4] = new MyClass(true);

        FilterService filterService = new FilterService();
        BaseFilter baseFilter = new SmallFilter();

        MyClass[] newArray = (MyClass[]) filterService.filterArray(arr, baseFilter);
        System.out.println(Arrays.toString(newArray));
    }


}
