# Aula 04 - Arrays em Java

## O que é um Array?

Um **array** em Java é uma estrutura de dados que armazena uma coleção de elementos do **mesmo tipo**, em uma **posição contínua na memória**. Cada elemento pode ser acessado por um **índice**, que começa em **0**.

Arrays têm **tamanho fixo**, ou seja, uma vez definido o tamanho, ele **não pode ser alterado**.

---

## Declaração de Arrays

```java
int[] numeros;      // forma mais comum
int outros[];       // forma alternativa, menos recomendada
```

---

## Inicialização

### Declarando com tamanho fixo:
```java
int[] idades = new int[5];  // inicializa com zeros
```

### Declarando e preenchendo:
```java
Integer[] valores = {1, 2, 3, 4, 5};
String[] nomes = {"Ana", "João", "Pedro"};
```

---

## Acessando elementos

```java
System.out.println(valores[0]); // imprime 1
valores[2] = 99;                // altera o valor no índice 2
```

---

## Tamanho do array

```java
System.out.println(valores.length); // retorna 5
```

---

## Iteração com `for`

```java
for (int i = 0; i < valores.length; i++) {
        System.out.println(valores[i]);
}
```

---

## Iteração com `for-each`

```java
for (int v : valores) {
        System.out.println(v);
}
```

---

## Usando com `List`

```java
List<Integer> lista = Arrays.asList(valores);
lista.forEach(System.out::println);
```

> `Arrays.asList` cria uma lista imutável ligada ao array original.

---

## Copiando arrays

### Copiando um trecho:
```java
String[] palavras = {"treinamento", "descomplicando", "java", "spring"};
String[] recorte = Arrays.copyOfRange(palavras, 1, 3); // pega do índice 1 ao 2
```

### Copiando com novo tamanho:
```java
String[] primeiros = Arrays.copyOf(palavras, 2); // ["treinamento", "descomplicando"]
```

---

## Limitações de Arrays
- Tamanho fixo
- Tipo único
- Estrutura estática (diferente de `ArrayList`)

Para listas mais dinâmicas, usamos coleções da API Java como `ArrayList`, `LinkedList`, etc.

---

## Preenchendo Arrays com `Arrays.fill`

Você pode preencher todos os elementos de um array com o mesmo valor usando:

```java
String[] linguagens = new String[5];
Arrays.fill(linguagens, "java"); // preenche todas as posições com "java"
```

### Resultado:
```
["java", "java", "java", "java", "java"]
```

---

## Comparando Arrays com `Arrays.equals`

Para saber se dois arrays são exatamente iguais (mesmo tamanho e mesmos valores na mesma ordem):

```java
int[] a = {1, 2, 3};
int[] b = {1, 2, 3};
boolean iguais = Arrays.equals(a, b); // true
```

---

## Ordenando Arrays com `Arrays.sort`

Ordena os elementos de forma natural (crescente ou alfabética):

```java
String[] nomes = {"Maria", "Ana", "Carlos"};
Arrays.sort(nomes);
```

### Resultado:
```
["Ana", "Carlos", "Maria"]
```

Você também pode ordenar parte de um array copiado:

```java
String[] copia = Arrays.copyOf(nomes, 2); // pega os dois primeiros
Arrays.sort(copia);
```

---

## Exemplo completo

```java
String[] palavras = {"java", "spring", "descomplicando", "linux", "tips"};
String[] copia = Arrays.copyOf(palavras, 3);
Arrays.sort(copia);
List<String> listaOrdenada = List.of(copia);
listaOrdenada.forEach(System.out::println);
```
