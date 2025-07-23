# java-operadores-explicados

Este repositório apresenta **todos os principais operadores da linguagem Java**, com exemplos práticos, comentados e executáveis diretamente no terminal. É um ótimo material para estudantes e profissionais que desejam revisar os fundamentos da linguagem.

---

## 📌 Conteúdo

### 🔢 Operadores Aritméticos
Realizam operações matemáticas básicas:
- `+` Soma
- `-` Subtração
- `*` Multiplicação
- `/` Divisão inteira
- `%` Módulo (resto da divisão)

int a = 10;
int b = 3;
System.out.println("a + b = " + (a + b)); // Soma

### 🧮 Operadores de Atribuição
Atribuem valores às variáveis e também acumulam:

= Atribuição simples

+=, -=, *=, /=, %= Atribuição com operação

int x = 5;
x += 3; // x = x + 3

### ⚙️ Operadores Lógicos

Usados em expressões booleanas:

&& (E lógico)

|| (OU lógico)

! (negação)

boolean cond1 = true;
boolean cond2 = false;
System.out.println(cond1 && cond2); // false

### 🔧 Operadores Bitwise

Manipulam bits diretamente:

& AND

| OR

^ XOR

~ NOT

// << Shift à esquerda

//  >> Shift à direita

// >>> Shift lógico à direita

int c = 5; // 0101
int d = 3; // 0011
System.out.println(c & d); // 1

### ➕ Operadores Unários

Atuam sobre um único operando:

+, - Positivo e negativo

++, -- Incremento e decremento (prefixo e pós-fixo)

int g = 5;
System.out.println(g++); // 5
System.out.println(++g); // 7

### ❔ Operador Ternário

Substitui uma estrutura condicional simples:

int idade = 18;
String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";

### ➕ Operadores Unários

Atuam sobre um único operando:

+, - Positivo e negativo

++, -- Incremento e decremento (prefixo e pós-fixo)

int g = 5;
System.out.println(g++); // 5
System.out.println(++g); // 7

### ❔ Operador Ternário

Atuam sobre um único operando:

+, - Positivo e negativo

++, -- Incremento e decremento (prefixo e pós-fixo)


int idade = 18;
String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";

### 🔍 Operador instanceof

Verifica se um objeto é instância de uma determinada classe:

String texto = "Olá";
System.out.println(texto instanceof String); // true