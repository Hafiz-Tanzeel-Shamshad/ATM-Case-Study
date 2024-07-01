# ATM Simulation System

This Java application simulates an ATM (Automated Teller Machine) system with basic banking operations.

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

## Usage
To use the ATM system:
1. Clone this repository.
2. Compile the Java files (`ATM.java`, `Screen.java`, `Keypad.java`, etc.).
3. Run the `ATM` class as the main application.

Upon running, follow the on-screen prompts to interact with the ATM:
- Enter your account number and PIN.
- Choose from options to view balance, withdraw cash, deposit funds, or exit.

## Classes and Components
- **ATM.java:** Main class managing ATM operations, user authentication, and transaction processing.
- **Screen.java:** Simulates display output to the user.
- **Keypad.java:** Simulates input from the user via a keypad.
- **CashDispenser.java:** Simulates dispensing cash.
- **DepositSlot.java:** Simulates a slot for depositing funds.
- **BankDatabase.java:** Simulates a database of bank accounts for authentication and transaction processing.

## Installation
Ensure you have Java Development Kit (JDK) installed to compile and run the Java files. No additional dependencies are required.

## Contributing
Contributions are welcome! If you have suggestions or improvements, please fork the repository and create a pull request. For major changes, please open an issue first to discuss what you would like to change.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
