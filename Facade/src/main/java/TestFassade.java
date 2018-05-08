//测试外观模式

public class TestFassade {
    public static void main(String[] args) {
        LagerFassade fassade = new LagerFassade();
//        通过仓库管理为仓库增加零件
        fassade.alleLagerFuelllen(10);
//        为了生产产品减少零件
        fassade.produktionsteileEntnehmen(5);
    }
}
