package jobsheet8;

import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Masukkan nilai n (nilai n minimal 3) : ");
            n = sc.nextInt();
            if (n<3) {
                System.out.println("Nilai n harus minimal 3.");
            }
        } while (n < 3);
        System.out.println("Persegi " + n + " x " + n + " dengan angka " + n);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==1||i==n||j==1 || j==n) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
