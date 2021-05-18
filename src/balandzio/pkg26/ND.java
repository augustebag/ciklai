/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balandzio.pkg26;

import java.util.Scanner;

/**
 *
 * @author auguste
 */
public class ND {

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
        
        while (nuo <= iki) {
            if (nuo % 2 != 0) {
                System.out.println(nuo);
            }
            nuo++; 
        }
        
    }
    
}
