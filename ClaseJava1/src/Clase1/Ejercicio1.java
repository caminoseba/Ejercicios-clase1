package Clase1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar valor a verificar: ");
        int valor = scanner.nextInt();
        int i=0;
        while (i<valor){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
        scanner.close();
    }
}
