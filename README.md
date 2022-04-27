# Programmierbeispiel für Vorstellungsgespräche

Aufgabe ist es im `BookRepository` verschiedene (such) Funktionen zu implementieren 
und diese im `BookRepositoryTest` zu testen.

1. Implementiere eine Methode, die alle Bücher findet, die nach einem bestimmten Datum veröffentlicht worden sind.

## Requirements

JDK 11 ist erforderlich (JAVA_HOME Umgebungsvariable ist gesetzt und java binaries sind im PATH)

zu verifizieren via:
```bash
echo $JAVA_HOME
echo $PATH
java -version
```

## Project setup

### Build

```bash
./mvnw clean verify
```

### IDE Setup

Es muss meist nur die `pom.xml` in der IDE importiert werden. Es ist wichtig, dass erkannt wird, dass es sich um ein Maven-Projekt handelt.