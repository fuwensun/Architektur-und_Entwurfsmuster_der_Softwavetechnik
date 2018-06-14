public class TestKompositum {
    public static void main(String[] args) {
        System.out.println("Testprigrann zum Kompositum-Muster");
        System.out.println("");

//        组建对象的结构
        Kompositum komp = new Kompositum("Kompositum Ebene 1");
        Kompositum komp11 = new Kompositum("Kompositum Ebene 11");
        Kompositum komp12 = new Kompositum("Kompositum Ebene 12");
        Kompositum komp121 = new Kompositum("Kompositum Ebene 121");

        komp.hinzufuegen(komp11);
        komp.hinzufuegen(komp12);

        komp12.hinzufuegen(komp121);

        Blatt blatt111 = new Blatt("Blatt111");
        Blatt blatt112 = new Blatt("Blatt112");
        Blatt blatt121 = new Blatt("Blatt121");
        Blatt blatt122 = new Blatt("Blatt122");
        Blatt blatt123 = new Blatt("Blatt123");
        Blatt blatt1211 = new Blatt("Blat2111");


        komp.hinzufuegen(blatt111);
        komp.hinzufuegen(blatt112);

        komp12.hinzufuegen(blatt121);
        komp12.hinzufuegen(blatt122);
        komp12.hinzufuegen(blatt123);

        komp121.hinzufuegen(blatt1211);

//        调用组合的操作
        System.out.println("Erste Ausgabe der Kompositum-Operation");
        System.out.println();
        komp.operation();

    }
}
