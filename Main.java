import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num1, num2, resultado;

        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        num1 = in.nextInt();

        System.out.println("Ingrese el segundo número: ");
        num2 = in.nextInt();

        resultado = num1 + num2;

        System.out.print("El resultado de la suma es: " + resultado);
    }
}