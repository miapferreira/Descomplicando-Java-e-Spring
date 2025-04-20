# 📘 Descomplicando Java e Spring

Este repositório contém minhas anotações organizadas por aula durante o curso **Descomplicando Java e Spring**, com apoio do [Docsify](https://docsify.js.org) para gerar uma documentação navegável.

---

## 📚 Estrutura

- As anotações estão localizadas na pasta [`docs/`](docs/)
- Cada aula é dividida em um arquivo `.md`
- A navegação lateral é gerada automaticamente com o `_sidebar.md`

---

## 🚀 Como rodar a documentação localmente

### 1. Instale o Docsify (caso ainda não tenha)

```bash
npm install -g docsify-cli
```

### 2. Rode o servidor local

Na raiz do projeto:

```bash
docsify serve docs --port 3000
```

Acesse [http://localhost:3000](http://localhost:3000) no navegador.

---

## 📦 Estrutura do projeto

```
descomplicando-java-e-spring/
├── docs/
│   ├── README.md
│   ├── aula01-jdk-e-tipos.md
│   ├── aula02-operadores.md
│   ├── aula03-condicionais-repeticao.md
│   ├── aula04-arrays.md
│   └── _sidebar.md
├── index.html
└── package.json (opcional para rodar com `npm run docs`)
```

---

## 📌 Requisitos

- Node.js + npm
- Navegador moderno (Chrome, Firefox, Edge)

---

## ✨ Créditos
Treinamento Descomplicando Java e Spring da [LinuxTips](https://linuxtips.io/)

Documentação gerada com [Docsify](https://docsify.js.org).

