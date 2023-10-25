package suhu;
public class KonversiSuhuMain {
    public static void main(String[] args) {
        KonversiSuhu ks1 = new KonversiSuhu();
        ks1.celciusToFahrenheit(24);
        ks1.celciusToReamur(20);
        ks1.display();

        KonversiSuhu2 ks2 = new KonversiSuhu2();
        ks2.celciusToFahrenheit(7);
        ks2.display2();
    }
}
