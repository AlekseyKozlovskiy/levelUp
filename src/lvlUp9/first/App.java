package lvlUp9.first;

import java.util.*;

public class App {

    public static void main(String[] args) {
        List<Integer> mainList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            mainList.add(random.nextInt(100 + 100) - 100);
        }

        //Создаем другую коллекцию и переписываем первые 10 элементов старой коллекции
        List<Integer> newList = mainList.subList(0, 9);
        //Создаем и сразу заполняем Set из основной коллекции
        Set<Integer> newUnique = new HashSet<>(mainList);
        //сортировка
        //по возрастанию:
        Collections.sort(mainList);
        //по убыванию:
        Collections.reverse(mainList);
        //максимальное число:
        Integer max = Collections.max(mainList);
        //минимальное число
        Integer min = Collections.min(mainList);
        //сумма всех элементов коллекции:
        Integer sum = 0;
        for (Integer integer : mainList) {
            sum += integer;
        }
        //все положительные числа коллекции
        List<Integer> positivList = new ArrayList<>();
        for (Integer integer : mainList) {
            if (integer > 0) {
                positivList.add(integer);
            }
        }
        //удаление всех нечетных чисел
        Iterator<Integer> mainIterator = mainList.iterator();
        while (mainIterator.hasNext()) {
            int a = (int) mainIterator.next();
            if (a % 2 != 0) {
                mainIterator.remove();
            }
        }
        //найти индекс указанного числа
        mainList.indexOf(15);
    }
}
