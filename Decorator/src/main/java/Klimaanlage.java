//空调设备Klimaanlage

public class Klimaanlage extends Ausstattung{

    public Klimaanlage(IAuto pIAuto){
        super(pIAuto);
    }

    @Override
    public void zeigeDetails(){
        auto.zeigeDetails();
        System.out.print(", Klimaanlage");
    }

    @Override
    public int gibKosten(){
        return auto.gibKosten() + 1500;
    }
}
