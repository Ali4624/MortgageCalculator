# 🏠 Mortgage Calculator

A clean, fully-featured **Mortgage Calculator** built in Java that helps users estimate monthly payments, total interest paid, and generate complete amortization schedules for home loans.

---

## 📋 Table of Contents

- [About](#about)
- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Formula](#formula)
- [Project Structure](#project-structure)
- [Technologies](#technologies)
- [Contributing](#contributing)
- [License](#license)

---

## About

This project provides a straightforward command-line mortgage calculator that computes key financial metrics based on user-provided loan parameters. Whether you're a first-time homebuyer or a developer learning Java, this tool offers a clean reference implementation of real-world financial calculations.

---

## ✨ Features

- Calculate **monthly mortgage payments**
- Compute **total payment** over the full loan term
- Compute **total interest paid**
- Generate a full **amortization schedule** (principal vs. interest breakdown per month)
- Input validation with helpful error messages
- Support for various loan terms (15, 20, 30 years, or custom)
- Clean, readable console output

---

## 🚀 Getting Started

### Prerequisites

- Java **11** or higher
- Maven **3.6+** (optional, for building with Maven)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/mortgage-calculator.git
   cd mortgage-calculator
   ```

2. Compile the project:
   ```bash
   javac -d out src/main/java/com/mortgage/*.java
   ```

3. Run the application:
   ```bash
   java -cp out com.mortgage.Main
   ```

### Build with Maven

```bash
mvn clean package
java -jar target/mortgage-calculator.jar
```

---

## 🖥️ Usage

When you run the application, you will be prompted to enter:

| Input | Description | Example |
|---|---|---|
| Loan Amount | Total principal in USD | `350000` |
| Annual Interest Rate | As a percentage | `6.75` |
| Loan Term | Duration in years | `30` |

**Sample Output:**

```
====================================
       MORTGAGE CALCULATOR
====================================
Loan Amount:        $350,000.00
Annual Rate:        6.75%
Loan Term:          30 years

Monthly Payment:    $2,270.47
Total Payment:      $817,369.20
Total Interest:     $467,369.20
====================================

AMORTIZATION SCHEDULE
------------------------------------------------------------
Month  Payment       Principal     Interest      Balance
------------------------------------------------------------
1      $2,270.47     $304.22       $1,966.25     $349,695.78
2      $2,270.47     $305.93       $1,964.54     $349,389.85
...
360    $2,270.47     $2,257.78     $12.69        $0.00
------------------------------------------------------------
```

---

## 📐 Formula

Monthly payment is calculated using the standard amortization formula:

```
M = P × [r(1 + r)^n] / [(1 + r)^n - 1]
```

Where:

- **M** = Monthly payment
- **P** = Principal loan amount
- **r** = Monthly interest rate (annual rate ÷ 12)
- **n** = Total number of payments (years × 12)

---

## 📁 Project Structure

```
mortgage-calculator/
├── src/
│   └── main/
│       └── java/
│           └── com/mortgage/
│               ├── Main.java               # Entry point & user input
│               ├── MortgageCalculator.java # Core calculation logic
│               ├── AmortizationSchedule.java # Schedule generation
│               └── InputValidator.java     # Input validation utilities
├── test/
│   └── java/
│       └── com/mortgage/
│           └── MortgageCalculatorTest.java # Unit tests
├── pom.xml                                 # Maven build file
└── README.md
```

---

## 🛠️ Technologies

- **Language:** Java 11+
- **Build Tool:** Maven
- **Testing:** JUnit 5
- **Style:** Standard Java conventions (Google Java Style Guide)

---

## 🤝 Contributing

Contributions are welcome! To get started:

1. Fork the repository
2. Create a feature branch: `git checkout -b feature/your-feature-name`
3. Commit your changes: `git commit -m "Add your feature"`
4. Push to your branch: `git push origin feature/your-feature-name`
5. Open a Pull Request

Please make sure all tests pass before submitting a PR:
```bash
mvn test
```

---

## 📄 License

This project is licensed under the **MIT License** — see the [LICENSE](LICENSE) file for details.

---

## 📬 Contact

Have a question or suggestion? Feel free to open an [issue](https://github.com/your-username/mortgage-calculator/issues) or reach out directly.

---

> Built with ☕ Java — because financial clarity shouldn't be complicated.
