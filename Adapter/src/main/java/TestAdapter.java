import java.util.Vector;

public class TestAdapter {

    public static void main(String[] args) {

        System.out.println("test!!!");

        IPersonenLeser leser = new CSVLeserAdapter("xxx.csv");
        Vector<Person> personen = leser.lesePersonen();

        for(Person person : personen)
            person.print();

    }
}