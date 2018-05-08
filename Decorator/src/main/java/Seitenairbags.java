//侧面安全气囊

public class Seitenairbags extends Ausstattung{
    public Seitenairbags(IAuto pIAuto){
        super(pIAuto);
    }

    @Override
    public void zeigeDetails(){
        auto.zeigeDetails();
        System.out.print(", Seitenairbags<侧面安全气囊>");
    }

    @Override
    public int gibKosten(){
        return auto.gibKosten() + 1000;
    }
}
