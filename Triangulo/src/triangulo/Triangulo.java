package triangulo;

import java.util.Scanner;

/**
 *
 * @author a1402072
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a, b, c;
        int soma;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor inteiro positivo:");
        a = scanner.nextInt();
        System.out.println("Digite o segundo valor inteiro positivo:");
        b = scanner.nextInt();
        System.out.println("Digite o terceiro valor inteiro positivo:");
        c = scanner.nextInt();
        
        if (isTriangle(a, b, c)) {
            System.out.println("É um triângulo válido!");
        } else {
            System.out.println("Não é um triângulo válido");
        }
        
    }
    
    public static boolean isTriangle(int a, int b, int c) {
        
        boolean isTriangle = false;
        
        if (a <= 0 || b <= 0 || c <= 0) {
            isTriangle = false;
        } else if ((a + b) > c) {
            isTriangle = true;
        } else if ((b + c) > a) {
            isTriangle = true;
        } else if ((a + c) > b) {
            isTriangle = true;
        }
        
        return isTriangle;
    }
}
