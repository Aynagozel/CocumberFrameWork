This project is a Java-based BDD automation framework built using Selenium WebDriver, Cucumber, and Maven. It uses Gherkin feature files, step definitions, hooks, and runner classes to create readable and maintainable automated UI tests.

Technologies Used
Java

Selenium WebDriver

Cucumber (BDD)

Gherkin

JUnit / TestNG

Maven

Project Structure
CucumberFramework/
├── features/        # Gherkin scenarios
├── steps/           # Step definitions
├── hooks/           # Before/After hooks
├── runners/         # Test runners
├── pages/           # Page objects
└── pom.xml          # Dependencies

Key Features
BDD structure with Gherkin

Page Object Model (POM)

Hooks for setup and teardown

Reusable step definitions

Centralized runner configuration

Test Coverage
UI scenarios written in Gherkin

Step definition mapping

Hook-based setup and teardown

Runner-level configuration

Basic regression execution

How to Run Tests
mvn clean test

Reports
Cucumber HTML and JSON reports are generated under the target directory.
