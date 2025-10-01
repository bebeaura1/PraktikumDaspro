package jobsheet5;

import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka\t= ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Ganap");
        } else {
            System.out.println("Ganjil");
        } 
    }
}
