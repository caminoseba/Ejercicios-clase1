package Clase1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar el primer valor: ");
        int valor1 = scanner.nextInt();
        int i = 0;
        while (i<valor1){
            if (esPrimo(i)==true){
                System.out.println("Número primo: "+ i);
            }
            i++;
        }

        scanner.close();
    }
    public static boolean esPrimo(int numero){
        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0)
                return false;
        }
        return true;
    }
}
