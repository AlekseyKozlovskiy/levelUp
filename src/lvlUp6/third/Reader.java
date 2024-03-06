package lvlUp6.third;

import java.time.LocalDate;

public class Reader {
    private String fio;
    private int numberTicket;
    private String faculty;
    private LocalDate birthday;
    private long telephoneNumber;

    public Reader(String fio, int numberTicket, String faculty, LocalDate birthday, long telephoneNumber) {
        this.fio = fio;
        this.numberTicket = numberTicket;
        this.faculty = faculty;
        this.birthday = birthday;
        this.telephoneNumber = telephoneNumber;
    }

    public String getFio() {
        return fio;
    }
}
