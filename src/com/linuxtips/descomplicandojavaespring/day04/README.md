# Condicionais e Estruturas de Repetição em Java

## Estruturas Condicionais em Java

Condicionais em Java são estruturas que permitem a execução de um bloco de código baseado em uma condição. No exemplo fornecido, temos duas estruturas principais: `if-else` e `switch-case`.

---

## 1. `if-else`
A estrutura `if-else` é usada para avaliar expressões booleanas e executar diferentes blocos de código dependendo do resultado.

### Exemplo:
```java
long valor1 = 1L;
long valor2 = 1L;

if (valor1 == valor2) {
    System.out.println("São iguais");
} else {
    System.out.println("São diferentes");
}
```

### Explicação:
- O operador `==` verifica se `valor1` e `valor2` são iguais.
- Como ambos possuem o valor `1L`, a saída será **"São iguais"**.

### Operadores relacionais em Java:
| Operador | Descrição |
|----------|------------|
| `==`     | Igualdade |
| `!=`     | Diferente |
| `>`      | Maior que |
| `<`      | Menor que |
| `>=`     | Maior ou igual a |
| `<=`     | Menor ou igual a |

---

## 2. `switch-case`
O `switch-case` é uma alternativa ao `if-else` quando há múltiplas opções para um mesmo valor.

### Exemplo:
```java
String nomeDoMes = "fevereiro";
switch (nomeDoMes) {
    case "janeiro":
        System.out.println(1);
        break;
    case "fevereiro":
        System.out.println(2);
        break;
    case "marco":
        System.out.println(3);
        break;
    default:
        System.out.println("Que mês é esse?");
        break;
}
```

### Explicação:
- Como `nomeDoMes` é "fevereiro", o código imprime `2`.
- O `break` impede que os próximos `case` sejam executados.
- O `default` define um valor padrão caso nenhuma opção seja encontrada.

---

## Estruturas de Repetição em Java

As estruturas de repetição permitem a execução de um bloco de código múltiplas vezes, dependendo de uma condição.

### **1. `for` (Laço de repetição com contador)**
```java
for (int i = 0; i <= 100; i++) {
    System.out.println("Nesta repetição, i está valendo " + i);
}
```
- Utilizado quando se sabe previamente quantas vezes a repetição deve ocorrer.
- A estrutura é composta por três partes:
    1. **Inicialização** (`int i = 0`): Define o valor inicial da variável de controle.
    2. **Condição** (`i <= 100`): Define até quando o loop será executado.
    3. **Incremento** (`i++`): Atualiza o valor da variável de controle a cada iteração.
- O loop imprimirá valores de `0` a `100`.

---

### **2. `while` (Laço de repetição com condição)**
```java
while (valorSecreto != 12345) {
    System.out.println("Adivinhe o valor secreto:");
    valorSecreto = in.nextInt();

    if (valorSecreto == 12345) {
        System.out.println("Você acertou o valor, parabéns!");
    } else {
        System.out.println("Não é este o valor, tente novamente.");
    }
}
```
- Executa um bloco de código **enquanto** a condição for verdadeira.
- No exemplo, o programa pede ao usuário que adivinhe o valor secreto (`12345`).
- Se o usuário errar, o loop continua até que ele acerte.

---

### **3. `do-while` (Laço de repetição garantido)**
```java
int valor = 10;
do {
    System.out.println(valor);
    valor++;
} while (valor <= 50);
```
- Diferença em relação ao `while`: **garante ao menos uma execução** do bloco de código, pois a verificação da condição ocorre **depois** da primeira execução.
- No exemplo, imprime os valores de `10` a `50`.

---

### **Resumo Geral**

| Estrutura  | Quando Usar |
|-----------|------------|
| **`for`** | Quando o número de repetições é conhecido previamente. |
| **`while`** | Quando a repetição depende de uma condição ser verdadeira, mas pode nem acontecer. |
| **`do-while`** | Quando a repetição deve ocorrer **pelo menos uma vez**, independentemente da condição. |

---

