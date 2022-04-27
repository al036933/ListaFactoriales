package es.cristiann;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int factorial = 1;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dame un número mayor que 0: ");
        for (int i = 1; i <= 5; i++) {
           System.out.println();
           factorial *= i;

        }

        System.out.println(factorial);
    }
}
