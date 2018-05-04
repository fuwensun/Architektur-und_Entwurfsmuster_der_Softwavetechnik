//播放设备

public class Abspielgeraet {

    protected IAbspielgeraetImplementierer impl;

    public Abspielgeraet(IAbspielgeraetImplementierer impl){
        this.impl = impl;
        System.out.println("Abspielgeraet()<构造><A头>");
    }

    public void spieleAb(int liedNummer){
        System.out.println("<A头>--->");
        impl.springeZuTrack(liedNummer);
        AbspielDaten dat = impl.leseDaten();
        //数据输出
        System.out.println(dat);
    }

    public void ausschalten(){
        System.out.println("<A头>--->");
        impl.ausschalten();
    }
}
