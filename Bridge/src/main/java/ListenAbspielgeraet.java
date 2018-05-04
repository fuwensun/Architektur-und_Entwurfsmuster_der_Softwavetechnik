//设备播放列表

import java.util.ArrayList;

public class ListenAbspielgeraet extends Abspielgeraet {

    private ArrayList<Integer> liste;

    public ListenAbspielgeraet(IAbspielgeraetImplementierer impl, ArrayList<Integer> liste) {
        super(impl);
        this.liste = liste;
    }

    //    新功能
    public void abspielenUndAusschalten() {
        System.out.println("<A头>-->新功能开始！");

        for (int i : liste) {
            impl.springeZuTrack(i);
            AbspielDaten daten = impl.leseDaten();
            System.out.println(daten);
        }
        impl.ausschalten();

        System.out.println("<A头>-->新功能结束！");
    }
}


