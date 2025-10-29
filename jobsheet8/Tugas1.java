package jobsheet8;

public class Tugas1 {
    public static void main(String[] args) {
        int n, i, j;
        int jumlah;

        for (n = 1; n <= 5; n++) {
            jumlah = 0;
            for (i = 1; i <= n; i++) {
                jumlah += i * i;
            }
            System.out.print("n = " + n + " => jumlah kuadrat = ");

            for (j = 1; j <= n; j++) {
                System.out.print(j * j);
                if (j < n) System.out.print(" + ");
            }
            System.out.println(" = " + jumlah);
        }
    }
    
}