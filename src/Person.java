public class Person {
    String name;
    String surname;
    int amountT;

    Person(String name, String surname, int amountT) {
        this.amountT = amountT;
        this.name = name;
        this.surname = surname;
    }


    public String toString() {
        return name + "  "+ surname + " покатался на аттракционе и количество билетов осталось " + amountT;

    }

}
