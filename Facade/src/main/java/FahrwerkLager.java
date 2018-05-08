//汽车底盘仓库

public class FahrwerkLager {
    int fahrwerkAnzahl = 0;

    public void largerFuellen(int anzahl){
        fahrwerkAnzahl = fahrwerkAnzahl + anzahl;
        System.out.println("Lager wurde um " + anzahl + " Fahrwerke aufgestockt.<增加底盘>");
    }

    public void fahrwerEntnehmen(int anzahl){
        fahrwerkAnzahl = fahrwerkAnzahl - anzahl;
        System.out.println("Fue die Produktion wurden " + anzahl + " Fahrwerke entnommen.<减少底盘>");
    }
}
