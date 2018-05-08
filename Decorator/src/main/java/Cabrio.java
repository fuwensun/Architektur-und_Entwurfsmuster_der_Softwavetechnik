//敞篷车Cabrio

public class Cabrio implements IAuto{
    @Override
    public void zeigeDetails(){
        System.out.print("Cabrio<敞篷车>");
    }
    @Override
    public int gibKosten() {
        return 50000;
    }
}
