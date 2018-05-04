//播放设备

public class Abspielgeraet {

    protected IAbspielgeraetImplementierer impl;

    public Abspielgeraet(IAbspielgeraetImplementierer impl){
        this.impl = impl;
    }

    public void spieleAb(int liedNummer){
        impl.springeZuTrack(liedNummer);
        AbspielDaten dat = impl.leseDaten();
        //数据输出
        System.out.println(dat);
    }

    public void ausschalten(){
        impl.ausschalten();
    }
}
