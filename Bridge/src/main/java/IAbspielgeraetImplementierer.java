//实现设备播放接口

public interface IAbspielgeraetImplementierer {

//    跳到指定歌曲号
    public void springeZuTrack(int liedNummber);

//    读入播放数据
    public AbspielDaten leseDaten();

//    关闭设备
    public void ausschalten();
}
