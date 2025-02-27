# 🚀 API Automation Framework with RestAssured & TestNG

## 📌 Project Overview
This project is an **API test automation framework** built using:
- **RestAssured** for API testing
- **TestNG** for test execution
- **Maven** for dependency management
- **Assertions** to validate API responses

The framework tests REST APIs using `https://reqres.in`, covering:
1. **Create a User** (POST `/api/users`)
2. **Retrieve a User** (GET `/api/users/{id}`)
3. **Update a User** (PUT `/api/users/{id}`)
4. **Negative Test Cases** for error handling

---

## 💒 Project Structure

```
ApiAutomationProject
️│── src
️│   ├── main/java
️│   │   ├── utils
️│   │   │   └── ConfigManager.java   # Manages configuration properties
️│   ├── test/java
️│   │   ├── tests
️│   │   │   ├── BaseTest.java        # Setup base URL
️│   │   │   ├── CreateUserTest.java  # Test case for user creation
️│   │   │   ├── GetUserTest.java     # Test case for fetching user details
️│   │   │   ├── UpdateUserTest.java  # Test case for updating user
️│   │   │   ├── CreateUserErrorTest.java  # Negative test: Invalid user creation
️│   │   │   ├── GetUserErrorTest.java     # Negative test: Invalid user retrieval
️│   │   │   └── UpdateUserErrorTest.java  # Negative test: Invalid user update
️│   │   └── resources/data/config.properties  # Stores API base URL
️│── testng.xml  # TestNG configuration file
️│── pom.xml     # Maven dependencies
️│── README.md   # Project documentation
```

---

## ⚙️ **Setup & Installation**
### 1️⃣ **Clone the Repository**
```sh
git clone <your-github-repo-url>
cd ApiAutomationProject
```

### 2️⃣ **Install Dependencies**
Ensure you have **Java 17** and **Maven** installed. Then, run:
```sh
mvn clean install
```

### 3️⃣ **Run Tests**
#### ✅ Run All Tests
```sh
mvn test
```
#### ✅ Run Specific Tests
To run tests from `testng.xml`:
```sh
mvn test -DsuiteXmlFile=testng.xml
```

### 4️⃣ **View Test Reports**
TestNG generates reports in the `target/surefire-reports/` folder:
- **Report location:** `target/surefire-reports/index.html`
- Open in a browser:  
  ```sh
  open target/surefire-reports/index.html  # For Mac/Linux
  start target/surefire-reports/index.html # For Windows
  ```

---

## 🔍 **Configuration**
You can update the **Base URL** in `config.properties`:
```
base.url=https://reqres.in
```

---

## 📌 **Key Features**
✅ Structured test automation framework  
✅ Handles API requests & responses efficiently  
✅ Supports positive & negative test cases  
✅ Uses TestNG for parallel execution & reporting  
✅ Easily configurable via `config.properties`  

---

## 🤝 **Contributing**
1. Fork the repository  
2. Create a new branch (`feature-branch`)  
3. Commit your changes  
4. Push the branch & submit a **Pull Request**  

---

## 📝 **License**
This project is open-source and available for learning and modification.

---

## 💎 **Contact**
For questions or suggestions, reach out via:  
📧 Email: [mohamedderbala007@gmail.com]  
🔗 GitHub: [https://github.com/MohamedDerbala007]  

