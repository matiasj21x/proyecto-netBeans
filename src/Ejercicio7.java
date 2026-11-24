import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        int suma = 0;
        int numero;
        
        do {
            System.out.print("Ingrese un numero positivo (negativo para terminar): ");
            numero = sc.nextInt();
            
            if (numero >= 0) {
                suma += numero;
                cantidad++;
            }
        } while (numero >= 0);
        
        System.out.println("Cantidad de numeros ingresados: " + cantidad);
        System.out.println("Suma total: " + suma);
    }
}