import java.util.Random;
import java.util.Scanner;

public class SorteiaNumero {
    public static void main(String[] args) {
        int pontuacaoFinal = 0;
        String continuar = "s";

        do {
            int pontuacao = 0;
            Random numeroGerado = new Random();
            int valor = numeroGerado.nextInt(3) + 1;
            System.out.println(valor);
            int valorMinimo = (valor - 1);
            int valorMaximo = (valor + 1);

            System.out.println("Digite um numéro de 1 a 20: ");
            Scanner input = new Scanner(System.in);
            int numeroDigitado = input.nextInt();

            if (numeroDigitado == valor) {
                pontuacao = 10;
                System.out.println("Você acertou sua pontuação é: " + pontuacao);
            } else if (numeroDigitado == valorMaximo || numeroDigitado == valorMinimo) {
                pontuacao = 5;
                System.out.println("Você quase acertou sua pontuação é: " + pontuacao);
                System.out.println("Tente Novamente");
                System.out.println("Digite um numéro de 1 a 20: ");
                numeroDigitado = input.nextInt();
                if (numeroDigitado == valor) {
                    pontuacao += 5;
                   System.out.println("Você acertou sua pontuação é: " + pontuacao);
                } else {
                    System.out.println("Você perdeu; O valor era: " + valor);
                }
            } else {
                System.out.println("Você perdeu; O valor era: " + valor);
            }
            pontuacaoFinal += pontuacao;
            System.out.println("Você deseja continuar? Responda S para Sim e N para Não");
            Scanner input2 = new Scanner(System.in);
            continuar = input2.nextLine();
        } while (continuar.equalsIgnoreCase("s"));
        System.out.println("Sua pontuação total é de: " + pontuacaoFinal);

    }}








