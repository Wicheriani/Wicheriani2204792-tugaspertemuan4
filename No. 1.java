import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan tiga buah angka: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        if (isRibuan(num1) && isRibuan(num2) && isRibuan(num3)) {
            System.out.println("Semua angka adalah ribuan.");
        } else {
            System.out.println("Tidak semua angka adalah ribuan.");
        }
    }
    
    public static boolean isRibuan(int num) {
        return num >= 1000 && num <= 9999;
    }
}
