//客户Client

public class Client {

    public static void main(String[] args) {

//        带空调设备的汽车
        IAuto auto = new Klimaanlage( new Limousine());
        auto.zeigeDetails();
        System.out.println("\nfuer " + auto.gibKosten() + " Euro\n");

//        动态扩展豪华汽车的装备
        auto = new Navigationssytem( new Seitenairbags(auto));
        auto.zeigeDetails();
        System.out.println("\nfuer " + auto.gibKosten() + " Euro\n");

//        敞篷车的变化
        auto = new Navigationssytem( new Seitenairbags(new Cabrio()));
        auto.zeigeDetails();
        System.out.println("\nfuer " + auto.gibKosten() + " Euro\n");
    }
}
