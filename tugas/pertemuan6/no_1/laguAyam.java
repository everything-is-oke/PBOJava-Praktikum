public class laguAyam {
    public static void main(String[] args) {
        int jumlahAnakAyam = 10;

        System.out.println("Lagu Anak Ayam Turun " + jumlahAnakAyam);

        System.out.println("\nMenggunakan perulangan for:");
        for (int i = jumlahAnakAyam; i >= 1; i--) {
            tampilkanLirik(i);
        }

        System.out.println("\nMenggunakan perulangan while:");
        int j = jumlahAnakAyam;
        while (j >= 1) {
            tampilkanLirik(j);
            j--;
        }

        System.out.println("\nMenggunakan perulangan do-while:");
        int k = jumlahAnakAyam;
        do {
            tampilkanLirik(k);
            k--;
        } while (k >= 1);
    }

    private static void tampilkanLirik(int nomorAnak) {
        System.out.println("Anak ayam turun " + nomorAnak + "\nmati satu tinggal " + (nomorAnak - 1));
        System.out.println("Tek kotek-kotek kotek\nanak ayam turunlah berkotek\n");
    }
}
