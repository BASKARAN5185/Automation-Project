# Automation Project

### Description

The **Automation Project** contains a collection of automation scripts designed to automate interactions with different websites and platforms using **Java** and **Selenium WebDriver**. Each class file within the project automates specific tasks on different platforms such as **AirAsia**, **AirIndia**, **Instagram**, **Burger King**, **ICICI Bank**, **Myntra**, **Swiggy**, **Zomato**, **eBay**, **Google**, **OrangeHRM**, and more.

These scripts serve as examples of how Selenium WebDriver can be used to automate browsing, login, search, data entry, and form submissions on various websites. The project includes automation tasks for both functional testing as well as real-world scenarios like online shopping, food delivery, and banking.

### Class Files

- **AirAsia.java**: Automates flight booking on the AirAsia website.
- **AirIndia.java**: Automates flight booking on the Air India website.
- **BurgerKing.java**: Automates order placement on the Burger King website.
- **ICICIBANK.java**: Automates login and banking operations on ICICI Bank's online platform.
- **Instagram.java**: Automates login and interactions on Instagram.
- **Login.java**: Generalized login automation for different websites (can be used as a template).
- **Myntraproject.java**: Automates browsing and shopping tasks on Myntra (an online shopping platform).
- **OLA.java**: Automates the booking of rides via the OLA app website.
- **ParallelBrowser.java**: Runs multiple Selenium WebDriver instances in parallel for testing multiple sites simultaneously.
- **SWIGGy.java**: Automates food ordering tasks on Swiggy (a food delivery platform).
- **ZOMATO.java**: Automates food ordering tasks on Zomato (another food delivery platform).
- **ebay.java**: Automates product search and interaction on eBay.
- **openGoogle.java**: Opens the Google homepage and performs search operations.
- **orangeHRM.java**: Automates tasks on the OrangeHRM website (HR management platform).

### Features

- **Automated Web Interactions**: Perform tasks such as logging in, submitting forms, browsing products, and completing purchases.
- **Parallel Test Execution**: Run tests across multiple browsers or platforms simultaneously to speed up automation.
- **Data-driven Automation**: Automate repetitive tasks using parameters such as user credentials, search keywords, etc.
- **Web Scraping (Optional)**: Extract information from websites, like product details, reviews, etc.
- **Screenshots**: Capture screenshots during automation for better error tracking and debugging.

### Technologies Used

- **Java**: The primary programming language used for writing the automation scripts.
- **Selenium WebDriver**: The browser automation tool used to interact with websites.
- **TestNG (Optional)**: If you plan to use a test framework for structuring and managing test cases.
- **ChromeDriver/FirefoxDriver**: WebDriver for controlling the Chrome or Firefox browsers.
- **Maven/Gradle (Optional)**: For dependency management and project build automation.

### Getting Started

To get started with this project, clone the repository to your local machine:

```bash
git clone https://github.com/your-username/automation-project.git
```

### Prerequisites

1. **JDK** 8 or above installed.
2. **Selenium WebDriver** set up in your project.
3. **ChromeDriver/FirefoxDriver** for browser automation.
4. **Maven/Gradle** (optional) for managing project dependencies.

### Running the Automation Scripts

To run the automation scripts, simply execute any of the Java files that correspond to a specific website.

For example, to run the **AirAsia flight booking automation**, execute the following:

```bash
javac AirAsia.java
java AirAsia
```

### Running Multiple Scripts in Parallel

To run scripts in parallel, use the `ParallelBrowser.java` class, which demonstrates running multiple WebDriver instances simultaneously.

```bash
javac ParallelBrowser.java
java ParallelBrowser
```

### Contributing

Feel free to fork this repository, create issues, or submit pull requests for improvements or additional features. If you're contributing new automation scripts, please ensure that they follow the structure of existing classes.

---
