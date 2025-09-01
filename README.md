# Compound Interest Calculator (Java)

Simple console app to compute compound interest.

## Formula

A = P * (1 + r/n)^(n*t)

- P: Principal
- r: Annual interest rate (decimal), e.g. 7.5% = 0.075
- n: Times compounded per year (12=monthly, 4=quarterly, 1=yearly)
- t: Years (integer in this version)

## Run

```bash
find src -name "*.java" > sources.txt
javac @sources.txt -d out
java -cp out CompoundInterest
```
