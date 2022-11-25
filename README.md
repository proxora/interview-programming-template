# Programmierbeispiel für Vorstellungsgespräche


## Requirements

JDK 17 ist mindestends erforderlich (JAVA_HOME Umgebungsvariable ist gesetzt und java binaries sind im PATH)

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
