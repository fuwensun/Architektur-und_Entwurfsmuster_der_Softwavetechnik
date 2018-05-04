//CDSpieler播放机

public class CDSpieler implements IAbspielgeraetImplementierer{

//    跳到指定歌曲号
    @Override
    public void springeZuTrack(int liedNummet){
//    在CD目录中查找
        System.out.println("Durchsuche Inhaltsvetzeichnis");

//    从CD中指定歌曲的开始处播放
        System.out.println("Springe zu Lied <" + liedNummet +
            "> durch Positionietung des Lasets.");
    }

//    读入播放数据
    @Override
    public  AbspielDaten leseDaten(){
        return new AbspielDaten("CD-Daten");
    }

//    关闭设备
    @Override
    public void ausschalten() {
        System.out.println("CD-Spieler ausgeschaltet.");
    }
}
