//导航系统Navigationssytem

public class Navigationssytem extends Ausstattung{

    public Navigationssytem(IAuto pIAuto){
        super(pIAuto);
    }

    @Override
    public void zeigeDetails(){
        auto.zeigeDetails();
        System.out.print(", Navigationssytem");
    }

    @Override
    public int gibKosten(){
        return auto.gibKosten() + 2500;
    }
}
