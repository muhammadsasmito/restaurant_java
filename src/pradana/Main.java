package pradana;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("    Aplikasi Kasir RESTO SEDERHANA "+"\n");
        System.out.println(" ___________________________________ ");
        System.out.println("|                MENU               |");
        System.out.println("|___________________________________|");
        System.out.println("|       NAMA       |     HARGA      |");
        System.out.println("| 1. Ayam Bakar    | Rp. 18.000     |");
        System.out.println("| 2. Ayam Geprek   | Rp. 17.000     |");
        System.out.println("| 3. Ayam Goreng   | Rp. 15.000     |");
        System.out.println("| 4. Es Jeruk      | Rp.  8.000     |");
        System.out.println("| 5. Es Teh Manis  | Rp.  5.000     |");
        System.out.println("| 6. Nasi Putih    | Rp.  3.000     |");
        System.out.println("|__________________|________________|");
        System.out.println("");

        int harga = 0;
        int harga_menu [] = {18000, 17000, 15000, 8000, 5000, 3000};
        String menu;
        int harganya;
        int uang;

        for (String i = "Y"; i.equals("Y") || i.equals("y"); ) {
            System.out.println("______________________________________________________________________");
            System.out.print("Masukkan Pilihan Menu : ");
            int input_menu = scan.nextInt();
            System.out.print("Masukkan Banyak Pesanan : ");
            int jumlah = scan.nextInt();
            System.out.println("______________________________________________________________________");

            if (input_menu == 1) {
                menu = "Ayam Bakar";
                harga = harga + harga_menu[0] * jumlah;
                harganya = harga_menu[0] * jumlah;
                System.out.println("Menu Pesanan Anda : " + menu + " x" + jumlah + " | Rp. " + harganya);
            } else if (input_menu == 2) {
                menu = " Ayam Geprek";
                harga = harga + harga_menu[1] * jumlah;
                harganya = harga_menu[1] * jumlah;
                System.out.println("Menu Pesanan Anda : " + menu + " x" + jumlah + " | Rp. " + harganya);
            } else if (input_menu == 3) {
                menu = " Ayam Goreng";
                harga = harga + harga_menu[2] * jumlah;
                harganya = harga_menu[2] * jumlah;
                System.out.println("Menu Pesanan Anda : " + menu + " x" + jumlah + " | Rp. " + harganya);
            } else if (input_menu == 4) {
                menu = " Es Jeruk";
                harga = harga + harga_menu[3] * jumlah;
                harganya = harga_menu[3] * jumlah;
                System.out.println("Menu Pesanan Anda : " + menu + " x" + jumlah + " | Rp. " + harganya);
            } else if (input_menu == 5) {
                menu = " Es Teh Manis";
                harga = harga + harga_menu[4] * jumlah;
                harganya = harga_menu[4] * jumlah;
                System.out.println("Menu Pesanan Anda : " + menu + " x" + jumlah + " | Rp. " + harganya);
            } else if (input_menu == 6) {
                menu = " Nasi Putih";
                harga = harga + harga_menu[5] * jumlah;
                harganya = harga_menu[5] * jumlah;
                System.out.println(" Menu Pesanan Anda : " + menu + " x" + jumlah + " | Rp. " + harganya);
            } else {
                System.out.println("Maaf Menu Yang Anda Pesan Tidak Tersedia.");
            }
            System.out.println("Apakah Ada Pesanan  Lainnya? Y/T");
            i = scan.next();
        }
        System.out.println("_____________________________________________________________________________");
        System.out.println(" Total Pembayaran Sebesar Rp. " +harga+".");
        System.out.println(" Uang Yang Dibayarkan  : Rp. ");
        uang = scan.nextInt();
        System.out.println("_____________________________________________________________________________");
        int kembalian = uang-harga;
        System.out.println(" Kembalian Anda Sebesar Rp. " +kembalian+".");
        System.out.println(" Terimakasih");
    }
}
