package triangulo;

import java.util.Scanner;

/**
 *
 * @author a1402072
 */
public class Triangle {

    public static void main(String[] args) {

        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor inteiro positivo:");
        a = scanner.nextInt();
        System.out.println("Digite o segundo valor inteiro positivo:");
        b = scanner.nextInt();
        System.out.println("Digite o terceiro valor inteiro positivo:");
        c = scanner.nextInt();
        String triangleType = triangleType(a, b, c);
        if (triangleType != null) {            
            System.out.println("É um triângulo " + triangleType + " válido!");
        } else {
            System.out.println("Não é um triângulo válido!!");
        }
    }

    private static boolean isTriangle(int a, int b, int c) {
        boolean isTriangle = false;
        if (a <= 0 || b <= 0 || c <= 0) {
            isTriangle = false;
        } else if (((a + b) > c)
                && ((b + c) > a)
                && ((a + c) > b)) {
            isTriangle = true;
        }
        return isTriangle;
    }

    public static String triangleType(int a, int b, int c) {
        if (isTriangle(a, b, c)) {
            if (a == b && b == c) {
                return "equilátero";
            } else if (a == b || a == c || b == c) {
                return "isóceles";
            } else {
                return "escaleno";
            }
        } else {
            return null;
        }
    }
}
