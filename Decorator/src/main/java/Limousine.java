//豪华汽车Limousine

class Limousine implements IAuto{
    @Override
    public void zeigeDetails(){
        System.out.print("Limousine");
    }
    @Override
    public int gibKosten(){
        return 35000;
    }
}
