import java.util.Scanner;

public class BelanjaBarangRafa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // Meminta pengguna untuk memasukkan nama dan harga barang
        System.out.print("Nama Barang1: ");
        String namaBarang1 = scanner.nextLine();
        System.out.print("Harga Barang1: ");
        double hargaBarang1 = scanner.nextDouble();
        scanner.nextLine(); // membersihkan buffer
        System.out.print("Nama Barang2: ");
        String namaBarang2 = scanner.nextLine();
        System.out.print("Harga Barang2: ");
        double hargaBarang2 = scanner.nextDouble();
        // Menampilkan informasi barang yang dibeli
        
        System.out.println("=========================================");
        System.out.println("Barang yang dibeli: " + namaBarang1 + " dan " + namaBarang2);
        System.out.println("Harga: " + hargaBarang1 + " dan " + hargaBarang2);
        // Menutup scanner
        scanner.close();
    }
}