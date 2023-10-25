package suhu;
public class KonversiSuhu {
    public double inputCelcius;
    private double fahrenheit, reamur, inputFahrenheit;
    public void celciusToFahrenheit(double celcius) {
        inputCelcius = celcius;
        fahrenheit = (9.0 / 5.0) * celcius + 32;
    }

    public void celciusToReamur(double celcius) {
        inputFahrenheit = celcius;
        reamur = (4.0 / 5.0) * celcius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public double getReamur() {
        return reamur;
    }

    public void display() {
        System.out.println("Hasil Konversi dari " +inputCelcius+ " celcius ke fahrenheit adalah: " + getFahrenheit() + " derajat fahrenheit");
        System.out.println("Hasil Konversi dari " +inputFahrenheit+ " celcius ke reamur adalah: " + getReamur() + " derajat reamur");
    }
}