package Clase1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar el primer valor: ");
        int valor1 = scanner.nextInt();
        System.out.print("Ingresar el segundo valor: ");
        int valor2 = scanner.nextInt();

        int i=0;
        while (i<valor1){
            if(i%valor2==0){
                System.out.println(valor2);
            }
            i++;
        }
        scanner.close();
    }
}
