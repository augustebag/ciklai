package balandzio.pkg26;

import java.util.Scanner;


public class DaugybosLentele {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ivesk sk nuo: ");
        int nuo = sc.nextInt();
        System.out.print("Ivesk sk iki: ");
        int iki = sc.nextInt();
        
        
        if (nuo > iki) {
            int tmp = iki;
            iki = nuo;
            nuo = tmp;
        }
        
        int y = nuo;
        while (y <= iki) {
            int x = nuo;
            while (x <= iki) {
                System.out.print(x * y);
                System.out.print(" ");
                x++;
            }
            System.out.println();
            nuo++; 
        }
    }
}
