package Clase1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar el primer valor: ");
        int n = scanner.nextInt();

        System.out.print("Ingresar el segundo valor: ");
        int m = scanner.nextInt();

        System.out.print("Ingresar el tercer valor: ");
        int d = scanner.nextInt();

        int i = 0;
        while (i<n){
            //cantidad de digitos sea igual a m
            if (Integer.toString(i).length()==m){
                System.out.println("Número: "+ i);
            }
            i++;
        }
        scanner.close();
        //https://github.com/dieg0b/ejercicios-java
    }
}
