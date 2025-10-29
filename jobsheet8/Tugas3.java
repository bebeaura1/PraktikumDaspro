package jobsheet8;

import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah cabang kafe : ");
        int cabang = sc.nextInt();
        int totPel = 0, totItem = 0;

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        for (int c = 1; c <= cabang; c++) {
            System.out.println("\n--- Cabang " + c + " ---");
            System.out.print("Jumlah pelanggan : ");
            int jmlPelanggan = sc.nextInt();

            int itemCabang = 0;
            int pelCabang = 0;
            pelCabang += jmlPelanggan;

            for (int p = 1; p <= jmlPelanggan; p++) {
                System.out.print("- Pelanggan " + p + " memesan berapa item? ");
                int item = sc.nextInt();
                
                itemCabang += item;                
            }

            System.out.println("Cabang " + c + " :");
            System.out.println("- Pelanggan \t: " + pelCabang + " orang");
            System.out.println("- Item terjual \t: " + itemCabang + " item");

            totPel += pelCabang;
            totItem += itemCabang;
        } 
        System.out.println("\nTotal seluruh Cabang :");
        System.out.println("Pelanggan\t: " + totPel + " orang");
        System.out.println("Item terjual\t: " + totItem + " item");
    }
}
