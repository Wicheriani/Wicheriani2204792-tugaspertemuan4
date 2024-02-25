import java.util.Scanner;

public class Tugas6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan jam masuk: ");
        int jamMasuk = scanner.nextInt();
        
        System.out.println("Masukkan jam keluar: ");
        int jamKeluar = scanner.nextInt();
        
        int lamaParkir = hitungLamaParkir(jamMasuk, jamKeluar);
        int biayaParkir = hitungBiayaParkir(lamaParkir);
        
        System.out.println("Biaya parkir adalah: " + biayaParkir + " Rp");
    }
    
    public static int hitungLamaParkir(int jamMasuk, int jamKeluar) {
        int lamaParkir = 0;
        if (jamKeluar >= jamMasuk) {
            lamaParkir = jamKeluar - jamMasuk;
        } else {
            lamaParkir = (24 - jamMasuk) + jamKeluar;
        }
        return lamaParkir;
    }
    
    public static int hitungBiayaParkir(int lamaParkir) {
        int biayaParkir = 0;
        if (lamaParkir <= 2) {
            biayaParkir = 1500;
        } else {
            biayaParkir = 1500 + (lamaParkir - 2) * 1000;
        }
        return biayaParkir;
    }
}
