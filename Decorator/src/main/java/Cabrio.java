//敞篷车Cabrio

public class Cabrio implements IAuto{
    @Override
    public void zeigeDetails(){
        System.out.print("Cabrio");
    }
    @Override
    public int gibKosten() {
        return 5000;
    }
}
