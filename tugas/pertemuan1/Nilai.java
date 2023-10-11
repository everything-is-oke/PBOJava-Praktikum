public class Nilai {
    String nama;
    long npm;
    int nilaiAbsen,nilaiTugas,uts,uas,nilaiAkhir;
        
    int Nilai(){
        nilaiAkhir = (nilaiAbsen * 10/100) + (nilaiTugas * 20/100) + (uts * 30/100) + (uas * 40/100);
        return nilaiAkhir;
    }
        
    void CetakNilai(){
        System.out.println("NIM: " + this.npm);
        System.out.println("Nama: " + this.nama);
        System.out.println("Nilai Absen [10%]: " + this.nilaiAbsen);
        System.out.println("Nilai Tugas [20%]: " + this.nilaiTugas);
        System.out.println("Nilai UTS [30%]: " + this.uts);
        System.out.println("Nilai UAS [40%]: " + this.uas);
        System.out.println("NIlai Akhir: " + Nilai());
    }
}
