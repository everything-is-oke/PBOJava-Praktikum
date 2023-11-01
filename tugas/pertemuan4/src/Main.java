public class Main {
    public static void main(String[] args) {
        BangunRuang bangunRuang1 = new Balok(3, 4, 5);
        BangunRuang bangunRuang2 = new Kubus(3);

        System.out.println("Luas Permukaan Balok: " + bangunRuang1.hitungLuasPermukaan());
        System.out.println("Volume Balok: " + bangunRuang1.hitungVolume());
        System.out.println();
        System.out.println("Luas Permukaan Kubus: " + bangunRuang2.hitungLuasPermukaan());
        System.out.println("Volume Kubus: " + bangunRuang2.hitungVolume());
    }
}