package lvlUp6.third;


public class App {
    public static void main(String[] args) {
        InitIalData initIalData = new InitIalData();
        initIalData.initialAndFillDatabase();

        BookStorage bookStorage = BookStorage.getInstance();

        Book book1 = bookStorage.getBookForInitial(0);
        Book book2 = bookStorage.getBookForInitial(3);

        Book[] books = {book1, book2};

        System.out.println("takeBook 1 overload");
        bookStorage.takeBook(initIalData.alex, 5);
        System.out.println();

        System.out.println("takeBook 2 overload");
        bookStorage.takeBook(initIalData.theDuck, initIalData.nameOfBooks);
        System.out.println();

        System.out.println("takeBook 3 overload");
        bookStorage.takeBook(initIalData.masha, books);
        bookStorage.takeBook(initIalData.oleg, books);
        System.out.println();

        System.out.println("returnBook 1 overload");
        bookStorage.returnBook(initIalData.ivan, 8);
        System.out.println();

        System.out.println("returnBook 2 overload");
        bookStorage.returnBook(initIalData.theDuck, initIalData.nameOfBooks);
        System.out.println();

        System.out.println("returnBook 3 overload");
        bookStorage.returnBook(initIalData.masha, books);
        System.out.println();

    }
}
