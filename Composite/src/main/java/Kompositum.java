import java.util.Iterator;

public class Kompositum extends Knoten{

    public Kompositum(String name){
        super(name);
    }
    @Override
    public void hinzufuegen(Knoten komp){
        this.kindelemente.add(komp);
    }

    @Override
    public void entfernen(Knoten komp){
        for(Iterator<Knoten> iter = kindelemente.iterator();
                iter.hasNext();){
            Knoten f = (Knoten)iter.next();
            if(f instanceof Kompositum){
                ((Kompositum) f).entfernen(komp);
            }
        }
        kindelemente.remove(komp);
    }

    @Override
    public void operation(){
        String formatString;
        ebene++;
        formatString = "%" + (ebene * 2) + "s";
        System.out.printf(formatString, "");
        System.out.println("+ " + super.gibName() + "");

        for(Iterator<Knoten> iter = kindelemente.iterator();
            iter.hasNext();){
            Knoten f = (Knoten)iter.next();
            f.operation();
        }
        ebene--;
    }
}
