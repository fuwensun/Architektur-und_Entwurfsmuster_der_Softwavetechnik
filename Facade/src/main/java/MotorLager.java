//发动机仓库

public class MotorLager {

    int motorenAnzal = 0;

    public void lagerFuellen(int anzahl){
        motorenAnzal = motorenAnzal + anzahl;
        System.out.println("Lager wurde um " + anzahl + " Motoren aufgestockt.<增加发动机>");
    }

    public void motorEntnehmen(int anzahl){
        motorenAnzal = motorenAnzal - anzahl;
        System.out.println("Fuer die Produktion wurden " + anzahl + " Motoren entmommen.<减少发动机>");
    }
}
