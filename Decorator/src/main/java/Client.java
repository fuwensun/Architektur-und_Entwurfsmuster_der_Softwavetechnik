//客户Client

public class Client {

    public static void main(String[] args) {
//        带空调设备的汽车
        IAuto auto = new Klimaanlage( new Limousine());
        auto.zeigeDetails();
        System.out.println("\nfuer " + auto.gibKosten() + " Euro\n");
    }
}
