package es.cristiann;

public class Main {

    public static void main(String[] args) {
	    int factorial = 1;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Dame un número mayor que 0 : " + factorial);
            factorial *= i;
        }

        System.out.println(factorial);
    }
}
