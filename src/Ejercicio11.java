/** @author Oyola Castro  Jeremy Matias */
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el numero 1: ");
        int mayor = sc.nextInt();
        int menor = mayor;
        
        for (int i = 2; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            int numero = sc.nextInt();
            if (numero > mayor) mayor = numero;
            if (numero < menor) menor = numero;
        }
        
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
    }
}