package lvlUp6.third;

import java.time.LocalDate;

public class InitIalData {
    String[] nameOfBooks = {"Bereza", "Thinking in Java", "abra-kadabra"};

    Reader alex = new Reader("Alex", 12, "FizMeh", LocalDate.of(1989, 1, 15), 65421345);
    Reader oleg = new Reader("Oleg", 12321, "Geography", LocalDate.of(2020, 4, 1), 12324234);
    Reader masha = new Reader("Masha", 44, "English", LocalDate.of(1965, 5, 19), 12345);
    Reader theDuck = new Reader("The Duck", 1, "Conquer the world", LocalDate.of(2023, 12, 31), 9768956);
    Reader ivan = new Reader("Ivan", 434, "Programming", LocalDate.of(1990, 5, 11), 456457);


    public void initialAndFillDatabase() {
        BookStorage bookStorage = BookStorage.getInstance();
        Book[] storageBooks = bookStorage.getStorageBooks();

        Book book1 = new Book("Pushkin", "Evgenii");
        Book book2 = new Book("Pushkin", "Ruslan");
        Book book3 = new Book("Pushkin", "Vsadnik");
        Book book4 = new Book("Tolstoi", "Var and Peace");
        Book book5 = new Book("Tolstoi", "Anna");
        Book book6 = new Book("Tolstoi", "Zapiski");
        Book book7 = new Book("Esenin", "Bereza");
        Book book8 = new Book("Ekkel", "Thinking in Java");

        storageBooks[0] = book1;
        storageBooks[1] = book2;
        storageBooks[2] = book3;
        storageBooks[3] = book4;
        storageBooks[4] = book5;
        storageBooks[5] = book6;
        storageBooks[6] = book7;
        storageBooks[7] = book8;

    }


}
