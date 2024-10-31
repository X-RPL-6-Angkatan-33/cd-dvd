package iventory;
import java.util.Scanner;
//Driver class
public class tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of items: (max 10)");
        int jumlah = in.nextInt();
        System.out.println();
        System.out.println("CD or DVD");
        String choice = in.next();

        //codition
        if (choice.equals("CD")) {
        CD c1 = new CD();
        c1.print();
        }else if (choice.equals("DVD")){
        DVD d1 = new DVD();
        d1.print();}
        else{
            System.out.println("input salah.");
        }
    
    }
}
