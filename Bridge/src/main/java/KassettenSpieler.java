

public class KassettenSpieler implements IAbspielgeraetImplementierer{

    private int currentTrack;

    public KassettenSpieler(){
        System.out.println("Spule an Anfang zurueck<B头>");
        currentTrack = 1;
    }

//  跳转
    public void springeZuTrack(int liedNummet){
        int diff = liedNummet - currentTrack;

        if(diff < 0){
            System.out.println("Spule um " + diff + " Tracks vor.<B头>");
        }else{
            System.out.println("Spule un " + (Math.abs(diff)+1) +
            " Tracks zurueck.<B头>");
        }

        System.out.println("Nun sind wir an det richtigen " +
            "Stelle(Lied: " + liedNummet + ")" + "<跳转><B头>");
    }

    public AbspielDaten leseDaten(){
        return new AbspielDaten("Kassettendaten<数据><B头>");
    }

    public void ausschalten(){
        System.out.println("Kassettenspoelet abgeschalten.<关闭设备><B头>");
    }
}
