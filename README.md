# SavingsCalculator

Savings Interest Calculator (Java)

This program calculates and displays values within a typical bank savings account based on user input. It simulates the growth of savings over a specified period, taking into account initial deposits, monthly deposits, interest rates, compounding frequency, and the number of years.

# Table of Contents

<li>Introduction</li>
<li>Usage</li>
<li>Inputs</li>
<li>Calculations</li>
<li>Output</li>
<li>Author Information</li>


# Introduction

Interest is a fundamental concept in finance. This program demonstrates the application of computing in financial calculations by simulating the growth of a savings account. Users can input their initial deposit, monthly deposit, interest rate, compounding frequency, and the number of years. The program then calculates and displays the ending balance of the savings account at the end of each year, taking into account the interest earned through compounding.

# Usage

Compile and run the program using a Java compiler.
Enter the following information when prompted:
Initial deposit
Monthly deposit
Interest rate (in percentage)
Compounding frequency (choose from: "daily", "monthly", "yearly")
Number of years
The program will display the simulated growth of the savings account over the specified period.
Inputs

The program prompts the user for the following inputs:

- Initial deposit: The amount of money initially deposited into the savings account.
- Monthly deposit: The amount of money deposited into the account on a monthly basis.
- Interest rate: The annual interest rate for the savings account.
- Compounding frequency: The frequency at which interest is compounded ("daily", "monthly", or "yearly").
- Number of years: The duration for which the savings account will be simulated.

# Calculations

The program calculates the ending balance of the savings account at the end of each year using the formula for compound interest:

```
A = P * (1 + r/n)^(nt)
```

Where:

- A is the ending balance.
- P is the principal amount (initial deposit).
- r is the annual interest rate (expressed as a decimal).
- n is the number of times interest is compounded per year.
- t is the number of years.

# Output

The program displays the simulated growth of the savings account over the specified period. For each year, it shows the ending balance and the amount of interest accrued during that year. The output is formatted using the printf method to display values with appropriate formatting.

# Author Information

- Author: Fatima Dembele
- NetID: 32107296
- Email: fdembele@u.rochester.edu
- Lab Number: 13
- Lab Date: 09/14/2022
- Lab Section: 13
- Lab Day/Time: Monday/Wednesday, 2:00-3:15pm
- Project: 1
