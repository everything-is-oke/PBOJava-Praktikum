public class perulanganHurufZA {
    public static void main(String[] args) {
        // Menggunakan perulangan for
        System.out.println("Menggunakan perulangan for:");
        for (char huruf = 'Z'; huruf >= 'A'; huruf--) {
            System.out.print(huruf + " ");
        }
        System.out.println("\n");

        // Menggunakan perulangan while
        System.out.println("Menggunakan perulangan while:");
        char hurufWhile = 'Z';
        while (hurufWhile >= 'A') {
            System.out.print(hurufWhile + " ");
            hurufWhile--;
        }
        System.out.println("\n");

        // Menggunakan perulangan do-while
        System.out.println("Menggunakan perulangan do-while:");
        char hurufDoWhile = 'Z';
        do {
            System.out.print(hurufDoWhile + " ");
            hurufDoWhile--;
        } while (hurufDoWhile >= 'A');
    }
}
