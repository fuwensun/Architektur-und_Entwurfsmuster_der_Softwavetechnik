//变速箱仓库

public class GetriebeLager {

    int getriebeAnzahl = 0;

    public void lagerFuellen(int anzahl){
        getriebeAnzahl = getriebeAnzahl + anzahl;
        System.out.println("Lager wurde um" + anzahl + " Getriebe aufgestockt.<增加变速箱>");
    }

    public void getriebeEntnehmen(int anzahl){
        getriebeAnzahl = getriebeAnzahl - anzahl;
        System.out.println("Fuer die Produktion wurden " + anzahl + "Getriebe entnommen.<减少变速箱>");
    }
}
