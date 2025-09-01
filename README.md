# 📈 Compound Interest Calculator (Java)

A simple **Java console application** that calculates compound interest based on user input.  
This project demonstrates **Core Java fundamentals** including variables, user input handling, arithmetic operations, and console output.  

---

## 🔧 Features
- Accepts **Principal**, **Rate of Interest**, **Time (in years)**, and **Number of Compounds per year** from the user.
- Calculates:
  - Compound Interest  
  - Total Amount (Principal + Interest)  
- Displays results in a clean format.

---

## 📂 Project Structure
compound-interest/
├── src/
│ └── CompoundInterest.java
├── out/ # Compiled bytecode (ignored in Git)
├── .gitignore
└── README.md

---

## ▶️ How to Run

### 1. Compile the program
```bash
javac -d out src/CompoundInterest.java

2. Run the program
java -cp out CompoundInterest

💻 Sample Run
Enter the principal amount: 1000
Enter the annual interest rate (in %): 5
Enter the time (in years): 2
Enter number of times interest applied per year: 4

Compound Interest: 104.486...
Total Amount: 1104.486...

🎯 Learning Highlights

Java basics: variables, data types, arithmetic operators

Taking user input using Scanner

Command-line compilation and execution (javac, java)

Git best practices with .gitignore and README documenta

📌 Future Improvements

Add validation for invalid inputs (e.g., negative values)

Create a GUI version using Java Swing/JavaFX

Package into a JAR file for easier execution

👤 Author

Charandeep Singh Dhingra
📌 Aspiring Java Developer | Problem Solver | Lifelong Learner
https://github.com/smartcd007
