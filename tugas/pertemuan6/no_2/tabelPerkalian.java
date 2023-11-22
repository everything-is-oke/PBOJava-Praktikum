import java.util.Scanner;

public class tabelPerkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n (<= 10): ");
        int n = input.nextInt();

        if (n <= 10) {
            System.out.println("Tabel Perkalian " + n + " x " + n + ":");
            tampilkanTabelPerkalian(n);
        } else {
            System.out.println("Masukkan nilai n lebih kecil atau sama dengan 10.");
        }
    }

    private static void tampilkanTabelPerkalian(int n) {
        System.out.print("    ");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i);
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
