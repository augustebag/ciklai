
package balandzio.pkg26;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ivesk iki ");
        int nuo = sc.nextInt();
        System.out.println("Ivesk nuo ");
        int iki = sc.nextInt();
        
        
        for(int i = nuo; i <= iki; i++) { // Tik for ciklas turi savo skaupa
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("pabaiga");
    }
    
}
