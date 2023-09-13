# Automated Testing for Banking Application

## Overview

This repository contains an automated testing framework for a banking application, leveraging Selenium WebDriver with Java. The framework is designed to facilitate the testing of various banking functionalities, such as car loans and mobile phone replenishment, ensuring the application's quality and reliability.

## Project Structure

The project is organized as follows:

- `src/main/java`: Contains the main source code for the automation framework.
  - `common`: Houses common utility classes like `CommonActions.java` and `Config.java`.
  - `constants`: Contains constant values used throughout the project in `Constant.java`.
  - `pages`: Contains page objects organized by functionality.
    - `base`: Includes the `BasePage.java` class for common page interactions.
    - `loans`: Contains page objects related to car loans, such as `CarLoansPage.java`.
    - `telecommunications`: Includes page objects for mobile phone replenishment, like `MobilePhoneReplenishmentPage.java`.
- `src/main/resources`: Contains additional resources for the project, including WebDriver executables and configuration files.
- `src/test/java/tests`: Holds test classes organized by functionality.
  - `base`: Contains the `BaseTest.java` class for common test configurations.
  - `Listener.java`: Custom test listener for reporting.
  - `loans/positive`: Test classes for positive scenarios related to car loans.
  - `telecommunications/positive`: Test classes for positive scenarios related to mobile phone replenishment.
- `src/test/resources`: Contains testing-related resource files, such as configuration properties.

## Getting Started

1. Clone this repository to your local machine.
2. Configure the project based on your testing environment and requirements using `Config.java` and other configuration files.
3. Install the necessary dependencies specified in `pom.xml` using Maven.
4. Run the desired test cases to perform automated testing of the banking application.

## Dependencies

- Selenium WebDriver
- Java
- JUnit
- Allure Reporting

## Contributing

Contributions to enhance the framework and test coverage are welcome! Feel free to fork the repository and submit pull requests with your improvements or bug fixes.

## License

This project is licensed under the MIT License.
