import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entero: ");
        int numero = sc.nextInt();
        
        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}