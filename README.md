# Compound Interest Calculator (Java)

Simple console app to compute compound interest.

## Formula

A = P * (1 + r/n)^(n*t)

- P: Principal
- r: Annual interest rate (decimal), e.g. 7.5% = 0.075
- n: Times compounded per year (12=monthly, 4=quarterly, 1=yearly)
- t: Years (integer in this version)

## Build & Run (Gradle)

This repository now uses Gradle with the standard Java layout (sources under
`src/main/java`, tests under `src/test/java`). A simple JUnit 5 test has been
added for the calculation logic and a GitHub Actions workflow (`.github/workflows/ci.yml`)
was added to run the build on push/PR.

If you have Gradle installed you can build and run tests with:

```bash
gradle build
gradle test
```

The repository also includes Gradle wrapper scripts (`gradlew`, `gradlew.bat`) and
`gradle/wrapper/gradle-wrapper.properties`. If the wrapper JAR is missing or not
functional in the repository, regenerate it locally with a working Gradle installation:

```bash
# regenerate wrapper (requires local Gradle)
gradle wrapper --gradle-version 8.4.1
chmod +x ./gradlew
```

Quick non-Gradle test (works without Gradle; useful for a quick sanity run):

```bash
mkdir -p build/classes
javac -d build/classes src/main/java/CompoundInterest.java
printf "1000\n5\n12\n10\n" | java -cp build/classes CompoundInterest
```

This will run the program with sample input (principal=1000, rate=5%, monthly compounding for 10 years).

Old manual commands (kept for reference):

```bash
find src -name "*.java" > sources.txt
javac @sources.txt -d out
java -cp out CompoundInterest
```
