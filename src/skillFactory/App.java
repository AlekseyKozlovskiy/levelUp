package skillFactory;

import java.util.Random;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String secondName = "Masha";
        checkUserName(secondName);


    }
    public static boolean checkUserName(String secondName) {
        String firstName = "Petya";

        boolean check = true;
        if (firstName.equalsIgnoreCase(secondName)) {
            System.out.println("not Cool");
            check = false;
        } else {
            System.out.println("Cool");
            System.out.printf("Ваше имя имеет длину %d символов", secondName.length());
            System.out.print(secondName.replaceAll(" ",""));
        }
        return check;
    }

}
