# Compound Interest Calculator

A small, well-tested Java console application that calculates compound interest using the
standard formula.

## Formula

This project implements the compound interest formula:

> A = P × (1 + r / n)^(n × t)

Where:

- `P` — principal amount
- `r` — annual interest rate (decimal, e.g. `0.05` for 5%)
- `n` — number of times interest is compounded per year
- `t` — number of years

## Features

- Simple interactive CLI for computing compound interest
- Core calculation covered by JUnit 5 tests
- Maven build for reproducible builds and tests

## Quick Start

Prerequisites:

- Java 11+ installed
- Maven 3.6+ installed

Build and run tests from the project root:

```bash
mvn clean test
```

Package the application:

```bash
mvn clean package
```

Run the console app (after `mvn package`) using the compiled classes:

```bash
java -cp target/classes com.smartcd007.compound.CompoundInterest
```

The program will prompt for the necessary values (principal, rate, compound frequency, years)
and then print the final amount.

## Example

Example input/interaction (user input is shown after the prompts):

```
Principal (P): 1000
Annual rate (r, e.g. 0.05): 0.05
Compounds per year (n): 12
Years (t): 10

Result: Final amount after 10 years: 1647.01
```

## Project Structure

- `src/main/java` — application source (`com.smartcd007.compound.CompoundInterest`)
- `src/test/java` — unit tests (`CompoundInterestTest`)
- `pom.xml` — Maven project configuration

## Contributing

Contributions are welcome. Please fork the repository, make changes on a feature branch, and
open a pull request describing the change.

## License

This repository does not include an explicit license. If you want to make this project public
with a permissive license, add a `LICENSE` file (for example, MIT or Apache-2.0).

---

Repository: https://github.com/smartcd007/compound-interest-calculator
