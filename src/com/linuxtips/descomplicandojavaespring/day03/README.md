# Descomplicando Java e Spring - Anotações

## **JDK e JVM**

### **JDK (Java Development Kit)**
- É o kit de desenvolvimento Java.
- Contém o compilador, ferramentas e a JVM para rodar aplicações Java.
- Inclui bibliotecas padrão e é usado para criar programas em Java.

### **JVM (Java Virtual Machine)**
- É a máquina virtual que executa o bytecode Java.
- Garante a portabilidade: "Escreva uma vez, execute em qualquer lugar".
- Responsável pelo gerenciamento de memória e coleta de lixo (**Garbage Collection**).

---

## **Tipos Primitivos**

| Tipo       | Tamanho   | Descrição                                | Exemplo                 |
|------------|-----------|------------------------------------------|-------------------------|
| `byte`     | 8 bits    | Inteiros entre -128 e 127                | `byte meuByte = 127;`  |
| `short`    | 16 bits   | Inteiros entre -32.768 e 32.767          | `short meuShort = 32767;` |
| `int`      | 32 bits   | Inteiros entre -2^31 e 2^31-1            | `int idade = 25;`      |
| `long`     | 64 bits   | Inteiros grandes, termina com `L`        | `long populacao = 100L;` |
| `float`    | 32 bits   | Precisão simples, termina com `F`        | `float preco = 10.5F;`|
| `double`   | 64 bits   | Precisão dupla                          | `double salario = 5000.75;` |
| `char`     | 16 bits   | Armazena um caractere Unicode            | `char inicial = 'A';` |
| `boolean`  | 1 bit     | Armazena `true` ou `false`               | `boolean ativo = true;` |

---

## **Variáveis e Tipos de Dados**

- **Declaração**: `tipo nomeDaVariavel = valor;`
- **Regras**:
    - Deve ter um nome único no escopo.
    - Começar com letra, `$` ou `_`.
    - Não pode conter espaços ou caracteres especiais.

### **Exemplo**:
```java
byte meuByte = 127;
int idade = 25;
double salario = 102.51;
boolean ativo = true;
System.out.println("Idade: " + idade);
```

---

## **Operadores em Java**

### **1. Operadores Aritméticos**
- Realizam operações matemáticas.
  | Operador | Descrição   | Exemplo        | Resultado |
  |----------|--------------|----------------|-----------|
  | `+`      | Soma         | `5 + 3`        | `8`       |
  | `-`      | Subtração    | `5 - 3`        | `2`       |
  | `*`      | Multiplicação | `5 * 3`        | `15`      |
  | `/`      | Divisão      | `10 / 2`       | `5`       |
  | `%`      | Resto        | `10 % 3`       | `1`       |

### **2. Operadores de Atribuição**
- Usados para atribuir valores.
  | Operador | Exemplo     | Equivalente a |
  |----------|-------------|---------------|
  | `=`      | `x = 10`    | `x = 10`      |
  | `+=`     | `x += 5`    | `x = x + 5`   |
  | `-=`     | `x -= 5`    | `x = x - 5`   |
  | `*=`     | `x *= 5`    | `x = x * 5`   |
  | `/=`     | `x /= 5`    | `x = x / 5`   |
  | `%=`     | `x %= 5`    | `x = x % 5`   |

### **3. Operadores Relacionais**
- Comparam valores e retornam `true` ou `false`.
  | Operador | Descrição       | Exemplo  |
  |----------|-----------------|----------|
  | `==`     | Igual a         | `x == y` |
  | `!=`     | Diferente de    | `x != y` |
  | `>`      | Maior que       | `x > y`  |
  | `<`      | Menor que       | `x < y`  |
  | `>=`     | Maior ou igual  | `x >= y` |
  | `<=`     | Menor ou igual  | `x <= y` |

### **4. Operadores Lógicos**
- Usados para combinar expressões booleanas.
  | Operador | Descrição       | Exemplo         |
  |----------|-----------------|-----------------|
  | `&&`     | E lógico (AND)  | `true && false` |
  | `||`     | OU lógico (OR)  | `true || false` |
  | `!`      | Negação (NOT)  | `!true`         |

### **5. Incremento e Decremento**
- Alteram o valor de uma variável em 1 unidade.
  | Operador | Exemplo       | Resultado |
  |----------|---------------|-----------|
  | `++`     | `x++` ou `++x`| Incrementa |
  | `--`     | `x--` ou `--x`| Decrementa |

### **6. Operador Ternário**
- Simplifica condicionais simples.
  **Sintaxe**:
  ```java
  variavel = (condicao) ? valorSeTrue : valorSeFalse;
  ```
  **Exemplo**:
  ```java
  int idade = 18;
  String categoria = (idade >= 18) ? "Adulto" : "Menor";
  System.out.println(categoria); // Adulto
  ```

---