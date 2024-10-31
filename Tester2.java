package iventory;

import java.util.Scanner;

public class Tester2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("CD/DVD");
        int pilihan = s.nextInt();

        s.nextInt(); // reset Scanner
        System.out.println("Nama :");
        String nama = s.nextLine();
        System.out.println("Number: ");
        int number = s.nextInt();
        System.out.println("Quantity :");
        int quantity = s.nextInt();
        System.out.println("Price : ");
        double price = s.nextDouble();
        s.nextLine();

        if (pilihan == 1) {
            System.out.println("Artist :");
            String artist = s.nextLine();
            System.out.println("Label :");
            String label = s.nextLine();
            System.out.println("Total Song :");
            int numSong = s.nextInt();
            CD c1 = new CD(number, nama, quantity, price, artist, numSong, label);
            c1.print();

        } else if (pilihan == 2) {
            System.out.println("leght");
            int legth = s.nextInt();
        } else {
            System.out.println("Input salah!");
        }
    }
}