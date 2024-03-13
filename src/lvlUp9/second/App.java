package lvlUp9.second;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {
    public static void main(String[] args) {
        User u1 = new User("Name1", "email1", "password1");
        User u2 = new User("Name2", "email2", "password2");
        User u3 = new User("Name3", "email3", "password3");
        User u4 = new User("Name4", "email4", "password4");
        User u5 = new User("Name5", "email5", "password5");

        User u6 = new User("Name1", "email1", "password1");
        User u7 = new User("Name7", "email7", "password7");
        User u8 = new User("Name8", "email8", "password8");
        User u9 = new User("Name5", "email5", "password5");
        User u10 = new User("Name10", "email10", "password10");

        List<User> firstList = new ArrayList<>();
        firstList.add(u1);
        firstList.add(u2);
        firstList.add(u3);
        firstList.add(u4);
        firstList.add(u5);

        List<User> secondList = new ArrayList<>();
        secondList.add(u6);
        secondList.add(u7);
        secondList.add(u8);
        secondList.add(u9);
        secondList.add(u10);

        List<User> duplicatesList = findDuplicates(firstList, secondList);
        System.out.println(duplicatesList);

    }
    public static List<User> findDuplicates(Collection<User> collA, Collection<User> collB) {
        List<User> duplicatesList = new ArrayList<>();
        for (User user : collA) {
            if (collB.contains(user)) {
                duplicatesList.add(user);
            }
        }
        /* второй способ
        List<User> duplicatesList1 = new ArrayList<>(collA);
        duplicatesList1.retainAll(collB);
        System.out.println(duplicatesList1);
         */

        return duplicatesList;
    }
}
