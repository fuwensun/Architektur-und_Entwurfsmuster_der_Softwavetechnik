

public class KassettenSpieler implements IAbspielgeraetImplementierer{

    private int currentTrack;

    public KassettenSpieler(){
        System.out.println("Spule an Anfang zurueck");
        currentTrack = 1;
    }

    public void springeZuTrack(int liedNummet){
        int diff = liedNummet - currentTrack;

        if(diff < 0){
            System.out.println("Spule um " + diff + " Tracks vor.");
        }else{
            System.out.println("Spule un " + (Math.abs(diff)+1) +
            " Tracks zurueck.");
        }

        System.out.println("Nun sind wir an det richtigen " +
            "Stelle(Lied: " + liedNummet + ")");
    }

    public AbspielDaten leseDaten(){
        return new AbspielDaten("Kassettendaten");
    }

    public void ausschalten(){
        System.out.println("Kassettenspoelet abgeschalten.");
    }
}
