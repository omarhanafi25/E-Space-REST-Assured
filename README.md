# 🧪 API Test Automation - OrangeHRM Candidate POST

This project is a simple API test automation example using:

- ✅ Java 21  
- ✅ Maven  
- ✅ TestNG  
- ✅ Rest Assured  
- ✅ Jackson (for JSON mapping)

It sends a `POST` request to the OrangeHRM public demo API to create a candidate and validates the status code.

---


## 🚀 How to Run

### ▶️ Option 1: Run Test Class from IDE

Open the project in IntelliJ or Eclipse and run the `PostCandidateTest` class directly.

---

### 💻 Option 2: Run from Terminal (Recommended)

From the project root directory, run:

```bash
mvn clean verify
```

This will compile the project and execute tests.

---

## 📄 Test Report

After running from terminal, a **TestNG report** will be generated in:

```
target/surefire-reports/
```

Check the `.txt` or `.xml` files inside the folder to see the result summary.

---

## 🌐 Target API

> POST https://opensource-demo.orangehrmlive.com/web/index.php/api/v2/recruitment/candidates

This is a public demo endpoint used for testing candidate creation in the OrangeHRM system.

---

## ✅ Author

**Omar Nabil**  
