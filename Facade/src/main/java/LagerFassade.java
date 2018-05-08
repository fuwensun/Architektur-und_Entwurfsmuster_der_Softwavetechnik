//仓库的外观

public class LagerFassade {

    private FahrwerkLager fw;
    private GetriebeLager g;
    private MotorLager m;

    LagerFassade(){
        System.out.println("<初始化--仓库外观>");
        fw = new FahrwerkLager();
        g = new GetriebeLager();
        m = new MotorLager();
    }

    public void alleLagerFuelllen(int anzahl){
        System.out.println("Bestaende aller Laget werden " + "gefuellt.<增加--仓库外观>");
        fw.largerFuellen(anzahl);
        g.lagerFuellen(anzahl);
        m.lagerFuellen(anzahl);
        System.out.println();
    }

    public void produktionsteileEntnehmen(int anzahl){
        System.out.println("Alle fuer die Produktion " + "notwendigen Teile werden entnommen.<减少--仓库外观>");
        fw.fahrwerEntnehmen(anzahl);
        g.getriebeEntnehmen(anzahl);
        m.motorEntnehmen(anzahl);
        System.out.println();
    }
}
