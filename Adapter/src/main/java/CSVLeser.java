import java.util.Set;
import java.util.Vector;

public class CSVLeser {

    //返回--Vector<String>[]
    public Vector<String []> lesePersonenDatei(String file){
        Vector<String []> personen = new Vector<String[]>();

        ////
        String[] s1 = {"n1","v1","\n"};
        personen.add(s1);
        String[] s2 = {"n2","v2","\n"};
        personen.add(s2);
        ////

        return personen;
    }
}
