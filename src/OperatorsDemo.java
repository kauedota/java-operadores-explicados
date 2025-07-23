public class OperatorsDemo {
    public static void main(String[] args) {
        
        // ------------------- OPERADORES ARITMÉTICOS -------------------
        // + (soma), - (subtração), * (multiplicação), / (divisão), % (resto da divisão)
        int a = 10;
        int b = 3;
        System.out.println("Aritméticos:");
        System.out.println("a + b = " + (a + b)); // Soma
        System.out.println("a - b = " + (a - b)); // Subtração
        System.out.println("a * b = " + (a * b)); // Multiplicação
        System.out.println("a / b = " + (a / b)); // Divisão inteira
        System.out.println("a % b = " + (a % b)); // Resto da divisão (módulo)

        // ------------------- OPERADORES DE ATRIBUIÇÃO -------------------
        // =, +=, -=, *=, /=, %=
        System.out.println("\nAtribuição:");
        int x = 5;
        x += 3; // x = x + 3
        System.out.println("x += 3 -> " + x);
        x -= 2; // x = x - 2
        System.out.println("x -= 2 -> " + x);
        x *= 4; // x = x * 4
        System.out.println("x *= 4 -> " + x);
        x /= 2; // x = x / 2
        System.out.println("x /= 2 -> " + x);
        x %= 3; // x = x % 3
        System.out.println("x %= 3 -> " + x);

        // ------------------- OPERADORES RELACIONAIS -------------------
        // ==, !=, >, <, >=, <=
        System.out.println("\nRelacionais:");
        System.out.println("a == b? " + (a == b));
        System.out.println("a != b? " + (a != b));
        System.out.println("a > b? " + (a > b));
        System.out.println("a < b? " + (a < b));
        System.out.println("a >= b? " + (a >= b));
        System.out.println("a <= b? " + (a <= b));

        // ------------------- OPERADORES LÓGICOS -------------------
        // && (E lógico), || (OU lógico), ! (negação)
        boolean cond1 = true;
        boolean cond2 = false;
        System.out.println("\nLógicos:");
        System.out.println("cond1 && cond2 = " + (cond1 && cond2)); // true se ambos forem true
        System.out.println("cond1 || cond2 = " + (cond1 || cond2)); // true se pelo menos um for true
        System.out.println("!cond1 = " + (!cond1)); // inverte o valor

        // ------------------- OPERADORES BITWISE -------------------
        // & (E bit a bit), | (OU bit a bit), ^ (XOR), ~ (NOT), << (shift left), >> (shift right), >>> (shift right lógico)
        int c = 5;   // 0101 em binário
        int d = 3;   // 0011 em binário
        System.out.println("\nBitwise:");
        System.out.println("c & d = " + (c & d));   // 0101 & 0011 = 0001 (1)
        System.out.println("c | d = " + (c | d));   // 0101 | 0011 = 0111 (7)
        System.out.println("c ^ d = " + (c ^ d));   // 0101 ^ 0011 = 0110 (6)
        System.out.println("~c = " + (~c));         // ~0101 = 1010 (inverte os bits)
        System.out.println("c << 1 = " + (c << 1)); // 0101 << 1 = 1010 (10)
        System.out.println("c >> 1 = " + (c >> 1)); // 0101 >> 1 = 0010 (2)
        System.out.println("c >>> 1 = " + (c >>> 1)); // shift lógico à direita

        // ------------------- OPERADORES UNÁRIOS -------------------
        // + (valor positivo), - (inverte sinal), ++ (incremento), -- (decremento)
        int e = +5;  // positivo
        int f = -10; // negativo
        System.out.println("\nUnários:");
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        int g = 5;
        System.out.println("g++ = " + (g++)); // primeiro usa g (5), depois incrementa (fica 6)
        System.out.println("++g = " + (++g)); // primeiro incrementa (7), depois usa
        System.out.println("g-- = " + (g--)); // usa 7, depois decrementa (6)
        System.out.println("--g = " + (--g)); // decrementa (5), depois usa

        // ------------------- OPERADOR TERNÁRIO -------------------
        // condicao ? valor_se_verdadeiro : valor_se_falso
        System.out.println("\nTernário:");
        int idade = 18;
        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println("Resultado: " + resultado);

        // ------------------- OPERADOR instanceof -------------------
        System.out.println("\nInstanceof:");
        String texto = "Olá";
        System.out.println("texto instanceof String? " + (texto instanceof String));
    }
}
