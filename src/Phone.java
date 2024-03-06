public class Phone {
    private int number;
    private String model;
    private double weight;

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name) {
        System.out.printf("Звонит %s\n", name);
    }

    public void receiveCall(String name, Long number) {
        System.out.printf("Звонит %s с номера %d\n", name, number);
    }

    public void sendMessages(String[] numbers) {
        for (String s : numbers) {
            System.out.printf("На номер %s было отправлено сообщение с номера %d\n", s, this.number);
        }
    }


    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
