public class Fibonacci {
    // A sequência de Fibonacci é aquela onde o próximo termo da sequência é a soma
    // dos dois termos anteriores

    static void verificarNumero(int n) {
        // 0 e 1 são os dois primeiros números da sequência, quando não existem dois
        // níumeros anteriores para realizar a soma
        if (n == 0 || n == 1) {
            imprimir(true, n);
            return;
        }

        int primeiroNumero = 0;
        int segundoNumero = 1;
        int proximoNumero = 1;

        // O loop será executado até alcançar o valor escolhido
        while (proximoNumero <= n) {
            if (proximoNumero == n) {
                imprimir(true, n);
                return;
            }

            // Atualizando as variáveis para o próximo loop
            proximoNumero = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = proximoNumero;
        }
        // Se o valor não for encontrado pelo loop, o valor não está na seqência
        imprimir(false, n);
    }

    private static void imprimir(boolean pertence, int n) {
        if (pertence) {
            System.out.println("O número " + n + " está na sequência de Fibonacci");
        } else {
            System.out.println("O número " + n + " não está na sequência de Fibonacci");
        }
    }
}
