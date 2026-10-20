# User Registration System with JUnit

## Overview
The User Registration System is a Java-based application designed to validate user input details during registration using Regular Expressions (Regex) and Test-Driven Development (TDD) principles powered by JUnit 5.

The application ensures data integrity and security by verifying that user attributes adhere to strict format specifications before accepting user records.

---

## Objectives
- Implement robust validation mechanisms using Java Regex for user registration fields.
- Adhere to the Git Branching Strategy:
  - `main`: Retains project documentation (`README.md`).
  - `develop`: Houses the core project structure and integrated code.
  - `feature/<uc-name>`: Dedicated feature branches for developing and testing each individual use case.
- Apply Unit Testing practices with JUnit 5, incorporating both Happy and Sad test cases as well as Parameterized Testing for email verification.

---

## Use Cases Covered

| Use Case | Description | Rules / Requirements |
| :--- | :--- | :--- |
| **UC 1** | First Name Validation | Starts with a capital letter and has a minimum of 3 characters (`^[A-Z][a-zA-Z]{2,}$`). |
| **UC 2** | Last Name Validation | Starts with a capital letter and has a minimum of 3 characters (`^[A-Z][a-zA-Z]{2,}$`). |
| **UC 3** | Email Validation | Matches mandatory components (`abc`, `bl`, `co`) and optional components (`xyz`, `in`) with precise `@` and `.` positions. |
| **UC 4** | Mobile Format Validation | Country code followed by space and 10-digit phone number (e.g., `91 9919819801`). |
| **UC 5** | Password Validation - Rule 1 | Password must contain a minimum of 8 characters. |
| **UC 6** | Password Validation - Rule 2 | Password must contain at least 1 uppercase character. |
| **UC 7** | Password Validation - Rule 3 | Password must contain at least 1 numeric character. |
| **UC 8** | Password Validation - Rule 4 | Password must contain exactly 1 special character. |
| **UC 9** | Email Samples Verification | Clears all valid email samples and rejects invalid email samples provided in the specification. |
| **UC 10** | Comprehensive JUnit Tests | Implements Happy (successful validation) and Sad (failed validation) JUnit test cases for all inputs. |
| **UC 11** | Parameterized Email Tests | Implements JUnit Parameterized Tests to validate multiple email entries dynamically. |

---

## Technologies Used
- **Language**: Java 22 / JDK 17+
- **Testing Framework**: JUnit Jupiter 5.10+
- **Build Tool**: Apache Maven
- **Version Control**: Git & GitHub
