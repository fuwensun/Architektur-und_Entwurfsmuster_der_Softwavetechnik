//客户

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        Abspielgeraet a = new Abspielgeraet(new CDSpieler());
        a.spieleAb(3);

        Abspielgeraet b = new Abspielgeraet(new CDSpieler());
        b.spieleAb(5);


        ArrayList<Integer> abspieliste = new ArrayList<Integer>();
        abspieliste.add(1);
        abspieliste.add(9);
        abspieliste.add(3);
        ListenAbspielgeraet l = new ListenAbspielgeraet(new CDSpieler(), abspieliste);
        l.abspielenUndAusschalten();

    }
}

