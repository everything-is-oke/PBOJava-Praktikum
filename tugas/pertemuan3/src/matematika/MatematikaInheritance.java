package matematika;
public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika mtk = new Matematika();

        mtk.pertambahan(9, 5);
        mtk.pengurangan(3, 4);
        mtk.perkalian(5, 7);
        mtk.pembagian(30, 4);

        mtk.tampilkan();

        Matematika2 mtk2 = new Matematika2();
        mtk2.Modulus(40,3);
        mtk2.tampilkanModulus();
    }
}