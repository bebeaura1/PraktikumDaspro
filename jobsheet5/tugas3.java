package jobsheet5;

import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jenis Pengguna\t= ");
        String pengguna = input.nextLine();

        if (pengguna.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        } else if (pengguna.equalsIgnoreCase("Mahasiswa")) {
            System.out.print("Jumlah SKS\t= ");
            int sks = input.nextInt();
            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }
    }
}
