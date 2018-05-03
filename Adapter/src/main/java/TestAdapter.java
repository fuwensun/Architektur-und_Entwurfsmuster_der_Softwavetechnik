import java.util.Vector;

public class TestAdapter {

    public static void main(String[] args) {
        System.out.println("test!!!");

        //低耦合，用IPersonenLeser接口，CSVLeserAdapter混入接口的目的，面向接口编程，ok!ok!
        IPersonenLeser leser = new CSVLeserAdapter("xxx.csv");
        Vector<Person> personen = leser.lesePersonen();

        for(Person person : personen)
            person.print();

        //高耦合，TestAdapter类依赖CSVLeserAdapter类，虽然适配的目的达到了，面向实现编程XXXX
        CSVLeserAdapter CSVleser = new CSVLeserAdapter("xxx.csv");
        personen = leser.lesePersonen();

        for(Person person : personen)
            person.print();

    }
}