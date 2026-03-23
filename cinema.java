import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int qtdInteira, qtdMeia;
        double valInteira, valMeia;

        System.out.print("Quantidade de ingressos inteiro vendidos: ");
        qtdInteira = sc.nextInt();

        System.out.print("Quantidade de ingressos meia-entrada vendidos: ");
        qtdMeia = sc.nextInt();

        System.out.print("Valor do ingresso inteiro (R$): ");
        valInteira = sc.nextDouble();

        System.out.print("Valor do ingresso meia-entrada (R$): ");
        valMeia = sc.nextDouble();

        double totalInteira = qtdInteira * valInteira;
        double totalMeia = qtdMeia * valMeia;
        double total = totalInteira + totalMeia;
        int totalIngressos = qtdInteira + qtdMeia;
        double media = total / totalIngressos;

        System.out.println("Total arrecadado das inteiras: " + totalInteira);
        System.out.println("Total arrecadado das meias: " + totalMeia);
        System.out.println("Total arrecadado na sessão: " + total);
        System.out.println("Média por ingresso: " + media);

        sc.close();
    }
}