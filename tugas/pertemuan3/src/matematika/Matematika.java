package matematika;
public class Matematika{
    int a, b, c, d, e, f, g, h, i, j;
    public int pertambahan(int a, int b) {
        this.a = a;
        this.b = b;
        return a + b;
    }
    public int pengurangan(int a, int b) {
        this.c = a;
        this.d = b;
        return a - b;
    }
    public int perkalian(int a, int b) {
        this.e = a;
        this.f = b;
        return a * b;
    }
    public int pembagian(int a, int b) {
        this.g = a;
        this.h = b;
        return a / b;
    }
    public void tampilkan() {
        System.out.println("Pertambahan  : " + a + " + " + b + " = " + pertambahan(a, b));
        System.out.println("Pengurangan  : " + c + " - " + d + " = " + pengurangan(c, d));
        System.out.println("Perkalian    : " + e + " x " + f + " = " + perkalian(e, f));
        System.out.println("Pembagian    : " + g + " / " + h + " = " + pembagian(g, h));
    }
}