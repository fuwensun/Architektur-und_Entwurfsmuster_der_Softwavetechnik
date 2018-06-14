public class Blatt extends Knoten {
    public Blatt(String name){
        super(name);
    }

    public void operation(){
        String formatString;
        formatString = "%" + (ebene * 2) + "s";
        System.out.printf(formatString, "");
        System.out.println(" - " + super.gibName());
    }
}
