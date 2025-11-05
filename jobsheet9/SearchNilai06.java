package jobsheet9;

import java.util.Scanner;
public class SearchNilai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinputkan : ");
        int banyak = sc.nextInt();
        int[] arrNilai = new int[banyak];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari : ");
        int cari = sc.nextInt();      
        int posisi = -1;

        for (int i = 0; i < arrNilai.length; i++) {
            if (arrNilai[i] == cari) {
                posisi = i;
                break;
            }
        }
        
        if (posisi != -1) {
            System.out.println("\nNilai " + cari + " ketemu, merupakan nilai mahasiswa ke-" + (posisi+1));
        } else {
            System.out.println("\nNilai yang dicari tidak ditemukan");
        }
    }
}
