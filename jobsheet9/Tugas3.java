package jobsheet9;

import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice" };
    
    System.out.println("=== Daftar Menu ===");
    for (String item : menu) {
        System.out.println("- " + item);
    }
 
    System.out.print("\nMasukkan nama makanan yang ingin dipesan: ");
    String cari = input.nextLine();
    boolean ditemukan = false;
    for (int i = 0; i < menu.length; i++) {
        if (menu[i].equalsIgnoreCase(cari)) {
            ditemukan = true;
            break;
        }
    }

    if (ditemukan) {
        System.out.println("Menu "+ cari + " tersedia di menu.");
    } else {
        System.out.println("Maaf, " + cari + " tidak tersedia di menu.");
    }
}
}
