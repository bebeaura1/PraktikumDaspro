package jobsheet9;

import java.util.Scanner;
public class ArrayRataNilai06 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double totalLulus = 0, totalTidakLulus = 0;
    double rataLulus, rataTidakLulus;
    int lulus = 0, tidakLulus = 0;
    
    System.out.print("Masukkan jumlah mahasiswa : ");
    int jmlMhs = sc.nextInt();
    int[] nilaiMhs = new int[jmlMhs];
    
    for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
        nilaiMhs[i] = sc.nextInt();
        if (nilaiMhs[i] > 70) {
            totalLulus += nilaiMhs[i];
            lulus++;
        } else {
            totalTidakLulus += nilaiMhs[i];
            tidakLulus++; 
        }
    }

    rataLulus = totalLulus / lulus;
    rataTidakLulus = totalTidakLulus / tidakLulus;
    System.out.println("Rata-rata nilai mahasiswa yang lulus = " + rataLulus);
    System.out.println("Rata-rata nilai mahasiswa yang tidak lulus = " + rataTidakLulus);
}
}