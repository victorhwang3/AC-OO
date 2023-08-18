import java.util.Scanner;

public class AC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double num1 = lerNumero("Digite o primeiro número: ");
            String operacao = lerOperacao();
            double num2 = lerNumero("Digite o segundo número: ");
            double resultado = calcularResultado(num1, operacao, num2);

    

            System.out.println("Resultado: " + resultado);

            System.out.print("Deseja continuar (s/n)? ");
            String opcao = scanner.next().toLowerCase();
            if (opcao.equals("n") || opcao.equals("nao")) {
                break; // Sai do loop infinito se a resposta for 'n' ou 'nao'
            }
        }

        System.out.println("Calculadora encerrada.");
        scanner.close();
    }

    public static double lerNumero(String mensagem) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    public static String lerOperacao() {
        Scanner scanner = new Scanner(System.in);
        String operacao;

        do {
            System.out.print("Escolha a operação (+, -, *, /): ");
            operacao = scanner.next();
        } while (!operacao.equals("+")  & !operacao.equals("-") &
         !operacao.equals("*") & !operacao.equals("/"));
        
        return operacao;
    }

    public static double calcularResultado(double num1, String operacao, double num2) {
        double resultado = 0.0;
        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
        }

        return resultado;
    }
}
