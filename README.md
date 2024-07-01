# ATM Simulation System

This project simulates an ATM (Automated Teller Machine) system with basic banking operations such as balance inquiry, cash withdrawal, and fund deposit. It consists of several Java classes organized into packages to simulate different components of the ATM system.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Usage](#usage)
- [Classes and Components](#classes-and-components)
- [Installation](#installation)
- [Contributing](#contributing)
- [License](#license)

## Overview
The ATM system allows users to authenticate themselves using an account number and PIN. Once authenticated, users can perform various transactions such as checking account balance, withdrawing cash, and depositing funds.

## Features
- **User Authentication:** Users can enter their account number and PIN to access their accounts.
- **Transaction Options:** Users can choose from options like checking balance, withdrawing cash, depositing funds, and exiting the system.
- **Realistic Simulation:** Simulates interactions with ATM hardware components like screen, keypad, cash dispenser, and deposit slot.
- **Menu-Driven Interface:** Clear and intuitive menu for user interaction.

## Classes and Components

### ATM Package

1. **ATM.java**
   - Manages the main functionality of the ATM system including user authentication and transaction processing.
2. **BalanceInquiry.java**
   - Implements the balance inquiry transaction, displaying the current balance for a given account.
3. **Deposit.java**
   - Implements the deposit transaction, allowing users to deposit funds into their accounts.
4. **Transaction.java**
   - Abstract class defining the structure and behavior of all transaction types within the ATM system.
5. **Withdrawal.java**
   - Implements the withdrawal transaction, allowing users to withdraw cash from their accounts.

### Banking Package

1. **Account.java**
   - Represents a bank account with attributes such as account number, PIN, and balance.
2. **BankDatabase.java**
   - Simulates a database of bank accounts, providing methods for account validation and transaction processing.

### Hardware Package

1. **CashDispenser.java**
   - Simulates the cash dispenser hardware, managing the availability of cash for withdrawals.
2. **DepositSlot.java**
   - Simulates the deposit slot hardware, allowing users to deposit cash or checks into the ATM.
3. **Keypad.java**
   - Simulates the keypad hardware, capturing user input for account numbers, PINs, and transaction choices.
4. **Screen.java**
   - Simulates the screen hardware, displaying messages and transaction prompts to the user.

### Main Application

- **Main.java**
  - Entry point for running the ATM simulation system. Initializes the ATM object and starts the application.

## How to Run

1. Clone the repository to your local machine.
   
2. Open the project in your preferred Java IDE.

3. Compile and run the `Main.java` file to start the ATM simulation.

## Installation
Ensure you have Java Development Kit (JDK) installed to compile and run the Java files. No additional dependencies are required.

## Usage
To use the ATM system:
1. Clone this repository.
2. Compile the Java files (`ATM.java`, `Screen.java`, `Keypad.java`, etc.).
3. Run the `ATM` class as the main application.

Upon running, follow the on-screen prompts to interact with the ATM:
- Enter your account number and PIN.
- Choose from options to view balance, withdraw cash, deposit funds, or exit.

## Contributing
Contributions are welcome! If you have suggestions or improvements, please fork the repository and create a pull request.
For major changes, please open an issue first to discuss what you would like to change.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

                                                        -----------------------------------------

















