package jobsheet9;

import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyak mahasiswa\t= ");
        int banyak = input.nextInt();
        int[] nilai = new int[banyak];
        int total=0, tinggi, rendah;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + "\t= ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }

        tinggi = nilai[0];
        rendah = nilai[0];

        System.out.println();

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > tinggi) {
                tinggi = nilai[i];
            }
            if (nilai[i] < rendah) {
                rendah = nilai[i];
            }
        }

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i+1) + " dengan nilai\t= " + nilai[i]);
        }

        double rata = (double) total / nilai.length;
        
        System.out.println();

        System.out.println("Nilai rata rata\t: " + rata);
        System.out.println("Nilai tertinggi\t: " + tinggi);
        System.out.println("Nilai terendah\t: " + rendah);

    }
}
