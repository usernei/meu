# 🧪 Projeto de Automação de Testes – 102024_cucumber-main

Este projeto foi desenvolvido para automatizar testes de interface utilizando **Java**, **Selenium WebDriver** e **Cucumber (BDD)**.  
A estrutura segue o padrão **Page Object Model (POM)**, garantindo organização, legibilidade e manutenção fácil dos testes.

---

## 📁 Estrutura do Projeto

102024_cucumber-main
│
├── pom.xml # Gerenciamento de dependências Maven
└── src
└── test
├── java
│ └── dev.plataforma
│ ├── drivers
│ │ ├── DriverManager.java
│ │ └── Drivers.java
│ ├── metodos
│ │ └── Metodos.java
│ ├── pages
│ │ └── LoginPage.java
│ ├── runner
│ └── tests
└── resources
└── features
└── login.feature

yaml
Copiar código

---

## ⚙️ Tecnologias Utilizadas

- **Java 11+**
- **Cucumber** – para escrita de cenários BDD  
- **Selenium WebDriver** – automação de navegador  
- **JUnit/TestNG** – execução dos testes  
- **Maven** – gerenciamento de dependências  

---

## 🚀 Como Executar o Projeto

### 1️⃣ Clonar o repositório
```bash
git clone https://github.com/<seu_usuario>/102024_cucumber-main.git
2️⃣ Acessar o diretório
bash
Copiar código
cd 102024_cucumber-main
3️⃣ Instalar as dependências
bash
Copiar código
mvn clean install
4️⃣ Executar os testes
bash
Copiar código
mvn test
🧩 Estrutura Funcional
Pasta/Arquivo	Função
drivers	Contém classes responsáveis pela inicialização e configuração dos navegadores (DriverManager, Drivers).
metodos	Métodos utilitários e ações genéricas utilizadas nas páginas.
pages	Implementa o padrão Page Object Model (POM), mapeando elementos e ações de cada página.
features	Contém os arquivos .feature escritos em Gherkin (cenários BDD).
runner	Responsável por executar os testes e integrar com o framework Cucumber.
pom.xml	Gerencia as dependências do projeto via Maven.

🧠 Exemplo de Cenário (login.feature)
gherkin
Copiar código
Feature: Login no sistema
  Scenario: Login válido
    Given que o usuário esteja na tela de login
    When inserir credenciais válidas
    Then o sistema deve redirecionar para a página inicial
🤝 Contribuição
Faça um fork do projeto

Crie uma branch para sua feature (git checkout -b feature/nova-feature)

Faça o commit das alterações (git commit -m 'Adiciona nova feature')

Faça push para a branch (git push origin feature/nova-feature)

Abra um Pull Request
