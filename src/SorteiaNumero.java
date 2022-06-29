import java.util.Random;
import java.util.Scanner;

public class SorteiaNumero {
    public static void main(String[] args) {
        Random numeroGerado = new Random();
        int valor = numeroGerado.nextInt(3) + 1;
        System.out.println(valor);
        System.out.println("Digite um numéro de 1 a 20: ");
        Scanner input = new Scanner(System.in);
        int numeroDigitado = input.nextInt();

        int pontuação = 0;
        int valorMinimo = (valor - 1);
        int valorMaximo = (valor + 1);

        if (numeroDigitado == valor) {
            pontuação = 10;
            System.out.println("Você acertou sua pontuação é: " + pontuação );
            System.exit(1);
        } else if (numeroDigitado == valorMaximo || numeroDigitado == valorMinimo) {
            pontuação = 5;
            System.out.println("Você quase acertou sua pontuação é: " + pontuação);
            System.out.println("Tente Novamente");
            System.out.println("Digite um numéro de 1 a 20: ");
            numeroDigitado = input.nextInt();
            if (numeroDigitado == valor) {
                pontuação += 5;
                System.out.println("Você acertou sua pontuação é: " + pontuação );
                System.exit(1);
            } else {
                System.out.println("Você perdeu; O valor era: " + valor);
            }
        } else {
            System.out.println("Você perdeu; O valor era: " + valor);
        }
    }}








