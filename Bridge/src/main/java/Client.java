//客户

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        System.out.println("");

        Abspielgeraet a = new Abspielgeraet(new CDSpieler());
        a.spieleAb(3);

        System.out.println("");

        Abspielgeraet b = new Abspielgeraet(new KassettenSpieler());
        b.spieleAb(5);

        System.out.println("");

        ArrayList<Integer> abspieliste = new ArrayList<Integer>();
        abspieliste.add(1);
        abspieliste.add(9);
        abspieliste.add(3);
        ListenAbspielgeraet l = new ListenAbspielgeraet(new CDSpieler(), abspieliste);
        l.abspielenUndAusschalten();

    }
}

