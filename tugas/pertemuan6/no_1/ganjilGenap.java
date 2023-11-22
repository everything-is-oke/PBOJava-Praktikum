import java.util.Scanner;
public class ganjilGenap {
    public static void main(String[] args) {
        int nAwal, nAkhir;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai Awal: ");
        nAwal = input.nextInt();
        System.out.print("Masukkan Nilai Akhir: ");
        nAkhir = input.nextInt();
        System.out.println("Bilangan Ganjil:");

        // Menggunakan for
        for (int i = nAwal; i <= nAkhir; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " (Ganjil)");
            }
        }
        System.out.println("Bilangan Genap:");
        for (int i = nAwal; i <= nAkhir; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " (Genap)");
            }
        }

        // Menggunakan while
//        System.out.println("Bilangan Ganjil:");
//        int i = nAwal;
//        while (i <= nAkhir) {
//            if (i % 2 != 0) {
//                System.out.println(i + " (Ganjil)");
//            }
//            i++;
//        }
//
//        System.out.println("Bilangan Genap:");
//        i = nAwal;
//        while (i <= nAkhir) {
//            if (i % 2 == 0) {
//                System.out.println(i + " (Genap)");
//            }
//            i++;
//        }

        // Menggunakan do-while
//        int i = nAwal;
//        do {
//            if (i % 2 != 0) {
//                System.out.println(i + " (Ganjil)");
//            }
//            i++;
//        } while (i <= nAkhir);
//
//        System.out.println("Bilangan Genap");
//        i = nAwal;
//        do {
//            if (i % 2 == 0) {
//                System.out.println(i + " (Genap)");
//            }
//            i++;
//        } while (i <= nAkhir);
    }
}