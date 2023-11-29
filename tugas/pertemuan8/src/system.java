import java.util.Scanner;

public class system extends toko {
    Scanner input = new Scanner(System.in);
    private int inputanJumBeli[];
    private String inputanKode[];
    private int jumlahBayar;
    private int x;

    private String[][] barang = getBarang();
    private int hargaBrg[] = getHargaBarang();

    static void headline() {
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("***************");
    }

    public void input() {
        headline();
        System.out.print("Masukkan jumlah barang yang ingin dibeli: ");
        this.x = input.nextInt();

        this.inputanKode = new String[this.x];
        this.inputanJumBeli = new int[this.x];

        for (int i = 0; i < this.x; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan kode        : ");
            this.inputanKode[i] = input.next();
            System.out.print("Masukkan jumlah Beli : ");
            this.inputanJumBeli[i] = input.nextInt();
        }
    }

    private int hitungTotal(int index, int jumBeli) {
        int jumlah = jumBeli * this.hargaBrg[index];
        return jumlah;
    }

    public void checkInputan() {
        for (int i = 0; i < this.x; i++) {
            for (int j = 0; j < this.barang[0].length; j++) {
                if (this.inputanKode[i].equals(this.barang[0][j])) {
                    System.out.println((i + 1) + "\t" + this.barang[0][j] + "   \t" + this.barang[1][j] + "    \t" + this.hargaBrg[j] + "\t" + this.inputanJumBeli[i] + "\t\t" + this.hitungTotal(j, this.inputanJumBeli[i]));
                    this.jumlahBayar += this.hitungTotal(j, this.inputanJumBeli[i]);
                    break;
                }
            }
        }
    }
    
    public void displayAllBarang() {
        System.out.println("Daftar Barang:");
        System.out.println("No  Kode Barang  Nama Barang  Harga");
        for (int i = 0; i < this.barang[0].length; i++) {
            System.out.println((i + 1) + "\t" + this.barang[0][i] + "\t" + this.barang[1][i] + "\t\t" + this.hargaBrg[i]);
        }
    }

    public void getStruk() {
        System.out.println("");
        headline();
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("==============================================================");
        checkInputan();
        System.out.println("==============================================================");
        System.out.println("Total Bayar                                             " + this.jumlahBayar);
        System.out.println("==============================================================");
    }
}