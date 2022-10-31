import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deque<Person> attrClients = new LinkedList<>(generateClients());

        //уменьшение билетов в очереди, после каждого "катания"
        while (!attrClients.isEmpty()) {
            Person p = attrClients.pollFirst();
            if (p.amountT == 0) {
                attrClients.remove(p);
            } else {
                p.amountT -= 1;
                System.out.println(p);
                attrClients.addLast(p);
            }
        }
    }

    //создание списка очереди на аттракцион
    public static List<Person> generateClients() {

        Person p1 = new Person("Виталий", "Мерзляков", 6);
        Person p2 = new Person("Олег ", "Сердюк", 3);
        Person p3 = new Person("Максим", "Юстас", 2);
        Person p4 = new Person("Вероника", "Ким", 4);
        Person p5 = new Person("Ольга", "Смирнова", 10);
        Person p6 = new Person("Майа", "Санду", 1);
        List<Person> ListP = new LinkedList<Person>();
        ListP.add(p1);
        ListP.add(p2);
        ListP.add(p3);
        ListP.add(p4);
        ListP.add(p5);
        ListP.add(p6);
        return ListP;
    }
}