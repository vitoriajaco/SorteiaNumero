import java.util.*;

public class SorteiaNumero {
    public static void main(String[] args) {
        int pontuacaoFinal = 0;
        Stack acertos = new Stack();
        Stack erros = new Stack();
        String continuar = "s";

        System.out.println("Qual nível de dificuldade você quer?");
        System.out.println("Nivel 1: 1 a 20 - Digite 1");
        System.out.println("Nivel 2: 1 a 50 - Digite 2");
        System.out.println("Nivel 3: 1 a 100 - Digite 3");
        Scanner inputNivel = new Scanner(System.in);
        int nivel = inputNivel.nextInt();

        int intervalo = 0;
        switch (nivel) {
            case 1:
                intervalo = 20;
                break;
            case 2:
                intervalo = 50;
                break;
            case 3:
                intervalo = 100;
                break;
            default:
                System.out.println("Você escolheu um numero invalido, o nível será escolhido automaticamente.");
                intervalo = 100;
        }

        do {
            int pontuacao = 0;
            Random numeroGerado = new Random();
            int valor = numeroGerado.nextInt(intervalo) + 1;
            int valorMinimo = (valor - 1);
            int valorMaximo = (valor + 1);

            System.out.println("Digite um numéro de acordo com o intervalo escolhido: ");
            Scanner input = new Scanner(System.in);
            int numeroDigitado = input.nextInt();

            if (numeroDigitado == valor) {
                acertos.push(numeroDigitado);
                pontuacao = 10;
                System.out.println("Você acertou sua pontuação é: " + pontuacao);
            } else if (numeroDigitado == valorMaximo || numeroDigitado == valorMinimo) {
                pontuacao = 5;
                erros.push(numeroDigitado);
                System.out.println("Você quase acertou sua pontuação é: " + pontuacao);
                System.out.println("Tente Novamente");
                System.out.println("Digite um numéro de 1 a 20: ");
                numeroDigitado = input.nextInt();
                if (numeroDigitado == valor) {
                    pontuacao += 5;
                    acertos.push(numeroDigitado);
                   System.out.println("Você acertou sua pontuação é: " + pontuacao);
                } else {
                    System.out.println("Você perdeu; O valor era: " + valor);
                    erros.push(numeroDigitado);
                }
            } else {
                System.out.println("Você perdeu; O valor era: " + valor);
                erros.push(numeroDigitado);
            }
            pontuacaoFinal += pontuacao;
            System.out.println("Você deseja continuar? Responda S para Sim e N para Não");
            Scanner input2 = new Scanner(System.in);
            continuar = input2.nextLine();
        } while (continuar.equalsIgnoreCase("s"));
        System.out.println("Sua pontuação total é de: " + pontuacaoFinal);
        System.out.println("Você acertou: " + acertos);
        System.out.println("Você errou: " + erros);

    }}








