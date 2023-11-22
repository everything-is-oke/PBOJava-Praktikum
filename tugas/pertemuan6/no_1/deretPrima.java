public class deretPrima {
    public static void main(String[] args) {
        System.out.println("Menggunakan perulangan for:");
        for (int i = 0; i <= 20; i++) {
            if (isPrima(i)) {
                System.out.println(i + " adalah bilangan prima");
            } else {
                System.out.println(i + " bukan bilangan prima");
            }
        }

        System.out.println("\nMenggunakan perulangan while:");
        int j = 0;
        while (j <= 20) {
            if (isPrima(j)) {
                System.out.println(j + " adalah bilangan prima");
            } else {
                System.out.println(j + " bukan bilangan prima");
            }
            j++;
        }

        System.out.println("\nMenggunakan perulangan do-while:");
        int k = 0;
        do {
            if (isPrima(k)) {
                System.out.println(k + " adalah bilangan prima");
            } else {
                System.out.println(k + " bukan bilangan prima");
            }
            k++;
        } while (k <= 20);
    }

    private static boolean isPrima(int angka) {
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i <= angka / 2; i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
}
