public class VerificaString {
    static void possuiA(String s) {
        int qtdA = 0;
        // Transformando a string em minúsculo para contabilizar caracteres minúsculos e
        // maiúsculos
        String minS = s.toLowerCase();

        // Iteramos sobre todos os caracteres da string
        for (int i = 0; i < minS.length(); i++) {
            char c = minS.charAt(i);
            // IMPORTANTE: 'a' precisa estar entre aspas simples para mostrar que é um valor
            // de tipo char. As aspas duplas denotam um valor de tipo String,
            // impossibilitando essa comparação
            if (c == 'a') {
                qtdA++;
            }
        }

        if (qtdA > 0) {
            System.out.println("A letra A aparece " + qtdA + (qtdA > 1 ? " vezes" : " vez") + " na string " + s);
            return;
        }

        System.out.println("A letra A não está presente na string " + s);
    }
}
