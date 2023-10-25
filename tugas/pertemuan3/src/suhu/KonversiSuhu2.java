package suhu;

public class KonversiSuhu2 extends KonversiSuhu {
    public double fahrenheitToReamur() {
        double fahrenheit = getFahrenheit();
        double reamur = (4.0 / 9.0) * (fahrenheit - 32);
        return reamur;
    }

    public void display2() {
        System.out.println("Nilai Konversi dari "+inputCelcius+" Celcius ke Fahnrenheit: " + getFahrenheit() + " dikonversi ke Reamur menjadi " + fahrenheitToReamur() + " derajat reamur");
    }
}