package jobsheet9;

import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan\t= ");
        int jml = input.nextInt();
        input.nextLine();
        System.out.println();

        String[] pesanan = new String[jml];
        double[] harga = new double[jml];

        for (int i = 0; i < harga.length; i++) {
            System.out.println("----- Pesanan ke " + (i+1) + " -----");
            System.out.print("Masukkan nama pesanan\t\t\t= ");
            pesanan[i] = input.nextLine();
            System.out.print("Masukkan harga dari pesanan " + pesanan[i] + "\t= ");
            harga[i] = input.nextDouble();
            input.nextLine();
            System.out.println();
        }

        System.out.println("===== Daftar Pesanan =====");
        double total = 0;
        for (int i = 0; i < jml; i++) {
            System.out.println((i+1) + ". " + pesanan[i] + "\t= Rp. " + harga[i]);
            total += harga[i];
        }
        
        System.out.println("\n===== Total Biaya =====");
        System.out.println("Total Biaya Pesanan\t= Rp. " + total);

    }
}
