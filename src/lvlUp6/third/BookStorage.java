package lvlUp6.third;

import java.util.Arrays;

public class BookStorage {
    private static BookStorage INSTANCE;

    private BookStorage() {
    }

    public static BookStorage getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BookStorage();
        }
        return INSTANCE;
    }

    private Book[] storageBooks = new Book[8];

    public Book[] getStorageBooks() {
        return storageBooks;
    }

    public void takeBook(Reader reader, int countOfBooks) {
        System.out.printf("%s Взял %d книг\n", reader.getFio(), countOfBooks);
    }

    public void takeBook(Reader reader, String[] nameOfBooks) {
        int booksCount = 0;
        String[] tookBooksName = new String[nameOfBooks.length];
            for (String nameOfBook : nameOfBooks) {
                for (Book storageBook : storageBooks) {
                    if (nameOfBook.equals(storageBook.getBookName())){
                        if (!storageBook.getIssued()) {
                            tookBooksName[booksCount] = nameOfBook;
                            storageBook.setIssued(true);
                        } else {
                            tookBooksName[booksCount] = "couldn't take \"" + nameOfBook + "\", the book is issued";
                        }
                        booksCount++;
                    }
                    else {
                        tookBooksName[booksCount] = "couldn't take \"" + nameOfBook + "\", the book is missing";
                    }

                }

        }
        System.out.printf("Reader \"%s\" took books:\n", reader.getFio());
        for (String s : tookBooksName) {
            System.out.println(s);
        }
    }

        public void takeBook(Reader reader, Book[] books) {
        int booksCount = 0;
        for (Book value : books) {
            if (value.getIssued()) {
                System.out.printf("The book: \"%s\" is issued, take another book\n", value.getBookName());
                continue;
            }

            String author = value.getAuthorName();
            String book = value.getBookName();

            for (Book storageBook : storageBooks) {
                if (storageBook.getAuthorName().equals(author) && storageBook.getBookName().equals(book)) {
                    storageBook.setIssued(true);
                    break;
                }
            }
            booksCount++;
        }
        System.out.printf("Reader \"%s\" took %d books.\n", reader.getFio(), booksCount);
    }

    public void returnBook(Reader reader, int countOfBooks) {
        System.out.printf("%s Вернул %d книг\n", reader.getFio(), countOfBooks);
    }

    public void returnBook(Reader reader, String[] nameOfBooks) {
        int booksCount = 0;
        String[] returnedBooksName = new String[nameOfBooks.length];
        for (String nameOfBook : nameOfBooks) {
            for (Book storageBook : storageBooks) {
                if (nameOfBook.equals(storageBook.getBookName())){
                    storageBook.setIssued(true);
                    returnedBooksName[booksCount] = nameOfBook;
                    booksCount++;
                }
                else {
                    returnedBooksName[booksCount] = "couldn't take \"" + nameOfBook + "\", hz chto za kniga";
                }

            }

        }
        System.out.printf("Reader \"%s\" return books:\n", reader.getFio());
        for (String s : returnedBooksName) {
            System.out.println(s);
        }
    }

    public void returnBook(Reader reader, Book[] books) {
        int booksCount = 0;
        for (Book value : books) {

            String author = value.getAuthorName();
            String book = value.getBookName();

            for (Book storageBook : storageBooks) {
                if (storageBook.getAuthorName().equals(author) && storageBook.getBookName().equals(book)) {
                    storageBook.setIssued(false);
                    break;
                }
            }
            booksCount++;
        }
        System.out.printf("Reader \"%s\" returned %d books.\n", reader.getFio(), booksCount);
    }


    public Book getBookForInitial(int index){
        return storageBooks[index];
    }

    @Override
    public String toString() {
        return "BookStorage{" +
                "storageBooks=" + Arrays.toString(storageBooks) +
                '}';
    }
}
