//装备 Ausstattung
public abstract class Ausstattung implements IAuto{

    protected IAuto auto;

    public Ausstattung(IAuto pIAuto){
        auto = pIAuto;
    }
}


//public class Ausstattung implements IAuto{
//
//    protected IAuto auto;
//
//    public Ausstattung(IAuto pIAuto){
//        auto = pIAuto;
//    }
//
//    public int gibKosten(){
//        return 0;
//    }
//    public void zeigeDetails(){
//
//    }
//}
