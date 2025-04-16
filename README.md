# Automation Project

### Description

The **Automation Project** contains a collection of automation scripts designed to automate interactions with different websites and platforms using **Java** and **Selenium WebDriver**. This project demonstrates the application of browser automation to perform various tasks such as logging in, browsing, data entry, searching, and form submissions across several popular websites.

Each class file automates specific tasks on platforms such as **AirAsia**, **AirIndia**, **Instagram**, **Burger King**, **ICICI Bank**, **Myntra**, **Swiggy**, **Zomato**, **eBay**, **Google**, **OrangeHRM**, and more. These scripts can serve both as functional testing examples and real-world automation use cases like online shopping, banking, and food delivery.

---

## 🗂️ Class Files

- **AirAsia.java**: Automates flight booking on the **AirAsia** website.
- **AirIndia.java**: Automates flight booking on the **Air India** website.
- **BurgerKing.java**: Automates order placement on the **Burger King** website.
- **ICICIBANK.java**: Automates login and banking operations on **ICICI Bank's** online platform.
- **Instagram.java**: Automates login and interactions on **Instagram**.
- **Login.java**: A generalized class for automating login operations on various websites (acts as a template).
- **Myntraproject.java**: Automates browsing and shopping on **Myntra** (an online fashion store).
- **OLA.java**: Automates the booking of rides via the **OLA** app's website.
- **ParallelBrowser.java**: Runs multiple Selenium WebDriver instances in parallel for testing multiple sites simultaneously.
- **SWIGGy.java**: Automates food ordering tasks on **Swiggy** (a food delivery platform).
- **ZOMATO.java**: Automates food ordering tasks on **Zomato** (another food delivery platform).
- **ebay.java**: Automates product search and interactions on **eBay**.
- **openGoogle.java**: Opens the **Google** homepage and performs search operations.
- **orangeHRM.java**: Automates tasks on the **OrangeHRM** website (HR management platform).

---

## ✨ Features

- **Automated Web Interactions**: Automate tasks such as logging in, submitting forms, browsing products, adding items to the cart, and completing purchases.
- **Parallel Test Execution**: Run tests across multiple browsers or websites simultaneously for faster automation execution.
- **Data-driven Automation**: Use parameters such as user credentials, search keywords, and product details to automate repetitive tasks.
- **Web Scraping (Optional)**: Extract data from websites, such as product details, reviews, or search results.
- **Screenshots**: Capture screenshots during automation for error tracking, debugging, and reporting.
- **Error Handling**: Includes basic error handling mechanisms to catch and log failures during automation.

---

## 🛠️ Technologies Used

- **Java**: The primary programming language used to write the automation scripts.
- **Selenium WebDriver**: The tool used for automating browser interactions.
- **TestNG (Optional)**: Can be used for test management, organizing tests, and generating reports.
- **ChromeDriver / FirefoxDriver**: WebDriver for automating Chrome and Firefox browsers.
- **Maven / Gradle (Optional)**: For dependency management and project build automation.
- **JUnit (Optional)**: Can be used for running unit tests and assertions within the automation scripts.

---

## 🚀 Getting Started

To get started with this project, clone the repository to your local machine:

```bash
git clone https://github.com/your-username/automation-project.git
```

### Prerequisites

Before you can run the scripts, make sure you have the following installed:

1. **JDK 8** or above.
2. **Selenium WebDriver** set up in your project.
3. **ChromeDriver / FirefoxDriver** for automating browser interactions.
4. **Maven / Gradle** (optional) for managing dependencies and project setup.

---

## 🏃 Running the Automation Scripts

To run a specific automation script, follow these steps:

1. Navigate to the directory containing the script.
2. Compile and run the Java file:

For example, to run the **AirAsia** flight booking automation:

```bash
javac AirAsia.java
java AirAsia
```

This will execute the script and perform the automation steps on the AirAsia website.

---

## 🏃‍♀️ Running Multiple Scripts in Parallel

You can run automation scripts in parallel using the `ParallelBrowser.java` class. This allows you to test multiple websites at the same time, speeding up the execution of your tests.

To run multiple scripts in parallel, execute the following:

```bash
javac ParallelBrowser.java
java ParallelBrowser
```

This will trigger the execution of tests across multiple browsers or platforms simultaneously.

---

## 🤝 Contributing

Contributions are welcome! If you'd like to contribute to the **Automation Project**, you can follow these steps:

1. **Fork** the repository.
2. Create a **new branch** for your feature or bug fix.
3. **Implement** your changes.
4. **Commit** your changes and **push** them to your fork.
5. Create a **pull request** to have your changes merged into the main repository.

If you're adding new automation scripts, please ensure they follow the structure and organization of existing classes in the project.

---

## 📜 License

This project is licensed under the **MIT License**.

---

### Conclusion

The **Automation Project** offers a comprehensive set of automation scripts that can be used for functional testing or real-world scenarios like flight booking, food ordering, shopping, and banking. By utilizing **Java** and **Selenium WebDriver**, the project demonstrates how to automate web interactions efficiently across multiple platforms. With features like parallel execution and data-driven automation, it provides a scalable solution for automating various web-based tasks.

Feel free to contribute and enhance the project!

---
