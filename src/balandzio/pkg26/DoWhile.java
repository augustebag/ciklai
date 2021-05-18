
package balandzio.pkg26;


public class DoWhile {


    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        
        while (a <= b) {
            System.out.println(a++); // jei false, iskart sustoja
        }
        System.out.println("-----");
        
        a = 1;
        do {
            System.out.println(a++); // bent karta vykdom
        } while (a <= b);
    }
    
}
