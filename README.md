# Estudo para Testes Unitários com Java, JUnit 5, Maven e PIT

Este repositório foi criado com o objetivo de apresentar uma estrutura básica de testes unitários utilizando **Java 21**, **JUnit 5**, **Maven** e **teste de mutação com Pitest**.

Trabalhamos com três classes principais, cada uma com uma finalidade distinta, para exemplificar diferentes tipos de cobertura de testes: instrução, decisão e mutação.

---

## 🚀 Tecnologias Utilizadas

- **Java**: 21
- **Maven**: 3.9+
- **JUnit 5**: Para execução dos testes unitários
- **Pitest**: Para execução de testes de mutação
- **IDE sugerida**: IntelliJ IDEA com plugin JaCoCo (para cobertura visual)

---

## 📁 Estrutura do Projeto

```
src
├── main
│   └── java
│       ├── aplicacao
│       │   ├── Calculadora.java
│       │   ├── Comparador.java
│       │   └── ComparadorDeDecisao.java
├── test
    └── java
        └── pacoteTeste
            ├── CalculadoraTest.java
            ├── ComparadorTest.java
            └── ComparadorDeDecisaoTest.java
```

---

## ⚙️ Configuração do Projeto (pom.xml)

```xml
<properties>
    <maven.compiler.source>21</maven.compiler.source>
    <maven.compiler.target>21</maven.compiler.target>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
</properties>

<dependencies>
    <!-- JUnit 5 -->
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.10.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>

<build>
    <plugins>
        <!-- Compilador -->
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.11.0</version>
        </plugin>

        <!-- Execução dos testes -->
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>3.0.0-M9</version>
        </plugin>

        <!-- PIT: Teste de Mutação -->
        <plugin>
            <groupId>org.pitest</groupId>
            <artifactId>pitest-maven</artifactId>
            <version>1.15.0</version>
            <dependencies>
                <dependency>
                    <groupId>org.pitest</groupId>
                    <artifactId>pitest-junit5-plugin</artifactId>
                    <version>1.2.0</version>
                </dependency>
            </dependencies>
            <configuration>
                <targetClasses>
                    <param>aplicacao.*</param>
                </targetClasses>
                <targetTests>
                    <param>pacoteTeste.*</param>
                </targetTests>
            </configuration>
        </plugin>
    </plugins>
</build>
```

---

## 🔧 Como instalar e rodar o projeto

```bash
# Clonar o repositório
$ git clone git@github.com:Abnernnetto/estudoParaTestesUnitarios-JAVA.git
$ cd estudoParaTestesUnitarios-JAVA

# Rodar os testes unitários
$ mvn test

# Rodar teste de mutação com PIT
$ mvn org.pitest:pitest-maven:mutationCoverage
```

---

## 📊 Tipos de cobertura de testes abordados

### ✅ Instrução (Instruction Coverage)
Garante que **todas as linhas de código** foram executadas por ao menos um teste.

> Exemplo: Classe `Calculadora`
> - Testes simples para cada método (`+`, `-`, `*`, `/`)

### ✅ Decisão/Branches (Branch Coverage)
Garante que **todas as condições** (if/else) foram cobertas nos testes.

> Exemplo: `ComparadorDeDecisao`
> - Testes que cobrem número maior, menor e igual (técnicas: **Partição de Equivalência** e **Análise de Valor Limite**)

### ✅ Testes de Mutação (Mutation Testing)
Simula erros no código (como trocar `*` por `/`) para verificar se os testes pegariam esse erro. Se o erro passa despercebido, o teste **é fraco**.

> Exemplo: `Comparador`
> - Técnica aplicada: **Tabela de Decisão / MC/DC**
> - Mesmo com 100% de branch/instrução, mutação apontou gaps

---

## 🔮 O que é o PIT?

[PIT](https://pitest.org) é uma ferramenta de **testes de mutação** para Java. Ele altera o bytecode da sua aplicação para gerar pequenos erros e verifica se os seus testes conseguem detectá-los.

### Por que usar?
- Testes tradicionais podem enganar ("100% cobertura" mas não detectam erros reais)
- PIT detecta testes fracos

### Como interpretar?
- **Killed mutants**: mutantes detectados pelos testes (bom)
- **Survived mutants**: mutantes não detectados (precisam de testes melhores)

---

## 💡 Conclusão

Este projeto demonstra que **alta cobertura não significa qualidade de testes**. Indicadores como **Instruction** e **Branch** ajudam, mas **só o teste de mutação revela de fato se seus testes validam o comportamento correto do código.**

As técnicas utilizadas incluem:
- Cobertura por instrução
- Cobertura por decisão/branch
- Partição de equivalência
- Análise de valor limite
- Tabela de decisão / MC/DC

Use esse projeto como base para criar testes com mais propósito, melhor cobertura real e mais resistência a erros acidentais no código.

---

Feito com ❤️ por Abner Nunes Netto

