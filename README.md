////////////////////////////////////////////////////////////////////
// Gaetano Spagnoli 2147977
// Ruben Spadiliero 2075522
////////////////////////////////////////////////////////////////////

# Roman Number Converter

Convertitore da numeri arabi a numeri romani per i primi 1000 interi, con stampa in ASCII art.

![Build](https://github.com/gaexxx/roman-number-converter/actions/workflows/build.yml/badge.svg)
[![Coverage Status](https://coveralls.io/repos/github/gaexxx/roman-number-converter/badge.svg)](https://coveralls.io/github/gaexxx/roman-number-converter)

## Requisiti

- Java 8 o superiore
- Maven

## Compilazione

```bash
mvn compile
```

## Esecuzione dei test
```bash
mvn test
```

## Analisi statica
```bash
mvn package
```

## Code coverage
```bash
mvn test jacoco:report
```

Il report di coverage viene generato in:
target/site/jacoco/index.html

## Esecuzione del programma
```bash
mvn exec:java
```

## Continuous Integration

Il progetto utilizza GitHub Actions per automatizzare il processo di build.

Ad ogni push o pull request vengono eseguiti automaticamente:

- compilazione
- test
- analisi statica del codice (Checkstyle)

Il badge **Build** riportato in cima alla pagina rappresenta l’esito complessivo della pipeline di Continuous Integration, inclusa l’analisi statica.